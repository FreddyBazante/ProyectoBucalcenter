<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="es" class="com.ec.bucalcenter.modelo.Especialidad" scope="page" />
<jsp:useBean id="cx" class="com.ec.bucalcenter.modelo.Conectar" scope="page" />
<% String mensaje = ""; int msj;
if(request.getParameter("msj")!=null){
	msj = Integer.valueOf(request.getParameter("msj"));
	}else{
		msj=0;
	}
switch (msj){
 case 1: mensaje = "Se ha eliminado correctamente"; break;
 case 2: mensaje = "Hubo un problema al eliminar, contacte al administrador"; break;
 case 3: mensaje = "Los datos se han actualizado correctamente"; break;
 case 4: mensaje = "Hubo un problema al actualizar, contacte al administrador"; break;
 case 5: mensaje = "Datos registrados correctamente"; break;
 case 6: mensaje = "Hubo un problema al registrar, contacte al administrador"; break;
 default: break;
} 
String opc = request.getParameter("op"); if(opc==null){opc="";}
int id;
if(request.getParameter("id")==null){
	id=0;
}else{
	id = Integer.valueOf(request.getParameter("id"));
}
String nombreespecialidad = "";
es.setId_especialidad(id);
ResultSet rsp = es.buscar_especialidad(es);
while (rsp.next()){
	 id = rsp.getInt(1);
	 nombreespecialidad =  rsp.getString(2);
 }
cx.desconectar();
%> 


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ingreso Especialidad</title>
<link rel="stylesheet" href="css/estilo.css"/>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<article>
<div align="center">
	<label style="color:red;"><%=mensaje %></label>
	<form action="cEspecialidad" method="post">
	
	<fieldset>
				<legend>Especialidades</legend>	
		<table>
			<tr>
				<td>Ingrese la Especialidad:</td>
				<td><input type="text" name="f_especialidad" value="<%=nombreespecialidad %>" required></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<%if(opc.equals("up")){ %>
						<input type="hidden" name="id" value="<%=id%>">
						<input type="hidden" name="opc" value="up">				
						<input type="submit" name="update" value="Actualizar" onclick="return confirm('Esta seguro de guardar los cambios?')">
					<%}else{ %>	
						<input type="hidden" name="opc" value="in">
						<input type="submit" name="guardar" value="Guardar" onclick="return confirm('Esta seguro de guardar el registro?')">
					<%} %>
				</td>
			</tr>
		</table>
	</fieldset>
	
	</form>
	<hr>
	<jsp:include page="ListarEspecialidad.jsp" flush="true"/>
	</div>	
	</article>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
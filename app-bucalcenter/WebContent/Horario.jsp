<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="h" class="com.ec.bucalcenter.modelo.Horario" scope="page" />
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
String horainicio = "";
String horafin = "";
String lunes = "";
String martes = "";
String miercoles = "";
String jueves = "";
String viernes = "";

h.setId_horario(id);
ResultSet rsp = h.buscar_horario(h);
while (rsp.next()){
	 id = rsp.getInt(1);
	 horainicio =  rsp.getString(2);
	 horafin = rsp.getString(3);	 
	 lunes = rsp.getString(4);
	 martes = rsp.getString(5);
	 miercoles = rsp.getString(6);
	 jueves = rsp.getString(7);
	 viernes = rsp.getString(8);
	 
}
cx.desconectar();
%> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Horario</title>
<link rel="stylesheet" href="css/estilo.css"/>

</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<article>
<div align="center">
<label style="color:red;"><%=mensaje %></label>
<form action="cHorario" method="post">
	
	<fieldset>
				<legend>Horarios</legend>	
		<table>
			<tr>
				<td>Hora inicio</td>
				<td>Hora fin</td>
				<td>Lunes</td>
				<td>Martes</td>
				<td>Miércoles</td>
				<td>Jueves</td>
				<td>Viernes</td>
			</tr>
			<tr>
				<td><input type="time" name="f_horainicio" value="<%=horainicio %>"></td>
				<td><input type="time" name="f_horafin" value="<%=horafin %>"></td>
				<td><input type="time" name="f_horaLunes" value="<%=lunes %>"></td>
				<td><input type="time" name="f_horaMartes" value="<%=martes %>"></td>
				<td><input type="time" name="f_horaMiercoles" value="<%=miercoles %>"></td>
				<td><input type="time" name="f_horaJueves" value="<%=jueves %>"></td>
				<td><input type="time" name="f_horaViernes" value="<%=viernes %>"></td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<%if(opc.equals("up")){ %>
						<input type="hidden" name="id" value="<%=id%>">
						<input type="hidden" name="opc" value="up">				
						<input type="submit" name="update" value="Actualizar" onclick="return confirm('Esta seguro de guardar los cambios?')">
					<%}else{ %>	
						<input type="hidden" name="opc" value="in">
						<input type="submit" name="guardar" value="Registrar" onclick="return confirm('Esta seguro de guardar el registro?')">
					<%} %>
				</td>
			</tr>
		</table>
	</fieldset>
		
	</form>
	<hr>
	<jsp:include page="ListarHorario.jsp" flush="true"/>
	</div>
	</article>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
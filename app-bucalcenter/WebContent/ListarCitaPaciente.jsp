<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<jsp:useBean id="c" class="com.ec.bucalcenter.modelo.Cita" scope="page"/>
<jsp:useBean id="cp" class="com.ec.bucalcenter.modelo.Paciente" scope="page"></jsp:useBean>
<jsp:useBean id="cx" class="com.ec.bucalcenter.modelo.Conectar" scope="page"/>
<%
	HttpSession sesionOK=request.getSession();
 %>

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
String valor=String.valueOf(sesionOK.getAttribute("iduser"));
int idpaciente=Integer.parseInt(valor);
System.out.println(idpaciente);
c.setId_paciente(idpaciente);
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Ver Cita</title>
<link rel="stylesheet" href="css/estilo.css"/>
</head>
<body>
<jsp:include page="headerpaciente.jsp"></jsp:include>
<article>
<div>
<label style="color:red;"><%=mensaje %></label>
<table>
	<tr>
		<th>NUMERO</th>
		<th>ID USUARIO</th>
		<th>ID ODONTOLOGO</th>
		<th>FECHA</th>
		<th>HORA</th>
		<th>ESTADO</th>
		<th>OPCIONES</th>
	</tr>
	<%	int i=1;
		ResultSet rs=c.listar_Cita_paciente(c);
		
		while(rs.next()){
	%>
	<tr>
		<th><%=rs.getString("ID_CITA")%></th>
		<th><%=rs.getString("ID_USR") %></th>
		<th><%=rs.getString("ODO_ID_USR") %></th>
		<th><%=rs.getString("FECHA_CITA") %></th>
		<th><%=rs.getString("HORA_CITA") %></th>
		<th><%=rs.getString("ESTADO_CITA") %></th>
		<th><a href="cCita?op=del&id=<%=rs.getString("ID_CITA") %>">[Anular Cita]</a></th>
	</tr>
	<%i++;}
		cx.desconectar();
		
	%>
</table>
</div>
	</article>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
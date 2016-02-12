<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
<%
	HttpSession sesionOK=request.getSession();
 %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sistema Bucal Center</title>
<link rel="stylesheet" href="css/estilo.css"/>
</head>
<body>
<article>
<nav>
	<fieldset>
	<legend>Accesos</legend>
	
		<ul>
			<li><a href="Horario.jsp">Horario</a></li>
			<li><a href="Especialidad.jsp">Especialidades</a></li>
			<li><a href="Administrador.jsp">Administrador</a></li>
			<li><a href="Odontologo.jsp">Odontólogo</a></li>
			<li><a href="Paciente.jsp">Paciente</a></li>
			<li><a href="cerrarsesion.jsp">Cerrar Sesión</a></li>
		</ul>
		ID USUARIO:<%=sesionOK.getAttribute("iduser") %><br>
		TIPO:<%=sesionOK.getAttribute("tipo") %><br>
		NOMBRE DE USUARIO:<%=sesionOK.getAttribute("usuario") %><br>
		NOMBRE:<%=sesionOK.getAttribute("usuario2") %><br>
		ESTADO:<%=sesionOK.getAttribute("estado") %><br>
		DIRECCIÓN IP:<%=sesionOK.getAttribute("ip") %><br>
	
	</fieldset>
</nav>
</article>
</body>
</html>
<%@page import="java.sql.ResultSet"%>


<jsp:useBean id="c" class="com.ec.bucalcenter.modelo.Cita" scope="page"/>
<jsp:useBean id="cx" class="com.ec.bucalcenter.modelo.Conectar" scope="page"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Menu Odontólogo</title>
<link rel="stylesheet" href="css/estilo.css"/>
</head>
<body>
<jsp:include page="headerodontologo.jsp"></jsp:include>
<article>
<div>
<table>
	<tr>
		<th>NUMERO</th>
		<th>NOMBRE ODONTOLOGO</th>
		<th>APELLIDO ODONTOLOGO</th>
		<th>NOMBRE PACIENTE</th>
		<th>APELLIDO PACIENTE</th>
		<th>FECHA</th>
		<th>HORA</th>
		<th>ESTADO</th>
		<th>OPCIONES</th>
	</tr>
	<%	int i=1;
		ResultSet rs=c.listar_Cita_odontologo();
		while(rs.next()){
	%>
	<tr>
		<th><%=rs.getString("ID_CITA") %></th>
		<th><%=rs.getString("odontologo.NOMBRE1_USR") %></th>
		<th><%=rs.getString("odontologo.APELLIDO1_USR") %></th>
		<th><%=rs.getString("paciente.NOMBRE1_USR") %></th>
		<th><%=rs.getString("paciente.APELLIDO1_USR") %></th>
		<th><%=rs.getString("FECHA_CITA") %></th>
		<th><%=rs.getString("HORA_CITA") %></th>
		<th><%=rs.getString("ESTADO_CITA") %></th>
		<th>[Eliminar]</th>
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
<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="c" class="com.ec.bucalcenter.modelo.Cita" scope="page"/>
<jsp:useBean id="cx" class="com.ec.bucalcenter.modelo.Conectar" scope="page"/>
	
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
		<th><%=rs.getString("cita.ID_CITA") %></th>
		<th><%=rs.getString("odontologo.NOMBRE1_USR") %></th>
		<th><%=rs.getString("odontologo.APELLIDO1_USR") %></th>
		<th><%=rs.getString("paciente.NOMBRE1_USR") %></th>
		<th><%=rs.getString("paciente.APELLIDO1_USR") %></th>
		<th><%=rs.getString("FECHA_CITA") %></th>
		<th><%=rs.getString("HORA_CITA") %></th>
		<th><%=rs.getString("ESTADO_CITA") %></th>
		<th><a href="?op=up&id=<%=rs.getString(1)%>">[Reagendar]</a></th>
	</tr>
	<%i++;}
		cx.desconectar();
		
	%>
</table>
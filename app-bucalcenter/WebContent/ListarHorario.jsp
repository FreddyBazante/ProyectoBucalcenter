<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="h" class="com.ec.bucalcenter.modelo.Horario"/>
<jsp:useBean id="cx" class="com.ec.bucalcenter.modelo.Conectar"/>
<table>
	<tr>
		<th>NUMERO</th>
		<th>HORA INICIO</th>
		<th>HORA FIN</th>
		<th>LUNES</th>
		<th>MARTES</th>
		<th>MIERCOLES</th>
		<th>JUEVES</th>
		<th>VIERNES</th>
		<th>OPCIONES</th>
	</tr>
	<%	int i=1;
		ResultSet rs=h.listar_horario();
		while(rs.next()){
	%>
	<tr>
		<th><%=i %></th>
		<th><%=rs.getString("HORAINICIO_HORARIO") %></th>
		<th><%=rs.getString("HORAFIN_HORARIO") %></th>
		<th><%=rs.getString("LUNES_HORARIO") %></th>
		<th><%=rs.getString("MARTES_HORARIO") %></th>
		<th><%=rs.getString("MIERCOLES_HORARIO") %></th>
		<th><%=rs.getString("JUEVES_HORARIO") %></th>
		<th><%=rs.getString("VIERNES_HORARIO") %></th>
		<th><a href="?op=up&id=<%=rs.getString("ID_HORARIO")%>">[Editar]</a> 
			<a href="cHorario?op=del&id=<%=rs.getString("ID_HORARIO")%>">[Eliminar]</a></th>
	</tr>
<% i++;} %>
</table>
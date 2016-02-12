<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="es" class="com.ec.bucalcenter.modelo.Especialidad"/>
<jsp:useBean id="cx" class="com.ec.bucalcenter.modelo.Conectar"/>
<table>
	<tr>
		<th>NUMERO</th>
		<th>NOMBRE ESPECIALIDAD</th>
		<th>OPCIONES</th>
	</tr>
	<%	int i=1;
		ResultSet rs=es.listar_especialidad();
		while(rs.next()){
	%>
	<tr>
		<th><%=i %></th>
		<th><%=rs.getString("NOMBRE_ESPECIALIDAD") %></th>
		<th><a href="?op=up&id=<%=rs.getString("ID_ESPECIALIDAD")%>">[Editar]</a> 
			<a href="cEspecialidad?op=del&id=<%=rs.getString("ID_ESPECIALIDAD")%>">[Eliminar]</a></th>
	</tr>
<% i++;} 
		cx.desconectar();
%>
</table>
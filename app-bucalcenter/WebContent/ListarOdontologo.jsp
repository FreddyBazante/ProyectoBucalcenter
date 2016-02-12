<%@page import="java.sql.ResultSet"%>
<jsp:useBean id="d" class="com.ec.bucalcenter.modelo.Odontologo" scope="page"/>
<jsp:useBean id="cx" class="com.ec.bucalcenter.modelo.Conectar" scope="page"/>
<table>
	<tr>
		<th>NUMERO</th>
		<th>HORARIO</th>
		<th>ESPECIALIDAD</th>
		<th>MODO</th>
		<th>USUARIO</th>
		<th>CONTRASEÑA</th>
		<th>PRIMER NOMBRE</th>
		<th>SEGUNDO NOMBRE</th>
		<th>PRIMER APELLIDO</th>
		<th>SEGUNDO APELLIDO</th>
		<th>CEDULA DE IDENTIDAD</th>
		<th>FECHA DE NACIMIENTO</th>
		<th>LUGAR DE NACIMIENTO</th>
		<th>DIRECCION</th>
		<th>TELEFONO DOMICILIO</th>
		<th>TELEFONO CELULAR</th>
		<th>EDAD</th>
		<th>GENERO</th>
		<th>CORREO</th>
		<th>ESTADO CIVIL</th>
		<th>ESTADO</th>
		<th>HORA ENTRADA</th>
		<th>HORA SALIDA</th>
		<th>CITAS MAXIMAS</th>
		<th>OPCIONES</th>
	</tr>
	<%	int i=1;
		ResultSet rs=d.listar_odontologo();
		while(rs.next()){
	%>
	<tr>
		<th><%=i %></th>
		<th><%=rs.getString("ID_HORARIO") %></th>
		<th><%=rs.getString("ID_ESPECIALIDAD") %></th>
		<th><%=rs.getString("TIPO_USR") %></th>
		<th><%=rs.getString("NOMRE_USR") %></th>
		<th><%=rs.getString("PASSWORD_USR") %></th>
		<th><%=rs.getString("NOMBRE1_USR") %></th>
		<th><%=rs.getString("NOMBRE2_USR") %></th>
		<th><%=rs.getString("APELLIDO1_USR") %></th>
		<th><%=rs.getString("APELLIDO2_USR") %></th>
		<th><%=rs.getString("CEDULA_USR") %></th>
		<th><%=rs.getString("FECNAC_USR") %></th>
		<th><%=rs.getString("LUGARNAC_USR") %></th>
		<th><%=rs.getString("DIRECCION_USR") %></th>
		<th><%=rs.getString("TELFDOM_USR") %></th>
		<th><%=rs.getString("TELFCEL_USR") %></th>
		<th><%=rs.getString("EDAD_USR") %></th>
		<th><%=rs.getString("SEXO_USR") %></th>
		<th><%=rs.getString("CORREOE_USR") %></th>
		<th><%=rs.getString("ESTADOCIVIL_USR") %></th>
		<th><%=rs.getString("ESTADO_USR") %></th>
		<th><%=rs.getString("HORAENTRADA_ODONTOLOGO") %></th>
		<th><%=rs.getString("HORASALIDA_ODONTOLOGO") %></th>
		<th><%=rs.getString("CITAMAXIMA_ODONTOLOGO") %></th>
		<th><a href="?op=up&id=<%=rs.getString("ID_USR")%>">[Editar]</a> 
			<a href="cOdontologo?op=del&id=<%=rs.getString("ID_USR")%>">[Eliminar]</a></th>
	</tr>
	<% i++;} %>
</table>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" session="true"%>
    <%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%
	HttpSession sesionOK=request.getSession();
	String valor=String.valueOf(sesionOK.getAttribute("iduser"));
	int idpaciente=Integer.parseInt(valor);
 %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Agendar Cita</title>
<link rel="stylesheet" href="css/estilo.css"/>
</head>
<body>
<jsp:include page="headerpaciente.jsp"></jsp:include>
<article>
<div>
<form action="cCita" method="post">
	<div align="center">
	<jsp:useBean id="co" class="com.ec.bucalcenter.modelo.Odontologo" scope="page"></jsp:useBean>
	<jsp:useBean id="cp" class="com.ec.bucalcenter.modelo.Paciente" scope="page"></jsp:useBean>
	<fieldset>
	<legend>REGISTRAR CITA</legend>
		<table>
			<tr>
				<td>ID Paciente:</td>
				<td>
					<%ResultSet rp=cp.listar_paciente(); %>
					<input type="text" name="f_id" id="f_id" value="<%=idpaciente %>"/> 
				</td>
				<td>Odontólogo:</td>
				<td>
					<%ResultSet rc=co.listar_odontologo(); %>
					<select name="f_odontologo" id="f_odontologo">
						<option value="" >--seleccione--</option>
						<% while (rc.next()){ %>
							<option value="<%=rc.getString("ID_USR")%>">
							<%=rc.getString("NOMBRE1_USR") %> <%=rc.getString("APELLIDO1_USR") %> </option>
						<%} %>
					</select>
				</td>
			</tr>
			<tr>
				<td>Fecha Cita:</td>
				<td><input type="date" name="f_fecha_cita" id="f_fecha_cita"/></td>
				<td>Hora Cita:</td>
				<td><input type="time" name="f_hora" id="f_hora"/> </td>
			</tr>
			
			<tr >
				<td colspan="4" align="center">
					<input type="hidden" name="opc" value="in">
					<input type="submit" name="guardar" value="Registrar Cita">
				</td>
			</tr>
			
		</table>
		</fieldset>
	</div>	
	<div align="center">
	<fieldset>
	<legend>HORARIOS DE ODONTÓLOGOS</legend>
	<label style="color:red;">Por favor revise los horarios antes de escoger su cita. El horario está segun el orden de cada odontologo</label>
	<table>
		<tr>
				
				<th>HORA ENTRADA</th>
				<th>HORA SALIDA</th>
				<th>LUNES</th>
				<th>MARTES</th>
				<th>MIERCOLES</th>
				<th>JUEVES</th>
				<th>VIERNES</th>
			</tr>
				<%	int i=1;
					ResultSet rs=co.listar_horario_odontologo();
					while(rs.next()){
				%>
			<tr>
				<th><%=rs.getString("HORAINICIO_HORARIO") %></th>
				<th><%=rs.getString("HORAFIN_HORARIO") %></th>
				<th><%=rs.getString("LUNES_HORARIO") %></th>
				<th><%=rs.getString("MARTES_HORARIO") %></th>
				<th><%=rs.getString("MIERCOLES_HORARIO") %></th>
				<th><%=rs.getString("JUEVES_HORARIO") %></th>
				<th><%=rs.getString("VIERNES_HORARIO") %></th>
			</tr>
			<% i++;} %>
	</table>
	</fieldset>
	</div>
	</form>
	</div>
	</article>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
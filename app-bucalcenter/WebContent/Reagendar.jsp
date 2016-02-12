<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	HttpSession sesionOK=request.getSession();
 %>
<jsp:useBean id="co" class="com.ec.bucalcenter.modelo.Odontologo" scope="page"></jsp:useBean>
<jsp:useBean id="cp" class="com.ec.bucalcenter.modelo.Paciente" scope="page"></jsp:useBean>
<jsp:useBean id="cit" class="com.ec.bucalcenter.modelo.Cita" scope="page"></jsp:useBean>
<jsp:useBean id="cx" class="com.ec.bucalcenter.modelo.Conectar" scope="page"/>
<% String mensaje = ""; 
	int msj;
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
	String idusuario= "";
	String idodontologo = "";
	String fechacita = "";
	String horacita = "";
	String estado = "";
	cit.setId_cita(id);
	ResultSet rsp = cit.buscar_Cita(cit);
	 while (rsp.next()){
		 id = rsp.getInt(1);
		 idusuario =  rsp.getString(2);
		 idodontologo  = rsp.getString(3);	 
		 fechacita= rsp.getString(4);
		 horacita = rsp.getString(5);
		 estado = rsp.getString(6);
	 }
	 cx.desconectar();
%> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reagendar Cita</title>
<link rel="stylesheet" href="css/estilo.css"/>
</head>
<body>
<jsp:include page="headerodontologo.jsp"></jsp:include>
<article>
	<div>
		<form action="cCita" method="post">
			<div align="center">
				<fieldset>
					<legend>REAGENDAR CITAS</legend>
					<table>
						<tr>
							<td>ID Cita:</td>
							<td>
								<input type="text" name="f_idcita" value="<%=id %>"/> 
							</td>
							<td>ID Paciente:</td>
							<td>
								<input type="text" name="f_id" value="<%=idusuario %>"/> 
							</td>
							<td>Odontólogo:</td>
							<td>
								<%ResultSet rc=co.listar_odontologo(); %>
								<select name="f_odontologo">
									<% while (rc.next()){ %>
										<option value="<%=rc.getString("ID_USR")%>" <%if(idodontologo.equals(rc.getString("ID_USR"))){%>selected="selected"<%} %>>
											<%=rc.getString("NOMBRE1_USR") %> <%=rc.getString("APELLIDO1_USR") %> </option>
									<%} %>
								</select>
							</td>
							<td>Estado:</td>
							<td align="left">
								<input type="radio" name="f_estado" value="ACTIVA" <%if(estado.equals("ACTIVA")){%>checked="checked"<%} %> required="required"/> Activo <br/>
								<input type="radio" name="f_estado" value="INACTIVA" <%if(estado.equals("INACTIVA")){%>checked="checked"<%} %>  required="required"/> Inactivo
							</td>
						</tr>
						<tr>
							<td>Fecha Cita:</td>
							<td><input type="date" name="f_fecha_cita" value="<%=fechacita %>"/></td>
							<td>Hora Cita:</td>
							<td><input type="time" name="f_hora" value="<%=horacita %>"/> </td>
						</tr>
						<tr >
							<td colspan="6" align="center">
								<%if(opc.equals("up")){ %>
									<input type="hidden" name="id" value="<%=id%>">
									<input type="hidden" name="opc" value="up">				
									<input type="submit" name="update" value="Actualizar">
								<%}else{ %>	
									<input type="hidden" name="opc" value="in">
									<input type="submit" name="guardar" value="Registrar">
								<%} %>
							</td>
						</tr>
					</table>
				</fieldset>
			</div>	
		</form>
		<hr>
		<jsp:include page="ListarCitaOdontologo.jsp" flush="true"/>
	</div>
</article>
<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
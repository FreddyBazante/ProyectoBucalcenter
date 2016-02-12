<%@page import="java.sql.ResultSet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="p" class="com.ec.bucalcenter.modelo.Paciente" scope="page" />
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
String nombreusuario = "";
String password1 = "";
String password2 = "";
String nombre1 = "";
String nombre2 = "";
String apellido1 = "";
String apellido2 = "";
String cedula = "";
String fechanacimiento = "";
String lugarnacimiento = "";
String direccion = "";
String telfdomicilio = "";
String telfcelular = "";
String edad = "";
String genero = "";
String correo = "";
String estadocivil = "";
String ocupacion = "";
String estado = "";
p.setId_paciente(id);
ResultSet rsp = p.buscar_paciente(p);
while (rsp.next()){
	 id = rsp.getInt(1);
	 nombreusuario =  rsp.getString(3);
	 password1 = rsp.getString(4);	 
	 password2 = rsp.getString(5);
	 nombre1 = rsp.getString(6);
	 nombre2 = rsp.getString(7);
	 apellido1 = rsp.getString(8);
	 apellido2 = rsp.getString(9);
	 cedula = rsp.getString(10);
	 fechanacimiento = rsp.getString(11);
	 lugarnacimiento = rsp.getString(12);
	 direccion = rsp.getString(13);
	 telfdomicilio = rsp.getString(14);
	 telfcelular = rsp.getString(15);
	 edad = rsp.getString(16);
	 genero = rsp.getString(17);
	 correo = rsp.getString(18);
	 estadocivil = rsp.getString(19);
	 ocupacion = rsp.getString(20);
	 estado = rsp.getString(21);
}
cx.desconectar();
%> 

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Mantenimiento Paciente</title>
<script src="js/Paciente/paciente.js"></script>
<link rel="stylesheet" href="css/estilo.css"/>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<article>
<div align="center">
	<label style="color:red;"><%=mensaje %></label>
	<form action="cPaciente" method="post" id="formulario_paciente" onSubmit="return validarPasswd()">
	<fieldset>
				<legend>Paciente</legend>
		<table>
			<tr>
				<td>Modo:</td>
				<td>
					<select name="f_modo">
						<option value="P" >PACIENTE </option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Nombre de Usuario:*</td>
				<td><input type="text" name="f_user" value="<%=nombreusuario %>" required></td>
			</tr>
			<tr>
				<td>Contraseña:*</td>
				<td><input type="password" name="f_password1" id="f_password1" value="<%=password1 %>"  required></td>
			</tr>
			<tr>
				<td>Confirmar contraseña:*</td>
				<td><input type="password" name="f_password2"  id="f_password2" value="<%=password2 %>" required></td>
			</tr>
			<tr>
				<td>Primer Nombre:*</td>
				<td><input type="text" name="f_nombre1" value="<%=nombre1 %>" required></td>
			</tr>
			<tr>
				<td>Segundo Nombre:</td>
				<td><input type="text" name="f_nombre2" value="<%=nombre2 %>"></td>
			</tr>
			<tr>
				<td>Primer Apellido:*</td>
				<td><input type="text" name="f_apellido1" value="<%=apellido1 %>" required></td>
			</tr>
			<tr>
				<td>Segundo Apellido:</td>
				<td><input type="text" name="f_apellido2" value="<%=apellido2 %>"></td>
			</tr>
			<tr>
				<td>Cedula de identidad:*</td>
				<td><input type="text" name="f_ci" value="<%=cedula %>" required></td>
			</tr>
			<tr>
				<td>Fecha de nacimiento:</td>
				<td><input type="date" name="f_fecha_nac" value="<%=fechanacimiento %>"/></td>
			</tr>
			<tr>
				<td>Lugar de nacimiento:</td>
				<td><input type="text" name="f_lugar_nac" value="<%=lugarnacimiento %>"></td>
			</tr>
			<tr>
				<td>Dirección:</td>
				<td><input type="text" name="f_direccion" value="<%=direccion %>"></td>
			</tr>
			<tr>
				<td>Teléfono Domicilio:*</td>
				<td><input type="text" name="f_fono_dom" value="<%=telfdomicilio %>"  required></td>
			</tr>
			<tr>
				<td>Teléfono Celular:</td>
				<td><input type="text" name="f_fono_cel" value="<%=telfcelular %>"></td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td><input type="number" name="f_edad" value="<%=edad %>"></td>
			</tr>
			<tr>
				<td>Género:</td>
				<td>
					<select name="f_genero">
						<option value="M" <%if(genero.equals("M")){%>selected="selected"<%} %> >MASCULINO</option>
						<option value="F" <%if(genero.equals("F")){%>selected="selected"<%} %>>FEMENINO</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Correo electrónico:*</td>
				<td><input type="email" name="f_correo_e" value="<%=correo %>" required></td>
			</tr>
			<tr>
				<td>Estado Civil:</td>
				<td>
					<select name="f_estado_civ">
						<option value="SOLTERO" <%if(estadocivil.equals("SOLTERO")){%>selected="selected"<%} %>>SOLTERO</option>
						<option value="CASADO" <%if(estadocivil.equals("CASADO")){%>selected="selected"<%} %>>CASADO</option>
						<option value="VIUDO" <%if(estadocivil.equals("VIUDO")){%>selected="selected"<%} %>>VIUDO</option>
						<option value="DIVORCIADO" <%if(estadocivil.equals("DIVORCIADO")){%>selected="selected"<%} %>>DIVORCIADO</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Ocupación:</td>
				<td>
					<select name="f_ocupacion">
						<option value="INGENIERIA" <%if(ocupacion.equals("INGENIERIA")){%>selected="selected"<%} %>>INGENIERIA</option>
						<option value="INVESTIGACION" <%if(ocupacion.equals("INVESTIGACION")){%>selected="selected"<%} %>>INVESTIGACION</option>
						<option value="ESTUDIANTE" <%if(ocupacion.equals("ESTUDIANTE")){%>selected="selected"<%} %>>ESTUDIANTE</option>
						<option value="ODONTOLOGO" <%if(ocupacion.equals("ODONTOLOGO")){%>selected="selected"<%} %>>ODONTÓLOGO</option>
						<option value="OTROS" <%if(ocupacion.equals("OTROS")){%>selected="selected"<%} %>>OTROS</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Estado:</td>
				<td>
					<input type="radio" name="Estado" value="1" <%if(estado.equals("1")){%>checked="checked"<%} %>/>Activo<br>
					<input type="radio" name="Estado" value="0" <%if(estado.equals("0")){%>checked="checked"<%} %>/>Inactivo</td>
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
	<jsp:include page="ListarPaciente.jsp" flush="true"/>
	</div>	
	</article>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
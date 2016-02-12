<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% String msj =request.getParameter("error"); 
	if(msj==null){
		msj="";
	}else{
		if(msj.equals("v")){
			msj="Datos incorrectos. Por favor intente de nuevo. <br> Contacte con el administrador";
		}else{
			msj="Acceso solo a personas Autorizadas";
		}
	}
		
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Acceso al Sistema</title>
<link rel="stylesheet" href="css/estilo.css"/>
</head>
<body>
<div align="center">
<table>
		<tr>
			<td colspan="3" align="center"><img align="middle" alt="bucalcenter" src="images/bucalcenter.png" width="100px"></td>
		</tr>
		<tr>
			<td style="width: 197px; "><img align="left" alt="EPN" src="images/EPN.png" width="100px"></td>
			<td style="width: 262px; " align="center"> <p>BUCALCENTER</p>
				<img alt="USUARIO" src="images/usuario.png" width="40px">
			</td>
			<td style="width: 197px; "><img align="right" alt="FIS" src="images/fis.png" width="70px"></td>
		</tr>
	</table>
</div>
	<div align="center">
	<label style="color: red"><b><%=msj %></b></label>
		<form action="cLogin" method="post">
		<fieldset style="width: 30%">
	<legend>BUCALCENTER</legend>
	<label>
	Bienvenidos al <b>Sistema Bucalcenter</b> Esta área es retringida solo a personal autorizado, proceda a ingresar su nombre
			de usuario y su password.
	</label>
			<fieldset>
				<legend>Datos de Acceso</legend>
				<table>
					<tr>
						<td>Modo: </td>
						<td><select name="f_modo_login">
								<option value="A" >ADMINISTRADOR </option>
								<option value="O" >ODONTÓLOGO </option>
								<option value="P" >PACIENTE </option>
							</select>
						</td>
					</tr>
					<tr>
						<td>Usuario: </td>
						<td><input type="text" name="f_user" placeholder="Ingrese su usuario" size="20" required/></td>
					</tr>
					<tr>
						<td>Contraseña: </td>
						<td><input type="password" name="fpassw" placeholder="Ingrese su contraseña" size="20" required/></td>
					</tr>
					<tr>
						<td colspan="2" align="center">
							<input type="submit" name="opc" value="Ingresar"/>
						</td>
					</tr>
					<tr>
						<td colspan="2" align="center"><p><a href="PacienteCorreo.jsp">Registrarse</a></p></td>
					</tr>
				</table>
			</fieldset>
		</fieldset>
		</form>
	</div>
</body>
</html>
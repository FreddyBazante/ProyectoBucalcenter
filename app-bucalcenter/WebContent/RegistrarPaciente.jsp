<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registrar Paciente</title>
<script src="js/Paciente/paciente.js"></script>
<link rel="stylesheet" href="css/estilo.css"/>
</head>
<body>

<form action="cRegistrarPaciente" method="post" id="formulario_registrar_paciente" onSubmit="return validarPasswd()">
	
	<div align="center">
	<table>
		<tr>
			<td colspan="3" align="center"><img align="middle" alt="bucalcenter" src="images/bucalcenter.png" width="100px"></td>
		</tr>
		<tr>
			<td style="width: 197px; "><img align="left" alt="EPN" src="images/EPN.png" width="100px"></td>
			<td style="width: 262px; " align="center"> <p>BUCALCENTER</p>
			</td>
			<td style="width: 197px; "><img align="right" alt="FIS" src="images/fis.png" width="70px"></td>
		</tr>
	</table>
	</div>
	<fieldset>
				<legend>Paciente</legend>
	<div align="center">
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
				<td>Nombre de Usuario:</td>
				<td><input type="text" name="f_user"  required></td>
			</tr>
			<tr>
				<td>Contraseña:</td>
				<td><input type="password" name="f_password1"  id="f_password1" required></td>
			</tr>
			<tr>
				<td>Confirmar contraseña:</td>
				<td><input type="password" name="f_password2"  id="f_password2" required></td>
			</tr>
			<tr>
				<td>Primer Nombre:</td>
				<td><input type="text" name="f_nombre1" required></td>
			</tr>
			<tr>
				<td>Segundo Nombre:</td>
				<td><input type="text" name="f_nombre2"></td>
			</tr>
			<tr>
				<td>Primer Apellido:</td>
				<td><input type="text" name="f_apellido1" required></td>
			</tr>
			<tr>
				<td>Segundo Apellido:</td>
				<td><input type="text" name="f_apellido2"></td>
			</tr>
			<tr>
				<td>Cedula de identidad:</td>
				<td><input type="text" name="f_ci" required></td>
			</tr>
			<tr>
				<td>Fecha de nacimiento:</td>
				<td><input type="date" name="f_fecha_nac"/></td>
			</tr>
			<tr>
				<td>Lugar de nacimiento:</td>
				<td><input type="text" name="f_lugar_nac"></td>
			</tr>
			<tr>
				<td>Dirección:</td>
				<td><input type="text" name="f_direccion"></td>
			</tr>
			<tr>
				<td>Teléfono Domicilio:</td>
				<td><input type="text" name="f_fono_dom" required></td>
			</tr>
			<tr>
				<td>Teléfono Celular:</td>
				<td><input type="text" name="f_fono_cel"></td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td><input type="number" name="f_edad"></td>
			</tr>
			<tr>
				<td>Género:</td>
				<td>
					<select name="f_genero">
						<option value="M" >MASCULINO</option>
						<option value="F" >FEMENINO</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Correo electrónico</td>
				<td><input type="email" name="f_correo_e" required></td>
			</tr>
			<tr>
				<td>Estado Civil:</td>
				<td>
					<select name="f_estado_civ">
						<option value="SOLTERO">SOLTERO</option>
						<option value="CASADO">CASADO</option>
						<option value="VIUDO">VIUDO</option>
						<option value="DIVORCIADO">DIVORCIADO</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Ocupación:</td>
				<td>
					<select name="f_ocupacion">
						<option value="INGENIERIA">INGENIERIA</option>
						<option value="INVESTIGACION">INVESTIGACION</option>
						<option value="ESTUDIANTE">ESTUDIANTE</option>
						<option value="ODONTOLOGIA">ODONTOLOGÍA</option>
						<option value="OTROS">OTROS</option>
					</select>
				</td>
			</tr>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" name="guardar" value="Registrar" onclick="return confirm('Esta seguro de guardar el registro?')">
				</td>
			</tr>
		</table>
	</div>	
	</fieldset>
	</form>
</body>
</html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.util.*, javax.mail.*, javax.mail.internet.*" %>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>

<html>
    <head>
    	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro Pacientes</title>
        <link rel="stylesheet" href="css/estilo.css"/>
    </head>
    <body>
        <%

        if (request.getMethod().equals("POST")) {

            Connection conn = null;
            Statement stm = null;

            String User = request.getParameter("f_user");
            String Pass1 = request.getParameter("f_password1");
            String Pass2 = request.getParameter("f_password2");
            String tipo=request.getParameter("f_modo");
            String nombre1 = request.getParameter("f_nombre1");
            String nombre2 = request.getParameter("f_nombre2");
            String apellido1 = request.getParameter("f_apellido1");
            String apellido2 = request.getParameter("f_apellido2");
            String cedula = request.getParameter("f_ci");
            String fechanacimiento = request.getParameter("f_fecha_nac");
            String lugarnacimiento = request.getParameter("f_lugar_nac");
            String direccion = request.getParameter("f_direccion");
            String telfdomicilio = request.getParameter("f_fono_dom");
            String telfcelular = request.getParameter("f_fono_cel");
            String edad = request.getParameter("f_edad");
            String genero = request.getParameter("f_genero");
            String Email = request.getParameter("f_correo_e");
            String estadocivil = request.getParameter("f_estado_civ");
            String ocupacion = request.getParameter("f_ocupacion");
            String estado = "1";

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:mysql://localhost/bucalcenter", "root", "admin");

            stm = conn.createStatement();

            String sql;

            if(!Pass1.equals(Pass2)){

                out.println("Las contraseñas no coinciden.<a href='PacienteCorreo.jsp'>Volver<a/>");

            }else {
            	
            	sql = "SELECT COUNT(CORREOE_USR) as counte from PACIENTE where CORREOE_USR='" + Email + "'";
				ResultSet rste = stm.executeQuery(sql);
				rste.next();
				if (rste.getString("counte").equals("1")) {
                	out.println("Ese correo ya está registrado.<a href='PacienteCorreo.jsp'>Volver<a/>");

                } else{
                	
                    sql = "SELECT COUNT(NOMRE_USR) as count from PACIENTE where NOMRE_USR='" + User + "'";
	                ResultSet rst = stm.executeQuery(sql);
	                rst.next();
	                if (rst.getString("count").equals("1")) {
    	            	out.println("Ese usuario ya existe.<a href='PacienteCorreo.jsp'>Volver<a/>");
	                } else {
	                    boolean status = true;
			            // enter here the smtp mail server address
            			// ask your ISP to get the proper name
            			String mailServer ="smtp.gmail.com";
            			String username="freddybazante@gmail.com";
            			String password="nardyeliana";
            			//Obtener ID3
			             sql ="INSERT INTO PACIENTE (ID_USR,TIPO_USR,NOMRE_USR,PASSWORD_USR,CONFIRM_PASSWORD_USR,NOMBRE1_USR,NOMBRE2_USR,APELLIDO1_USR,APELLIDO2_USR,CEDULA_USR,FECNAC_USR,LUGARNAC_USR,DIRECCION_USR,TELFDOM_USR,TELFCEL_USR,EDAD_USR,SEXO_USR,CORREOE_USR,ESTADOCIVIL_USR,OCUPACION_PACIENTE,ESTADO_USR)"
     							+"VALUES (null,'"+tipo+"','"+User
    							+"','"+Pass1+"','"+Pass2
    							+"','"+nombre1
    							+"','"+nombre2+"','"+apellido1
    							+"','"+apellido2+"','"+cedula
    							+"','"+fechanacimiento+"','"+lugarnacimiento
    							+"','"+direccion+"','"+telfdomicilio
    							+"','"+telfcelular
    							+"','"+edad+"','"+genero
    							+"','"+Email+"','"+estadocivil
    							+"','"+ocupacion+"','"+estado+"')";
			            int total  = stm.executeUpdate(sql);
			            String sqlId = "SELECT ID_USR,NOMRE_USR,PASSWORD_USR from PACIENTE where NOMRE_USR='" + User + "' and PASSWORD_USR='" + Pass1 + "'";
            			rst = null;
            			rst = stm.executeQuery(sqlId);
            			rst.next();
			            String Pass = rst.getString(1);
			            String fromEmail = username;
			            String messageEnter = "Bienvenido Nuevo usuario =).<br> Su usuario es: "+User+"<br>Su contrasena es: "+Pass1+" <br> Para ingresar al sistema, haga click aquí: <a href='http://bucalcenter.jelasticlw.com.br/app-bucalcenter/index.jsp'>Ingresar a BucalCenter</a>";
			            String toEmail = request.getParameter("f_correo_e");

			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
			            
            			    toEmail = "unknown";
            			}
			            try {
			                Properties props = new Properties();
            			    props.put("mail.smtps.host", mailServer);
                			props.put("mail.smtp.auth", "true");
                			props.put("mail.smtps.port", "465");
                			props.put("mail.smtps.STARTTLS.enable", true);
			                Session s = Session.getInstance(props, null);
			                MimeMessage message = new MimeMessage(s);
			                InternetAddress from = new InternetAddress(fromEmail);
            			    message.setFrom(from);
			                InternetAddress to = new InternetAddress(toEmail);
			                message.addRecipient(Message.RecipientType.TO, to);
			                message.setSubject("[Bienvenido Usuario]");
            			    //message.setText(messageEnter);
                			message.setContent(messageEnter, "text/html");
			                Transport tr = s.getTransport("smtps");
            			    tr.connect(mailServer, username, password);
			                message.saveChanges(); // don't forget this
            			    tr.sendMessage(message, message.getAllRecipients());
                			tr.close();
			            } catch (NullPointerException n) {
            			    System.out.println(n.getMessage());
                			out.println("¡ERROR!");
                			status = false;
			            } catch (Exception e) {
            			    System.out.println(e.getMessage());
                			out.println("ERROR, NO se envió mensaje para " + toEmail + ", la razon es: " + e);
                			status = false;
            			}
			            if (status == true) {
            			    out.println("Su Mensaje para " + toEmail + " se envió correctamente.");
            			}
	                    if ( total != 0){
	                         out.println("Usuario nuevo creado.Recibirá un correo de confirmación para activar la cuenta.<br><a href='index.jsp'>Volver<a/> ");
	                    }else {
	                        out.println("Error al crear usuario.<br><a href='index.jsp'>Volver<a/> ");
    	               }

                	}
                }
                stm.close();             

            }

        } else {

        %>

        
        <form action="PacienteCorreo.jsp" method="post">
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
					<select name="f_modo" id="f_modo">
						<option value="P" >PACIENTE </option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Nombre de Usuario:</td>
				<td><input type="text" name="f_user" id="f_user" required></td>
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
				<td><input type="text" name="f_nombre1" id="f_nombre1" required></td>
			</tr>
			<tr>
				<td>Segundo Nombre:</td>
				<td><input type="text" name="f_nombre2" id="f_nombre2"></td>
			</tr>
			<tr>
				<td>Primer Apellido:</td>
				<td><input type="text" name="f_apellido1" id="f_apellido1" required></td>
			</tr>
			<tr>
				<td>Segundo Apellido:</td>
				<td><input type="text" name="f_apellido2" id="f_apellido2"></td>
			</tr>
			<tr>
				<td>Cedula de identidad:</td>
				<td><input type="text" name="f_ci" id="f_ci" required></td>
			</tr>
			<tr>
				<td>Fecha de nacimiento:</td>
				<td><input type="date" name="f_fecha_nac" id="f_fecha_nac" /></td>
			</tr>
			<tr>
				<td>Lugar de nacimiento:</td>
				<td><input type="text" name="f_lugar_nac" id="f_lugar_nac"></td>
			</tr>
			<tr>
				<td>Dirección:</td>
				<td><input type="text" name="f_direccion" id="f_direccion"></td>
			</tr>
			<tr>
				<td>Teléfono Domicilio:</td>
				<td><input type="text" name="f_fono_dom" id="f_fono_dom" required></td>
			</tr>
			<tr>
				<td>Teléfono Celular:</td>
				<td><input type="text" name="f_fono_cel" id="f_fono_cel"></td>
			</tr>
			<tr>
				<td>Edad:</td>
				<td><input type="number" name="f_edad" id="f_edad"></td>
			</tr>
			<tr>
				<td>Género:</td>
				<td>
					<select name="f_genero" id="f_genero">
						<option value="M" >MASCULINO</option>
						<option value="F" >FEMENINO</option>
					</select>
				</td>
			</tr>
			<tr>
				<td>Correo electrónico</td>
				<td><input type="email" name="f_correo_e" id="f_correo_e" required></td>
			</tr>
			<tr>
				<td>Estado Civil:</td>
				<td>
					<select name="f_estado_civ" id="f_estado_civ">
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
					<select name="f_ocupacion" id="f_ocupacion">
						<option value="INGENIERIA">INGENIERIA</option>
						<option value="INVESTIGACION">INVESTIGACION</option>
						<option value="ESTUDIANTE">ESTUDIANTE</option>
						<option value="ODONTOLOGIA">ODONTOLOGÍA</option>
						<option value="OTROS">OTROS</option>
					</select>
				</td>
			</tr>
                <tr>
                    <td><a href="index.jsp">Volver</a></td><td><input type="submit" value="Registrar"></td>
                </tr>
            </table>  
         </div>	
		</fieldset>          
        </form>

        <%        }
        %>

    </body>
</html>
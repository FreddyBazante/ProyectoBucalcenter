<% HttpSession sesionOK=request.getSession(); %>
<header>
	<div align="center">
	<table>
		<tr>
			<td colspan="3" align="center"><img align="middle" alt="bucalcenter" src="images/bucalcenter.png" width="100px"></td>
		</tr>
		<tr>
			<td style="width: 197px; "><img align="left" alt="EPN" src="images/EPN.png" width="100px"></td>
			<td style="width: 262px; " align="center"> <p>BUCALCENTER</p>
				Bienvenido: <%=sesionOK.getAttribute("usuario") %><br>
				<img alt="<%=sesionOK.getAttribute("usuario2") %>" src="images/usuario.png" width="40px">
				<%=sesionOK.getAttribute("usuario") %>
			</td>
			<td style="width: 197px; "><img align="right" alt="FIS" src="images/fis.png" width="70px"></td>
		</tr>
	</table>
	</div>
</header>
<nav>
		<ul>
			<li><a href="Horario.jsp">Horario</a></li>
			<li><a href="Especialidad.jsp">Especialidades</a></li>
			<li><a href="Administrador.jsp">Administrador</a></li>
			<li><a href="Odontologo.jsp">Odont�logo</a></li>
			<li><a href="Paciente.jsp">Paciente</a></li>
			<li><a href="cerrarsesion.jsp">Cerrar Sesi�n</a></li>
		</ul>
</nav>
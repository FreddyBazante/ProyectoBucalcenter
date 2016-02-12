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
				<img alt="<%=sesionOK.getAttribute("usuario") %>" src="images/usuario.png" width="40px">
				<%=sesionOK.getAttribute("usuario2") %>
			</td>
			<td style="width: 197px; "><img align="right" alt="FIS" src="images/fis.png" width="70px"></td>
		</tr>
	</table>
	</div>
</header>
<nav>
		<ul>
			<li><a href="RegistrarCita.jsp">Registrar Cita</a></li>
			<li><a href="ListarCitaPaciente.jsp">Ver Cita</a></li>
			<li><a href="cerrarsesion.jsp">Cerrar Sesión</a></li>
		</ul>
</nav>
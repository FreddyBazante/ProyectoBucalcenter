package com.ec.bucalcenter.control;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ec.bucalcenter.modelo.RegistrarPaciente;

/**
 * Servlet implementation class cRegistrarPaciente
 */
@WebServlet("/cRegistrarPaciente")
public class cRegistrarPaciente extends HttpServlet {
	RegistrarPaciente rp=new RegistrarPaciente();
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cRegistrarPaciente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out;
		String titulo = "Salida de un Simple Servlet";
		//declaramos el tipo de contenido
		response.setContentType("text/html");
		//escribimos los datos de la respuesta
		out = response.getWriter();
		out.println("<html>");
			out.println("<head>");
				out.println("<title>");
					out.println(titulo);
				out.println("</title>");
		out.println("</head>");
		out.println("<body>");
			out.println("<h1>");
				out.println(titulo);
				out.println("</h1>");
		out.println("<h2>");
		out.println("Freddy Bazante");
		out.println("</h2>");
		out.println("</body>");
		out.println("</html>");
		out.close();	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		rp.setTipo_paciente(request.getParameter("f_modo"));
		rp.setNombre_usuario_paciente(request.getParameter("f_user"));
		rp.setPassword_paciente(request.getParameter("f_password1"));
		rp.setConfirm_password_paciente(request.getParameter("f_password2"));
		rp.setNombre1_paciente(request.getParameter("f_nombre1"));
		rp.setNombre2_paciente(request.getParameter("f_nombre2"));
		rp.setApellido1_paciente(request.getParameter("f_apellido1"));
		rp.setApellido2_paciente(request.getParameter("f_apellido2"));
		rp.setCedula_paciente(request.getParameter("f_ci"));
		rp.setFecha_nacimiento_paciente(request.getParameter("f_fecha_nac"));
		rp.setLugar_nacimiento_paciente(request.getParameter("f_lugar_nac"));
		rp.setDirección_paciente(request.getParameter("f_direccion"));
		rp.setTelefono_domicilio_paciente(request.getParameter("f_fono_dom"));
		rp.setTelefono_celular_paciente(request.getParameter("f_fono_cel"));
		rp.setEdad_paciente(request.getParameter("f_edad"));
		rp.setSexo_paciente(request.getParameter("f_genero"));
		rp.setCorreo_electronico_paciente(request.getParameter("f_correo_e"));
		rp.setEstado_civil_paciente(request.getParameter("f_estado_civ"));
		rp.setOcupacion_paciente(request.getParameter("f_ocupacion"));
		rp.setEstado_paciente("1");
		rp.registrar_registrarpaciente(rp);
		response.sendRedirect("EnvioCorreo.jsp");
		System.out.println(rp.getSexo_paciente()+"-Paso por el control cRegistrarPaciente");
	}

}

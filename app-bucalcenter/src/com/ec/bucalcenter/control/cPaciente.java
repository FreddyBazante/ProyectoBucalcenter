package com.ec.bucalcenter.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;









import com.ec.bucalcenter.modelo.Paciente;

/**
 * Servlet implementation class cPaciente
 */
@WebServlet("/cPaciente")
public class cPaciente extends HttpServlet {
	Paciente p=new Paciente();
	private static final long serialVersionUID = 1L;
	String msj="";   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cPaciente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opc=request.getParameter("op");
		switch (opc) {
		case "del":eliminarPaciente(request, response);
			
			break;

		default:
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opc = request.getParameter("opc");
		switch (opc) {
		case "in": registrarPaciente(request, response); 	break;
		case "up": actualizarPaciente(request, response); break;
		default:
			break;
		}
	}
	
	protected void registrarPaciente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		p.setTipo_paciente(request.getParameter("f_modo"));
		p.setNombre_usuario_paciente(request.getParameter("f_user"));
		p.setPassword_paciente(request.getParameter("f_password1"));
		p.setConfirm_password_paciente(request.getParameter("f_password2"));
		p.setNombre1_paciente(request.getParameter("f_nombre1"));
		p.setNombre2_paciente(request.getParameter("f_nombre2"));
		p.setApellido1_paciente(request.getParameter("f_apellido1"));
		p.setApellido2_paciente(request.getParameter("f_apellido2"));
		p.setCedula_paciente(request.getParameter("f_ci"));
		p.setFecha_nacimiento_paciente(request.getParameter("f_fecha_nac"));
		p.setLugar_nacimiento_paciente(request.getParameter("f_lugar_nac"));
		p.setDirección_paciente(request.getParameter("f_direccion"));
		p.setTelefono_domicilio_paciente(request.getParameter("f_fono_dom"));
		p.setTelefono_celular_paciente(request.getParameter("f_fono_cel"));
		p.setEdad_paciente(request.getParameter("f_edad"));
		p.setSexo_paciente(request.getParameter("f_genero"));
		p.setCorreo_electronico_paciente(request.getParameter("f_correo_e"));
		p.setEstado_civil_paciente(request.getParameter("f_estado_civ"));
		p.setOcupacion_paciente(request.getParameter("f_ocupacion"));
		p.setEstado_paciente(request.getParameter("Estado"));
		String msj="";
		int v =p.registrar_paciente(p);
		if(v==1){
			msj="5"; //si registro correctamente
		}else{
			msj="6"; //hubo un error en el registro
		}
		response.sendRedirect("Paciente.jsp?"+"&msj="+msj);
	}
	
	protected void actualizarPaciente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		p.setId_paciente(Integer.valueOf(request.getParameter("id")));
		p.setTipo_paciente(request.getParameter("f_modo"));
		p.setNombre_usuario_paciente(request.getParameter("f_user"));
		p.setPassword_paciente(request.getParameter("f_password1"));
		p.setConfirm_password_paciente(request.getParameter("f_password2"));
		p.setNombre1_paciente(request.getParameter("f_nombre1"));
		p.setNombre2_paciente(request.getParameter("f_nombre2"));
		p.setApellido1_paciente(request.getParameter("f_apellido1"));
		p.setApellido2_paciente(request.getParameter("f_apellido2"));
		p.setCedula_paciente(request.getParameter("f_ci"));
		p.setFecha_nacimiento_paciente(request.getParameter("f_fecha_nac"));
		p.setLugar_nacimiento_paciente(request.getParameter("f_lugar_nac"));
		p.setDirección_paciente(request.getParameter("f_direccion"));
		p.setTelefono_domicilio_paciente(request.getParameter("f_fono_dom"));
		p.setTelefono_celular_paciente(request.getParameter("f_fono_cel"));
		p.setEdad_paciente(request.getParameter("f_edad"));
		p.setSexo_paciente(request.getParameter("f_genero"));
		p.setCorreo_electronico_paciente(request.getParameter("f_correo_e"));
		p.setEstado_civil_paciente(request.getParameter("f_estado_civ"));
		p.setOcupacion_paciente(request.getParameter("f_ocupacion"));
		p.setEstado_paciente(request.getParameter("Estado"));
		String msj="";
		int v = p.actualizar_paciente(p); 
		if(v==1){
			msj="3"; //si registro correctamente
		}else{
			msj="4"; //hubo un error en el registro
		}
		
		response.sendRedirect("Paciente.jsp?"+"&msj="+msj);
	}
	
	protected void eliminarPaciente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		p.setId_paciente(Integer.valueOf(request.getParameter("id")));
		int valor=p.eliminar_paciente(p);
		if(valor==1){
			msj="1";
		}else{
			msj="2";
		}
		response.sendRedirect("Paciente.jsp?"+"&msj="+msj);
	}

}

package com.ec.bucalcenter.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ec.bucalcenter.modelo.Administrador;

/**
 * Servlet implementation class cAdministrador
 */
@WebServlet("/cAdministrador")
public class cAdministrador extends HttpServlet {
	Administrador a=new Administrador();
	private static final long serialVersionUID = 1L;
	String msj="";   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cAdministrador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opc=request.getParameter("op");
		switch (opc) {
		case "del":eliminarAdministrador(request, response);
			
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
		case "in": registrarAdministrador(request, response); 	break;
		case "up": actualizarAdministrador(request, response); break;
		default:
			break;
		}
	}
	
	protected void registrarAdministrador(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		a.setTipo_administrador(request.getParameter("f_modo"));
		a.setNombre_usuario_administrador(request.getParameter("f_user"));
		a.setPassword_administrador(request.getParameter("f_password1"));
		a.setConfirm_password_administrador(request.getParameter("f_password2"));
		a.setNombre1_administrador(request.getParameter("f_nombre1"));
		a.setNombre2_administrador(request.getParameter("f_nombre2"));
		a.setApellido1_administrador(request.getParameter("f_apellido1"));
		a.setApellido2_administrador(request.getParameter("f_apellido2"));
		a.setCedula_administrador(request.getParameter("f_ci"));
		a.setFecha_nacimiento_administrador(request.getParameter("f_fecha_nac"));
		a.setLugar_nacimiento_administrador(request.getParameter("f_lugar_nac"));
		a.setDirección_administrador(request.getParameter("f_direccion"));
		a.setTelefono_domicilio_administrador(request.getParameter("f_fono_dom"));
		a.setTelefono_celular_administrador(request.getParameter("f_fono_cel"));
		a.setEdad_administrador(request.getParameter("f_edad"));
		a.setSexo_administrador(request.getParameter("f_genero"));
		a.setCorreo_electronico_administrador(request.getParameter("f_correo_e"));
		a.setEstado_civil_administrador(request.getParameter("f_estado_civ"));
		a.setOcupacion_administrador(request.getParameter("f_profesion"));
		a.setEstado_administrador(request.getParameter("Estado"));
		String msj="";
		int v = a.registrar_administrador(a); 
		if(v==1){
			msj="5"; //si registro correctamente
		}else{
			msj="6"; //hubo un error en el registro
		}
		
		response.sendRedirect("Administrador.jsp?"+"&msj="+msj);
		System.out.println(a.getCedula_administrador()+"-Paso por el control cAdministrador");
	}
	
	protected void actualizarAdministrador(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		a.setId_administrador(Integer.valueOf(request.getParameter("id")));
		a.setTipo_administrador(request.getParameter("f_modo"));
		a.setNombre_usuario_administrador(request.getParameter("f_user"));
		a.setPassword_administrador(request.getParameter("f_password1"));
		a.setConfirm_password_administrador(request.getParameter("f_password2"));
		a.setNombre1_administrador(request.getParameter("f_nombre1"));
		a.setNombre2_administrador(request.getParameter("f_nombre2"));
		a.setApellido1_administrador(request.getParameter("f_apellido1"));
		a.setApellido2_administrador(request.getParameter("f_apellido2"));
		a.setCedula_administrador(request.getParameter("f_ci"));
		a.setFecha_nacimiento_administrador(request.getParameter("f_fecha_nac"));
		a.setLugar_nacimiento_administrador(request.getParameter("f_lugar_nac"));
		a.setDirección_administrador(request.getParameter("f_direccion"));
		a.setTelefono_domicilio_administrador(request.getParameter("f_fono_dom"));
		a.setTelefono_celular_administrador(request.getParameter("f_fono_cel"));
		a.setEdad_administrador(request.getParameter("f_edad"));
		a.setSexo_administrador(request.getParameter("f_genero"));
		a.setCorreo_electronico_administrador(request.getParameter("f_correo_e"));
		a.setEstado_civil_administrador(request.getParameter("f_estado_civ"));
		a.setOcupacion_administrador(request.getParameter("f_profesion"));
		a.setEstado_administrador(request.getParameter("Estado"));
		String msj="";
		int v = a.actualizar_administrador(a); 
		if(v==1){
			msj="3"; //si registro correctamente
		}else{
			msj="4"; //hubo un error en el registro
		}
		
		response.sendRedirect("Administrador.jsp?"+"&msj="+msj);
		System.out.println(a.getCedula_administrador()+"-Paso por el control cAdministrador");
	}
	
	protected void eliminarAdministrador(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		a.setId_administrador(Integer.valueOf(request.getParameter("id")));
		int valor=a.eliminar_administrador(a);
		if(valor==1){
			msj="1";
		}else{
			msj="2";
		}
		response.sendRedirect("Administrador.jsp?"+"&msj="+msj);
	}

}

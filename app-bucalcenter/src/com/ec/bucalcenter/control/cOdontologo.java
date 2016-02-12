package com.ec.bucalcenter.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;












import com.ec.bucalcenter.modelo.Odontologo;

/**
 * Servlet implementation class cOdontologo
 */
@WebServlet("/cOdontologo")
public class cOdontologo extends HttpServlet {
	Odontologo o=new Odontologo();
	private static final long serialVersionUID = 1L;
	String msj="";   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cOdontologo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opc=request.getParameter("op");
		switch (opc) {
		case "del":eliminarOdontologo(request, response);
			
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
		case "in": registrarOdontologo(request, response); 	break;
		case "up": actualizarOdontologo(request, response); break;
		default:
			break;
		}
	}
	
	protected void registrarOdontologo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		o.setTipo_odontologo(request.getParameter("f_modo"));
		o.setId_horario_odontologo(Integer.valueOf(request.getParameter("f_horario")));
		o.setId_especialidad_odontologo(Integer.valueOf(request.getParameter("f_especialidad")));
		o.setNombre_usuario_odontologo(request.getParameter("f_user"));
		o.setPassword_odontologo(request.getParameter("f_password1"));
		o.setConfirm_password_odontologo(request.getParameter("f_password2"));
		o.setNombre1_odontologo(request.getParameter("f_nombre1"));
		o.setNombre2_odontologo(request.getParameter("f_nombre2"));
		o.setApellido1_odontologo(request.getParameter("f_apellido1"));
		o.setApellido2_odontologo(request.getParameter("f_apellido2"));
		o.setCedula_odontologo(request.getParameter("f_ci"));
		o.setFecha_nacimiento_odontologo(request.getParameter("f_fecha_nac"));
		o.setLugar_nacimiento_odontologo(request.getParameter("f_lugar_nac"));
		o.setDirección_odontologo(request.getParameter("f_direccion"));
		o.setTelefono_domicilio_odontologo(request.getParameter("f_fono_dom"));
		o.setTelefono_celular_odontologo(request.getParameter("f_fono_cel"));
		o.setEdad_odontologo(request.getParameter("f_edad"));
		o.setSexo_odontologo(request.getParameter("f_genero"));
		o.setCorreo_electronico_odontologo(request.getParameter("f_correo_e"));
		o.setEstado_civil_odontologo(request.getParameter("f_estado_civ"));
		o.setEstado_odontologo(request.getParameter("Estado"));
		o.setHora_entrada_odontologo(request.getParameter("f_hora_entrada"));
		o.setHora_salida_odontologo(request.getParameter("f_hora_salida"));
		o.setCitas_maximas_odontologo(request.getParameter("f_numero_maximo"));
		String msj="";
		int v = o.registrar_odontologo(o); 
		if(v==1){
			msj="5"; //si registro correctamente
		}else{
			msj="6"; //hubo un error en el registro
		}
		
		response.sendRedirect("Odontologo.jsp?"+"&msj="+msj);
	}
	
	protected void actualizarOdontologo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		o.setId_odontologo(Integer.valueOf(request.getParameter("id")));
		o.setTipo_odontologo(request.getParameter("f_modo"));
		o.setId_horario_odontologo(Integer.valueOf(request.getParameter("f_horario")));
		o.setId_especialidad_odontologo(Integer.valueOf(request.getParameter("f_especialidad")));
		o.setNombre_usuario_odontologo(request.getParameter("f_user"));
		o.setPassword_odontologo(request.getParameter("f_password1"));
		o.setConfirm_password_odontologo(request.getParameter("f_password2"));
		o.setNombre1_odontologo(request.getParameter("f_nombre1"));
		o.setNombre2_odontologo(request.getParameter("f_nombre2"));
		o.setApellido1_odontologo(request.getParameter("f_apellido1"));
		o.setApellido2_odontologo(request.getParameter("f_apellido2"));
		o.setCedula_odontologo(request.getParameter("f_ci"));
		o.setFecha_nacimiento_odontologo(request.getParameter("f_fecha_nac"));
		o.setLugar_nacimiento_odontologo(request.getParameter("f_lugar_nac"));
		o.setDirección_odontologo(request.getParameter("f_direccion"));
		o.setTelefono_domicilio_odontologo(request.getParameter("f_fono_dom"));
		o.setTelefono_celular_odontologo(request.getParameter("f_fono_cel"));
		o.setEdad_odontologo(request.getParameter("f_edad"));
		o.setSexo_odontologo(request.getParameter("f_genero"));
		o.setCorreo_electronico_odontologo(request.getParameter("f_correo_e"));
		o.setEstado_civil_odontologo(request.getParameter("f_estado_civ"));
		o.setEstado_odontologo(request.getParameter("Estado"));
		o.setHora_entrada_odontologo(request.getParameter("f_hora_entrada"));
		o.setHora_salida_odontologo(request.getParameter("f_hora_salida"));
		o.setCitas_maximas_odontologo(request.getParameter("f_numero_maximo"));
		String msj="";
		int v = o.actualizar_odontologo(o); 
		if(v==1){
			msj="3"; //si registro correctamente
		}else{
			msj="4"; //hubo un error en el registro
		}
		
		response.sendRedirect("Odontologo.jsp?"+"&msj="+msj);
	}
	
	protected void eliminarOdontologo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		o.setId_odontologo(Integer.valueOf(request.getParameter("id")));
		int valor=o.eliminar_odontologo(o);
		if(valor==1){
			msj="1";
		}else{
			msj="2";
		}
		response.sendRedirect("Odontologo.jsp?"+"&msj="+msj);
	}

}

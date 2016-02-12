package com.ec.bucalcenter.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ec.bucalcenter.modelo.Cita;

/**
 * Servlet implementation class cCita
 */
@WebServlet("/cCita")
public class cCita extends HttpServlet {
	Cita c=new Cita();
	private static final long serialVersionUID = 1L;
	String msj = ""; 
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cCita() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opc = request.getParameter("op");
		switch (opc) {
		case "del": eliminarCita(request, response);break;
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
		case "in": registrarCita(request, response); 	break;
		case "up": actualizarCita(request, response); break;
		default:
			break;
		}
		
	}
	
	protected void eliminarCita(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		c.setId_cita(Integer.valueOf(request.getParameter("id")));
		int valor = c.eliminar_Cita(c);
		if(valor==1){
			msj = "1"; //para el caso de una elimacion satisfactoria
		}else{
			msj = "2"; // error en la eliminacion
		}
		response.sendRedirect("ListarCitaPaciente.jsp?"+"&msj="+msj);
	}
	
	
	
	protected void registrarCita(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		c.setId_paciente(Integer.valueOf(request.getParameter("f_id")));
		c.setId_odontologo(Integer.valueOf(request.getParameter("f_odontologo")));
		c.setFecha_cita(request.getParameter("f_fecha_cita"));
		c.setHora_cita(request.getParameter("f_hora"));
		c.setEstado_cita("ACTIVA");
		c.registrar_cita(c);
		String pg = request.getParameter("pg"); if(pg==null){pg="1";}
		int v = c.registrar_cita(c); 
		if(v==1){
			msj="5"; //si registro correctamente
		}else{
			msj="6"; //hubo un error en el registro
		}
		response.sendRedirect("RegistrarCita.jsp");
		System.out.println(c.getFecha_cita()+"-Paso por el control cCita");
	}
	protected void actualizarCita(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		c.setId_cita(Integer.valueOf(request.getParameter("id")));
		c.setId_paciente(Integer.valueOf(request.getParameter("f_id")));
		c.setId_odontologo(Integer.valueOf(request.getParameter("f_odontologo")));
		c.setFecha_cita(request.getParameter("f_fecha_cita"));
		c.setHora_cita(request.getParameter("f_hora"));
		c.setEstado_cita(request.getParameter("f_estado"));
		c.actualizar_cita(c);
		String pg = request.getParameter("pg");
		String msj="";
		int v = c.actualizar_cita(c);
		if(v==1){
			msj="3"; //si actualizo correctamente
		}else{
			msj="4"; //hubo un error en la actualizacion
		}
		response.sendRedirect("Reagendar.jsp?pg="+pg+"&msj="+msj);
	}

}

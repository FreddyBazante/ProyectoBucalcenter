package com.ec.bucalcenter.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ec.bucalcenter.modelo.Especialidad;

/**
 * Servlet implementation class cEspecialidad
 */
@WebServlet("/cEspecialidad")
public class cEspecialidad extends HttpServlet {
	Especialidad es=new Especialidad();
	private static final long serialVersionUID = 1L;
	String msj="";   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cEspecialidad() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opc=request.getParameter("op");
		switch (opc) {
		case "del":eliminarEspecialidad(request, response);
			
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
		case "in": registrarEspecialdad(request, response); 	break;
		case "up": actualizarEspecialidad(request, response); break;
		default:
			break;
		}
		
	}
	
	protected void registrarEspecialdad(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		es.setNombre_especialidad(request.getParameter("f_especialidad"));
		String msj="";
		int v = es.registrar_especialidad(es); 
		if(v==1){
			msj="5"; //si registro correctamente
		}else{
			msj="6"; //hubo un error en el registro
		}
		
		response.sendRedirect("Especialidad.jsp?"+"&msj="+msj);
		
	}
	
	protected void actualizarEspecialidad(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		es.setId_especialidad(Integer.valueOf(request.getParameter("id")));
		es.setNombre_especialidad(request.getParameter("f_especialidad"));
		String msj="";
		int v = es.actualizar_especialidad(es); 
		if(v==1){
			msj="3"; //si registro correctamente
		}else{
			msj="4"; //hubo un error en el registro
		}
		
		response.sendRedirect("Especialidad.jsp?"+"&msj="+msj);
		
	}
	
	protected void eliminarEspecialidad(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		es.setId_especialidad(Integer.valueOf(request.getParameter("id")));
		int valor=es.eliminar_especialidad(es);
		if(valor==1){
			msj="1";
		}else{
			msj="2";
		}
		response.sendRedirect("Especialidad.jsp?"+"&msj="+msj);
	}

}

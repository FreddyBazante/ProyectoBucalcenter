package com.ec.bucalcenter.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ec.bucalcenter.modelo.Horario;

/**
 * Servlet implementation class cHorario
 */
@WebServlet("/cHorario")
public class cHorario extends HttpServlet {
	Horario h=new Horario();
	private static final long serialVersionUID = 1L;
	String msj="";   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public cHorario() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String opc=request.getParameter("op");
		switch (opc) {
		case "del":eliminarHorario(request, response);
			
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
		case "in": registrarHorario(request, response); 	break;
		case "up": actualizarHorario(request, response); break;
		default:
			break;
		}
	}
	
	protected void registrarHorario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		h.setHora_inicio_horario(request.getParameter("f_horainicio"));
		h.setHora_fin_horario(request.getParameter("f_horafin"));
		h.setHora_Lunes_horario(request.getParameter("f_horaLunes"));
		h.setHora_Martes_horario(request.getParameter("f_horaMartes"));
		h.setHora_Miercoles_horario(request.getParameter("f_horaMiercoles"));
		h.setHora_Jueves_horario(request.getParameter("f_horaJueves"));
		h.setHora_Viernes_horario(request.getParameter("f_horaViernes"));
		String msj="";
		int v = h.registrar_horario(h);
		if(v==1){
			msj="5"; //si registro correctamente
		}else{
			msj="6"; //hubo un error en el registro
		}
		response.sendRedirect("Horario.jsp?"+"&msj="+msj);
	}
	protected void actualizarHorario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		h.setId_horario(Integer.valueOf(request.getParameter("id")));
		h.setHora_inicio_horario(request.getParameter("f_horainicio"));
		h.setHora_fin_horario(request.getParameter("f_horafin"));
		h.setHora_Lunes_horario(request.getParameter("f_horaLunes"));
		h.setHora_Martes_horario(request.getParameter("f_horaMartes"));
		h.setHora_Miercoles_horario(request.getParameter("f_horaMiercoles"));
		h.setHora_Jueves_horario(request.getParameter("f_horaJueves"));
		h.setHora_Viernes_horario(request.getParameter("f_horaViernes"));
		String msj="";
		int v = h.actualizar_horario(h);
		if(v==1){
			msj="3"; //si registro correctamente
		}else{
			msj="4"; //hubo un error en el registro
		}
		response.sendRedirect("Horario.jsp?"+"&msj="+msj);
	}
	
	protected void eliminarHorario(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		h.setId_horario(Integer.valueOf(request.getParameter("id")));
		int valor=h.eliminar_horario(h);
		if(valor==1){
			msj="1";
		}else{
			msj="2";
		}
		response.sendRedirect("Horario.jsp?"+"&msj="+msj);
	}

}

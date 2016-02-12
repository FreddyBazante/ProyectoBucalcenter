package com.ec.bucalcenter.control;

import java.io.IOException;





import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ec.bucalcenter.modelo.LoginAdministrador;
import com.ec.bucalcenter.modelo.LoginOdontologo;
import com.ec.bucalcenter.modelo.LoginPaciente;
import com.ec.bucalcenter.modelo.Sesion;









/**
 * Servlet implementation class cLogin
 */
@WebServlet("/cLogin")
public class cLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    LoginAdministrador la=new LoginAdministrador(); 
    LoginPaciente lp= new LoginPaciente();
    LoginOdontologo ld=new LoginOdontologo();
    Sesion s = new Sesion();
    public cLogin() {
        super();
        // TODO Auto-generated constructor stub
    }
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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String modo=request.getParameter("f_modo_login");
		switch (modo) {
		case "A":
			la.setTipo_usuario(request.getParameter("f_modo_login"));
			la.setNombre_usuario_usuario(request.getParameter("f_user"));
			la.setPassword_usuario(request.getParameter("fpassw"));
			int va=la.validar_usuario(la);
			if(va==1){
				HttpSession sesionOK = request.getSession();
				s.setId_sesion(sesionOK.getId());
				s.setUsuario(request.getParameter("f_user"));
				if(s.buscarSesion(s)==1){ //busca si existe una sesion con el id y el usuario
					s.actualizarSesion(s); //si existe actualiza la fecha
				}else{
					registrarSesion(sesionOK.getId(), request, response); //registra sesion
				}
				LoginAdministrador user = new LoginAdministrador();
				user=la.getUsuario(la);
				sesionOK.setAttribute("iduser", user.getIduser());
				sesionOK.setAttribute("tipo", user.getTipo_usuario());
				sesionOK.setAttribute("usuario", user.getNombre_usuario_usuario());
				sesionOK.setAttribute("usuario2", user.getNombre_usuario()+" "+user.getApellido_usuario());
				sesionOK.setAttribute("estado", user.getEstado_usuario());
				sesionOK.setAttribute("ip", request.getRemoteAddr());
				response.sendRedirect("Menu.jsp");
			}else{
				response.sendRedirect("Login.jsp?error=v");
			}
			break;
		case "O":
			ld.setTipo_usuario(request.getParameter("f_modo_login"));
			ld.setNombre_usuario_usuario(request.getParameter("f_user"));
			ld.setPassword_usuario(request.getParameter("fpassw"));
			int vd=ld.validar_usuario(ld);
			if(vd==1){
				HttpSession sesionOK = request.getSession();
				s.setId_sesion(sesionOK.getId());
				s.setUsuario(request.getParameter("f_user"));
				if(s.buscarSesion(s)==1){ //busca si existe una sesion con el id y el usuario
					s.actualizarSesion(s); //si existe actualiza la fecha
				}else{
					registrarSesion(sesionOK.getId(), request, response); //registra sesion
				}
				LoginOdontologo user = new LoginOdontologo();
				user=ld.getUsuario(ld);
				sesionOK.setAttribute("iduser", user.getIduser());
				sesionOK.setAttribute("tipo", user.getTipo_usuario());
				sesionOK.setAttribute("usuario", user.getNombre_usuario_usuario());
				sesionOK.setAttribute("usuario2", user.getNombre_usuario()+" "+user.getApellido_usuario());
				sesionOK.setAttribute("estado", user.getEstado_usuario());
				sesionOK.setAttribute("ip", request.getRemoteAddr());
				response.sendRedirect("MenuOdontologo.jsp");
			}else{
				response.sendRedirect("Login.jsp?error=v");
			}
			break;
		case "P":
			lp.setTipo_usuario(request.getParameter("f_modo_login"));
			lp.setNombre_usuario_usuario(request.getParameter("f_user"));
			lp.setPassword_usuario(request.getParameter("fpassw"));
			int vp=lp.validar_usuario(lp);
			if(vp==1){
				HttpSession sesionOK = request.getSession();
				s.setId_sesion(sesionOK.getId());
				s.setUsuario(request.getParameter("f_user"));
				if(s.buscarSesion(s)==1){ //busca si existe una sesion con el id y el usuario
					s.actualizarSesion(s); //si existe actualiza la fecha
				}else{
					registrarSesion(sesionOK.getId(), request, response); //registra sesion
				}
				LoginPaciente user = new LoginPaciente();
				user=lp.getUsuario(lp);
				sesionOK.setAttribute("iduser", user.getIduser());
				sesionOK.setAttribute("tipo", user.getTipo_usuario());
				sesionOK.setAttribute("usuario", user.getNombre_usuario_usuario());
				sesionOK.setAttribute("usuario2", user.getNombre_usuario()+" "+user.getApellido_usuario());
				sesionOK.setAttribute("estado", user.getEstado_usuario());
				sesionOK.setAttribute("ip", request.getRemoteAddr());
				response.sendRedirect("MenuPaciente.jsp");
			}else{
				response.sendRedirect("Login.jsp?error=v");
			}
			break;

		default:
			break;
		}
	}
	
	protected void registrarSesion(String idsesion,HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {		
		s.setId_sesion(idsesion);
		s.setUsuario(request.getParameter("f_user"));
		s.setIp(request.getRemoteAddr());
		s.setHost(request.getRemoteHost());
		s.setServername(request.getServerName());
		s.registrarSesion(s);			
	}

}

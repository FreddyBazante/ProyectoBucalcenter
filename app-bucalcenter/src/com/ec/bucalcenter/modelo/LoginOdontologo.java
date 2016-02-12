package com.ec.bucalcenter.modelo;

import java.sql.ResultSet;

public class LoginOdontologo {

	private int iduser;
	private String tipo_usuario;
	private String nombre_usuario_usuario;
	private String nombre_usuario;
	private String apellido_usuario;
	private String password_usuario;
	private String estado_usuario;
	Conectar cx=new Conectar();
	public LoginOdontologo() {
		// TODO Auto-generated constructor stub
	}
	public int getIduser() {
		return iduser;
	}
	public void setIduser(int iduser) {
		this.iduser = iduser;
	}
	public String getTipo_usuario() {
		return tipo_usuario;
	}
	public void setTipo_usuario(String tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}
	public String getNombre_usuario_usuario() {
		return nombre_usuario_usuario;
	}
	public void setNombre_usuario_usuario(String nombre_usuario_usuario) {
		this.nombre_usuario_usuario = nombre_usuario_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getApellido_usuario() {
		return apellido_usuario;
	}
	public void setApellido_usuario(String apellido_usuario) {
		this.apellido_usuario = apellido_usuario;
	}
	public String getPassword_usuario() {
		return password_usuario;
	}
	public void setPassword_usuario(String password_usuario) {
		this.password_usuario = password_usuario;
	}
	public String getEstado_usuario() {
		return estado_usuario;
	}
	public void setEstado_usuario(String estado_usuario) {
		this.estado_usuario = estado_usuario;
	}
	
	public int validar_usuario(LoginOdontologo l){
		cx.con();
		String com="SELECT * FROM ODONTOLOGO " +
			"WHERE NOMRE_USR='"+l.getNombre_usuario_usuario()+"' " +
			"AND PASSWORD_USR='"+l.getPassword_usuario()+"' " +
			"AND ESTADO_USR='1'";
		int res=cx.contarFilas(com);
		cx.desconectar();
		System.out.println(res);
		return res;
	}
	public LoginOdontologo getUsuario(LoginOdontologo lo){		
		LoginOdontologo user = new LoginOdontologo();
		String com = "SELECT * FROM ODONTOLOGO " +
				"WHERE NOMRE_USR='"+lo.getNombre_usuario_usuario()+"' " +
						"AND PASSWORD_USR='"+lo.getPassword_usuario()+"' " +
								"AND ESTADO_USR='1'";
		try {
			cx.con();
			ResultSet rs = cx.getDatos(com);
			while(rs.next()){
				user.setIduser(Integer.valueOf(rs.getString("ID_USR")));
				user.setTipo_usuario(rs.getString("TIPO_USR"));
				user.setNombre_usuario_usuario(rs.getString("NOMRE_USR"));
				user.setNombre_usuario(rs.getString("NOMBRE1_USR"));
				user.setApellido_usuario(rs.getString("APELLIDO1_USR"));
				user.setEstado_usuario(rs.getString("ESTADO_USR"));
				
			}
			System.out.println("1-"+com+user.getNombre_usuario_usuario());
			return user;			
		} catch (Exception e) {
			System.out.println("2-"+com);
			return user=null;
		}
	}

}

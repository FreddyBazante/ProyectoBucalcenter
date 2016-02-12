package com.ec.bucalcenter.modelo;

public class Sesion {

	private String id_sesion;
	private String usuario;
	private String inicio_sesion;
	private String ultimo_acceso;
	private String ip;
	private String host;
	private String servername;
	private String estado;
	
	Conectar cx = new Conectar();
	
	public Sesion(){
		
	}

	public String getId_sesion() {
		return id_sesion;
	}

	public void setId_sesion(String id_sesion) {
		this.id_sesion = id_sesion;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getInicio_sesion() {
		return inicio_sesion;
	}

	public void setInicio_sesion(String inicio_sesion) {
		this.inicio_sesion = inicio_sesion;
	}

	public String getUltimo_acceso() {
		return ultimo_acceso;
	}

	public void setUltimo_acceso(String ultimo_acceso) {
		this.ultimo_acceso = ultimo_acceso;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getServername() {
		return servername;
	}

	public void setServername(String servername) {
		this.servername = servername;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public int buscarSesion(Sesion s){
		cx.con();
		String com = "Select * from sesiones " +
				"where id_sesion='"+s.getId_sesion()+"' " +
				"and usuario='"+s.getUsuario()+"'";
		int res = cx.contarFilas(com);
		System.out.println(com);
		cx.desconectar();
		return res;		
	}
	
	public int registrarSesion(Sesion s){
		cx.con();
		String com = "Insert into sesiones ( "+
				"id_sesion,usuario,inicio_sesion,ultimo_acceso,ip,host,servername,estado) " +
		"values ('"+s.getId_sesion()+"','"+s.getUsuario()+"',now(), now()," +
				"'"+s.getIp()+"','"+s.getHost()+"','"+s.getServername()+"','1')";
		int res = cx.execQuery(com);
		System.out.println(com);
		cx.desconectar();
		return res;							
	}
	
	public int actualizarSesion(Sesion s){
		cx.con();
		String com = "Update sesiones set " +
				"ultimo_acceso=now() "+
				"where id_sesion='"+s.getId_sesion()+"' " +
				"and usuario='"+s.getUsuario()+"'";
		int res = cx.execQuery(com);
		System.out.println(com);
		cx.desconectar();
		return res;			
	}
}

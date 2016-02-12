package com.ec.bucalcenter.modelo;

import java.sql.ResultSet;

public class Administrador {
	
	private int id_administrador;
	private String tipo_administrador;
	private String nombre_usuario_administrador;
	private String password_administrador;
	private String confirm_password_administrador;
	private String nombre1_administrador;
	private String nombre2_administrador;
	private String apellido1_administrador;
	private String apellido2_administrador;
	private String cedula_administrador;
	private String fecha_nacimiento_administrador;
	private String lugar_nacimiento_administrador;
	private String dirección_administrador;
	private String telefono_domicilio_administrador;
	private String telefono_celular_administrador;
	private String edad_administrador;
	private String sexo_administrador;
	private String correo_electronico_administrador;
	private String estado_civil_administrador;
	private String ocupacion_administrador;
	private String estado_administrador;
	Conectar cx= new Conectar();
	public Administrador() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCedula_administrador() {
		return cedula_administrador;
	}

	public void setCedula_administrador(String cedula_administrador) {
		this.cedula_administrador = cedula_administrador;
	}

	public String getNombre_usuario_administrador() {
		return nombre_usuario_administrador;
	}

	public void setNombre_usuario_administrador(String nombre_usuario_administrador) {
		this.nombre_usuario_administrador = nombre_usuario_administrador;
	}

	public String getPassword_administrador() {
		return password_administrador;
	}

	public void setPassword_administrador(String password_administrador) {
		this.password_administrador = password_administrador;
	}

	public int getId_administrador() {
		return id_administrador;
	}

	public void setId_administrador(int id_administrador) {
		this.id_administrador = id_administrador;
	}

	public String getTipo_administrador() {
		return tipo_administrador;
	}

	public void setTipo_administrador(String tipo_administrador) {
		this.tipo_administrador = tipo_administrador;
	}

	public String getNombre1_administrador() {
		return nombre1_administrador;
	}

	public void setNombre1_administrador(String nombre1_administrador) {
		this.nombre1_administrador = nombre1_administrador;
	}

	public String getNombre2_administrador() {
		return nombre2_administrador;
	}

	public void setNombre2_administrador(String nombre2_administrador) {
		this.nombre2_administrador = nombre2_administrador;
	}

	public String getApellido1_administrador() {
		return apellido1_administrador;
	}

	public void setApellido1_administrador(String apellido1_administrador) {
		this.apellido1_administrador = apellido1_administrador;
	}

	public String getApellido2_administrador() {
		return apellido2_administrador;
	}

	public void setApellido2_administrador(String apellido2_administrador) {
		this.apellido2_administrador = apellido2_administrador;
	}

	public String getFecha_nacimiento_administrador() {
		return fecha_nacimiento_administrador;
	}

	public void setFecha_nacimiento_administrador(
			String fecha_nacimiento_administrador) {
		this.fecha_nacimiento_administrador = fecha_nacimiento_administrador;
	}

	public String getLugar_nacimiento_administrador() {
		return lugar_nacimiento_administrador;
	}

	public void setLugar_nacimiento_administrador(
			String lugar_nacimiento_administrador) {
		this.lugar_nacimiento_administrador = lugar_nacimiento_administrador;
	}

	public String getDirección_administrador() {
		return dirección_administrador;
	}

	public void setDirección_administrador(String dirección_administrador) {
		this.dirección_administrador = dirección_administrador;
	}

	public String getTelefono_domicilio_administrador() {
		return telefono_domicilio_administrador;
	}

	public void setTelefono_domicilio_administrador(
			String telefono_domicilio_administrador) {
		this.telefono_domicilio_administrador = telefono_domicilio_administrador;
	}

	public String getTelefono_celular_administrador() {
		return telefono_celular_administrador;
	}

	public void setTelefono_celular_administrador(
			String telefono_celular_administrador) {
		this.telefono_celular_administrador = telefono_celular_administrador;
	}

	public String getEdad_administrador() {
		return edad_administrador;
	}

	public void setEdad_administrador(String edad_administrador) {
		this.edad_administrador = edad_administrador;
	}

	public String getSexo_administrador() {
		return sexo_administrador;
	}

	public void setSexo_administrador(String sexo_administrador) {
		this.sexo_administrador = sexo_administrador;
	}

	public String getCorreo_electronico_administrador() {
		return correo_electronico_administrador;
	}

	public void setCorreo_electronico_administrador(
			String correo_electronico_administrador) {
		this.correo_electronico_administrador = correo_electronico_administrador;
	}

	public String getEstado_civil_administrador() {
		return estado_civil_administrador;
	}

	public void setEstado_civil_administrador(String estado_civil_administrador) {
		this.estado_civil_administrador = estado_civil_administrador;
	}

	public String getOcupacion_administrador() {
		return ocupacion_administrador;
	}

	public void setOcupacion_administrador(String ocupacion_administrador) {
		this.ocupacion_administrador = ocupacion_administrador;
	}

	public String getEstado_administrador() {
		return estado_administrador;
	}

	public void setEstado_administrador(String estado_administrador) {
		this.estado_administrador = estado_administrador;
	}
	
	public String getConfirm_password_administrador() {
		return confirm_password_administrador;
	}

	public void setConfirm_password_administrador(
			String confirm_password_administrador) {
		this.confirm_password_administrador = confirm_password_administrador;
	}

	public int registrar_administrador(Administrador a){
		cx.con();
		String com="INSERT INTO ADMINISTRADOR (ID_USR,TIPO_USR,NOMRE_USR,PASSWORD_USR,CONFIRM_PASSWORD_USR,NOMBRE1_USR,NOMBRE2_USR,APELLIDO1_USR,APELLIDO2_USR,CEDULA_USR,FECNAC_USR,LUGARNAC_USR,DIRECCION_USR,TELFDOM_USR,TELFCEL_USR,EDAD_USR,SEXO_USR,CORREOE_USR,ESTADOCIVIL_USR,OCUPACION_ADMINISTRADOR,ESTADO_USR)"
				+"VALUES (null,'"+a.getTipo_administrador()+"','"+a.getNombre_usuario_administrador()
				+"','"+a.getPassword_administrador()+"','"+a.getConfirm_password_administrador()
				+"','"+a.getNombre1_administrador()
				+"','"+a.getNombre2_administrador()+"','"+a.getApellido1_administrador()
				+"','"+a.getApellido2_administrador()+"','"+a.getCedula_administrador()
				+"','"+a.getFecha_nacimiento_administrador()+"','"+a.getLugar_nacimiento_administrador()
				+"','"+a.getDirección_administrador()+"','"+a.getTelefono_domicilio_administrador()
				+"','"+a.getTelefono_celular_administrador()
				+"','"+a.getEdad_administrador()+"','"+a.getSexo_administrador()
				+"','"+a.getCorreo_electronico_administrador()+"','"+a.getEstado_civil_administrador()
				+"','"+a.getOcupacion_administrador()+"','"+a.getEstado_administrador()+"')";//hacemos la consulta sql
		int res=cx.execQuery(com);//ejecutamos la consulta
		cx.desconectar();//cerramos la conexion
		//System.out.println(a);
		System.out.println("Llego a la clase Administrador del Modelo");
		//int res=0;
		return res;
	}
	
	public int actualizar_administrador(Administrador a){
		cx.con();
		String com = "UPDATE ADMINISTRADOR SET "+
				"NOMRE_USR='"+a.getNombre_usuario_administrador()+"', " +
				"PASSWORD_USR= '"+a.getPassword_administrador()+"', " +
				"CONFIRM_PASSWORD_USR= '"+a.getConfirm_password_administrador()+"', " +
				"NOMBRE1_USR= '"+a.getNombre1_administrador()+"', " +
				"NOMBRE2_USR= '"+a.getNombre2_administrador()+"', " +
				"APELLIDO1_USR= '"+a.getApellido1_administrador()+"', " +
				"APELLIDO2_USR= '"+a.getApellido2_administrador()+"', " +
				"CEDULA_USR= '"+a.getCedula_administrador()+"', " +
				"FECNAC_USR= '"+a.getFecha_nacimiento_administrador()+"', " +
				"LUGARNAC_USR= '"+a.getLugar_nacimiento_administrador()+"', " +
				"DIRECCION_USR= '"+a.getDirección_administrador()+"'," +
				"TELFDOM_USR= '"+a.getTelefono_domicilio_administrador()+"', " +
				"TELFCEL_USR= '"+a.getTelefono_celular_administrador()+"', " +
				"EDAD_USR= '"+a.getEdad_administrador()+"', " +
				"SEXO_USR= '"+a.getSexo_administrador()+"', " +
				"CORREOE_USR= '"+a.getCorreo_electronico_administrador()+"', " +
				"ESTADOCIVIL_USR= '"+a.getEstado_civil_administrador()+"', " +
				"OCUPACION_ADMINISTRADOR= '"+a.getOcupacion_administrador()+"', " +
				"ESTADO_USR= '"+a.getEstado_administrador()+"' " +
				"WHERE ID_USR='"+a.getId_administrador()+"'";
		int res = cx.execQuery(com); //ejecutamos la consulta
		cx.desconectar(); //cerramos la conexion
		return res;	
	}
	public int eliminar_administrador(Administrador a){
		cx.con();
		String com="DELETE FROM ADMINISTRADOR WHERE ID_USR='"+a.getId_administrador()+"'";
		int res=cx.execQuery(com);
		return res;
	}
	
	public ResultSet buscar_administrador(Administrador a){
		String com="SELECT * FROM ADMINISTRADOR WHERE ID_USR='"+a.getId_administrador()+"'";
		ResultSet rs=cx.getDatos(com);
		return rs;
	}
	
	public ResultSet listar_administrador(){
		String com="SELECT * FROM ADMINISTRADOR";
		ResultSet rs=cx.getDatos(com);
		return rs;
	}

	

}


package com.ec.bucalcenter.modelo;

import java.sql.ResultSet;

public class RegistrarPaciente {

	private int id_paciente;
	private String tipo_paciente;
	private String nombre_usuario_paciente;
	private String password_paciente;
	private String confirm_password_paciente;
	private String nombre1_paciente;
	private String nombre2_paciente;
	private String apellido1_paciente;
	private String apellido2_paciente;
	private String cedula_paciente;
	private String fecha_nacimiento_paciente;
	private String lugar_nacimiento_paciente;
	private String dirección_paciente;
	private String telefono_domicilio_paciente;
	private String telefono_celular_paciente;
	private String edad_paciente;
	private String sexo_paciente;
	private String correo_electronico_paciente;
	private String estado_civil_paciente;
	private String ocupacion_paciente;
	private String estado_paciente;
	Conectar cx= new Conectar();
	public RegistrarPaciente() {
		// TODO Auto-generated constructor stub
	}
	public int getId_paciente() {
		return id_paciente;
	}
	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}
	public String getTipo_paciente() {
		return tipo_paciente;
	}
	public void setTipo_paciente(String tipo_paciente) {
		this.tipo_paciente = tipo_paciente;
	}
	public String getNombre_usuario_paciente() {
		return nombre_usuario_paciente;
	}
	public void setNombre_usuario_paciente(String nombre_usuario_paciente) {
		this.nombre_usuario_paciente = nombre_usuario_paciente;
	}
	public String getPassword_paciente() {
		return password_paciente;
	}
	public void setPassword_paciente(String password_paciente) {
		this.password_paciente = password_paciente;
	}
	public String getConfirm_password_paciente() {
		return confirm_password_paciente;
	}
	public void setConfirm_password_paciente(String confirm_password_paciente) {
		this.confirm_password_paciente = confirm_password_paciente;
	}
	public String getNombre1_paciente() {
		return nombre1_paciente;
	}
	public void setNombre1_paciente(String nombre1_paciente) {
		this.nombre1_paciente = nombre1_paciente;
	}
	public String getNombre2_paciente() {
		return nombre2_paciente;
	}
	public void setNombre2_paciente(String nombre2_paciente) {
		this.nombre2_paciente = nombre2_paciente;
	}
	public String getApellido1_paciente() {
		return apellido1_paciente;
	}
	public void setApellido1_paciente(String apellido1_paciente) {
		this.apellido1_paciente = apellido1_paciente;
	}
	public String getApellido2_paciente() {
		return apellido2_paciente;
	}
	public void setApellido2_paciente(String apellido2_paciente) {
		this.apellido2_paciente = apellido2_paciente;
	}
	public String getCedula_paciente() {
		return cedula_paciente;
	}
	public void setCedula_paciente(String cedula_paciente) {
		this.cedula_paciente = cedula_paciente;
	}
	public String getFecha_nacimiento_paciente() {
		return fecha_nacimiento_paciente;
	}
	public void setFecha_nacimiento_paciente(String fecha_nacimiento_paciente) {
		this.fecha_nacimiento_paciente = fecha_nacimiento_paciente;
	}
	public String getLugar_nacimiento_paciente() {
		return lugar_nacimiento_paciente;
	}
	public void setLugar_nacimiento_paciente(String lugar_nacimiento_paciente) {
		this.lugar_nacimiento_paciente = lugar_nacimiento_paciente;
	}
	public String getDirección_paciente() {
		return dirección_paciente;
	}
	public void setDirección_paciente(String dirección_paciente) {
		this.dirección_paciente = dirección_paciente;
	}
	public String getTelefono_domicilio_paciente() {
		return telefono_domicilio_paciente;
	}
	public void setTelefono_domicilio_paciente(String telefono_domicilio_paciente) {
		this.telefono_domicilio_paciente = telefono_domicilio_paciente;
	}
	public String getTelefono_celular_paciente() {
		return telefono_celular_paciente;
	}
	public void setTelefono_celular_paciente(String telefono_celular_paciente) {
		this.telefono_celular_paciente = telefono_celular_paciente;
	}
	public String getEdad_paciente() {
		return edad_paciente;
	}
	public void setEdad_paciente(String edad_paciente) {
		this.edad_paciente = edad_paciente;
	}
	public String getSexo_paciente() {
		return sexo_paciente;
	}
	public void setSexo_paciente(String sexo_paciente) {
		this.sexo_paciente = sexo_paciente;
	}
	public String getCorreo_electronico_paciente() {
		return correo_electronico_paciente;
	}
	public void setCorreo_electronico_paciente(String correo_electronico_paciente) {
		this.correo_electronico_paciente = correo_electronico_paciente;
	}
	public String getEstado_civil_paciente() {
		return estado_civil_paciente;
	}
	public void setEstado_civil_paciente(String estado_civil_paciente) {
		this.estado_civil_paciente = estado_civil_paciente;
	}
	public String getOcupacion_paciente() {
		return ocupacion_paciente;
	}
	public void setOcupacion_paciente(String ocupacion_paciente) {
		this.ocupacion_paciente = ocupacion_paciente;
	}
	public String getEstado_paciente() {
		return estado_paciente;
	}
	public void setEstado_paciente(String estado_paciente) {
		this.estado_paciente = estado_paciente;
	}
	public Conectar getCx() {
		return cx;
	}
	public void setCx(Conectar cx) {
		this.cx = cx;
	}
	public int registrar_registrarpaciente(RegistrarPaciente rp){
		cx.con();
		String com="INSERT INTO PACIENTE (ID_USR,TIPO_USR,NOMRE_USR,PASSWORD_USR,CONFIRM_PASSWORD_USR,NOMBRE1_USR,NOMBRE2_USR,APELLIDO1_USR,APELLIDO2_USR,CEDULA_USR,FECNAC_USR,LUGARNAC_USR,DIRECCION_USR,TELFDOM_USR,TELFCEL_USR,EDAD_USR,SEXO_USR,CORREOE_USR,ESTADOCIVIL_USR,OCUPACION_PACIENTE,ESTADO_USR)"
				+"VALUES (null,'"+rp.getTipo_paciente()+"','"+rp.getNombre_usuario_paciente()
				+"','"+rp.getPassword_paciente()+"','"+rp.getConfirm_password_paciente()
				+"','"+rp.getNombre1_paciente()
				+"','"+rp.getNombre2_paciente()+"','"+rp.getApellido1_paciente()
				+"','"+rp.getApellido2_paciente()+"','"+rp.getCedula_paciente()
				+"','"+rp.getFecha_nacimiento_paciente()+"','"+rp.getLugar_nacimiento_paciente()
				+"','"+rp.getDirección_paciente()+"','"+rp.getTelefono_domicilio_paciente()
				+"','"+rp.getTelefono_celular_paciente()
				+"','"+rp.getEdad_paciente()+"','"+rp.getSexo_paciente()
				+"','"+rp.getCorreo_electronico_paciente()+"','"+rp.getEstado_civil_paciente()
				+"','"+rp.getOcupacion_paciente()+"','"+rp.getEstado_paciente()+"')";//hacemos la consulta sql
		int res=cx.execQuery(com);//ejecutamos la consulta
		cx.desconectar();//cerramos la conexion
		
		//System.out.println(rp);
		
		System.out.println("Llego a la clase RegistrarPaciente del Modelo");
		//int res=0;
		return res;
	}
	
	public int actualizar_registrarpaciente(RegistrarPaciente rp){
		int res=0;
		return res;
	}
	
	public int eliminar_registrarpaciente(RegistrarPaciente rp){
		
		int res=0;
		return res;
	}
	public void listar_registrarpaciente(){
		
	}
	
	public ResultSet buscar_paciente(RegistrarPaciente rp){
		String com="SELECT * FROM PACIENTE WHERE ID_USR='"+rp.getId_paciente()+"'";
		ResultSet rs=cx.getDatos(com);
		return rs;
		
	}

}

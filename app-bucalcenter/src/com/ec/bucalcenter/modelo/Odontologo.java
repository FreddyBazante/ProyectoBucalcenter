package com.ec.bucalcenter.modelo;

import java.sql.ResultSet;

public class Odontologo {

	private int id_odontologo;
	private int id_horario_odontologo;
	private int id_especialidad_odontologo;
	private String nombre_usuario_odontologo;
	private String password_odontologo;
	private String confirm_password_odontologo;
	private String tipo_odontologo;
	private String nombre1_odontologo;
	private String nombre2_odontologo;
	private String apellido1_odontologo;
	private String apellido2_odontologo;
	private String cedula_odontologo;
	private String fecha_nacimiento_odontologo;
	private String lugar_nacimiento_odontologo;
	private String dirección_odontologo;
	private String telefono_domicilio_odontologo;
	private String telefono_celular_odontologo;
	private String edad_odontologo;
	private String sexo_odontologo;
	private String correo_electronico_odontologo;
	private String estado_civil_odontologo;
	private String estado_odontologo;
	private String hora_entrada_odontologo;
	private String hora_salida_odontologo;
	private String citas_maximas_odontologo;
	Conectar cx= new Conectar();
	public Odontologo() {
		// TODO Auto-generated constructor stub
	}
	
	

	
	public int getId_odontologo() {
		return id_odontologo;
	}




	public void setId_odontologo(int id_odontologo) {
		this.id_odontologo = id_odontologo;
	}




	public int getId_horario_odontologo() {
		return id_horario_odontologo;
	}




	public void setId_horario_odontologo(int id_horario_odontologo) {
		this.id_horario_odontologo = id_horario_odontologo;
	}




	public int getId_especialidad_odontologo() {
		return id_especialidad_odontologo;
	}




	public void setId_especialidad_odontologo(int id_especialidad_odontologo) {
		this.id_especialidad_odontologo = id_especialidad_odontologo;
	}




	public String getNombre_usuario_odontologo() {
		return nombre_usuario_odontologo;
	}




	public void setNombre_usuario_odontologo(String nombre_usuario_odontologo) {
		this.nombre_usuario_odontologo = nombre_usuario_odontologo;
	}




	public String getPassword_odontologo() {
		return password_odontologo;
	}




	public void setPassword_odontologo(String password_odontologo) {
		this.password_odontologo = password_odontologo;
	}




	public String getTipo_odontologo() {
		return tipo_odontologo;
	}




	public void setTipo_odontologo(String tipo_odontologo) {
		this.tipo_odontologo = tipo_odontologo;
	}




	public String getNombre1_odontologo() {
		return nombre1_odontologo;
	}




	public void setNombre1_odontologo(String nombre1_odontologo) {
		this.nombre1_odontologo = nombre1_odontologo;
	}




	public String getNombre2_odontologo() {
		return nombre2_odontologo;
	}




	public void setNombre2_odontologo(String nombre2_odontologo) {
		this.nombre2_odontologo = nombre2_odontologo;
	}




	public String getApellido1_odontologo() {
		return apellido1_odontologo;
	}




	public void setApellido1_odontologo(String apellido1_odontologo) {
		this.apellido1_odontologo = apellido1_odontologo;
	}




	public String getApellido2_odontologo() {
		return apellido2_odontologo;
	}




	public void setApellido2_odontologo(String apellido2_odontologo) {
		this.apellido2_odontologo = apellido2_odontologo;
	}




	public String getCedula_odontologo() {
		return cedula_odontologo;
	}




	public void setCedula_odontologo(String cedula_odontologo) {
		this.cedula_odontologo = cedula_odontologo;
	}




	public String getFecha_nacimiento_odontologo() {
		return fecha_nacimiento_odontologo;
	}




	public void setFecha_nacimiento_odontologo(String fecha_nacimiento_odontologo) {
		this.fecha_nacimiento_odontologo = fecha_nacimiento_odontologo;
	}




	public String getLugar_nacimiento_odontologo() {
		return lugar_nacimiento_odontologo;
	}




	public void setLugar_nacimiento_odontologo(String lugar_nacimiento_odontologo) {
		this.lugar_nacimiento_odontologo = lugar_nacimiento_odontologo;
	}




	public String getDirección_odontologo() {
		return dirección_odontologo;
	}




	public void setDirección_odontologo(String dirección_odontologo) {
		this.dirección_odontologo = dirección_odontologo;
	}




	public String getTelefono_domicilio_odontologo() {
		return telefono_domicilio_odontologo;
	}




	public void setTelefono_domicilio_odontologo(
			String telefono_domicilio_odontologo) {
		this.telefono_domicilio_odontologo = telefono_domicilio_odontologo;
	}




	public String getTelefono_celular_odontologo() {
		return telefono_celular_odontologo;
	}




	public void setTelefono_celular_odontologo(String telefono_celular_odontologo) {
		this.telefono_celular_odontologo = telefono_celular_odontologo;
	}




	public String getEdad_odontologo() {
		return edad_odontologo;
	}




	public void setEdad_odontologo(String edad_odontologo) {
		this.edad_odontologo = edad_odontologo;
	}




	public String getSexo_odontologo() {
		return sexo_odontologo;
	}




	public void setSexo_odontologo(String sexo_odontologo) {
		this.sexo_odontologo = sexo_odontologo;
	}




	public String getCorreo_electronico_odontologo() {
		return correo_electronico_odontologo;
	}




	public void setCorreo_electronico_odontologo(
			String correo_electronico_odontologo) {
		this.correo_electronico_odontologo = correo_electronico_odontologo;
	}




	public String getEstado_civil_odontologo() {
		return estado_civil_odontologo;
	}




	public void setEstado_civil_odontologo(String estado_civil_odontologo) {
		this.estado_civil_odontologo = estado_civil_odontologo;
	}




	public String getEstado_odontologo() {
		return estado_odontologo;
	}




	public void setEstado_odontologo(String estado_odontologo) {
		this.estado_odontologo = estado_odontologo;
	}




	public String getHora_entrada_odontologo() {
		return hora_entrada_odontologo;
	}




	public void setHora_entrada_odontologo(String hora_entrada_odontologo) {
		this.hora_entrada_odontologo = hora_entrada_odontologo;
	}




	public String getHora_salida_odontologo() {
		return hora_salida_odontologo;
	}




	public void setHora_salida_odontologo(String hora_salida_odontologo) {
		this.hora_salida_odontologo = hora_salida_odontologo;
	}




	public String getCitas_maximas_odontologo() {
		return citas_maximas_odontologo;
	}




	public void setCitas_maximas_odontologo(String citas_maximas_odontologo) {
		this.citas_maximas_odontologo = citas_maximas_odontologo;
	}




	public int registrar_odontologo(Odontologo o){
		cx.con();
		
		
		
		String com="INSERT INTO ODONTOLOGO (ID_USR,ID_HORARIO,ID_ESPECIALIDAD,TIPO_USR,NOMRE_USR,PASSWORD_USR,CONFIRM_PASSWORD_USR,NOMBRE1_USR,NOMBRE2_USR,APELLIDO1_USR,APELLIDO2_USR,CEDULA_USR,FECNAC_USR,LUGARNAC_USR,DIRECCION_USR,TELFDOM_USR,TELFCEL_USR,EDAD_USR,SEXO_USR,CORREOE_USR,ESTADOCIVIL_USR,ESTADO_USR,HORAENTRADA_ODONTOLOGO,HORASALIDA_ODONTOLOGO,CITAMAXIMA_ODONTOLOGO)"
				+"VALUES (null,'"+o.getId_horario_odontologo()+"','"+o.getId_especialidad_odontologo()
				+"','"+o.getTipo_odontologo()+"','"+o.getNombre_usuario_odontologo()
				+"','"+o.getPassword_odontologo()+"','"+o.getConfirm_password_odontologo()
				+"','"+o.getNombre1_odontologo()
				+"','"+o.getNombre2_odontologo()+"','"+o.getApellido1_odontologo()
				+"','"+o.getApellido2_odontologo()+"','"+o.getCedula_odontologo()
				+"','"+o.getFecha_nacimiento_odontologo()+"','"+o.getLugar_nacimiento_odontologo()
				+"','"+o.getDirección_odontologo()+"','"+o.getTelefono_domicilio_odontologo()
				+"','"+o.getTelefono_celular_odontologo()+"','"+o.getEdad_odontologo()
				+"','"+o.getSexo_odontologo()+"','"+o.getCorreo_electronico_odontologo()
				+"','"+o.getEstado_civil_odontologo()
				+"','"+o.getEstado_odontologo()+"','"+o.getHora_entrada_odontologo()
				+"','"+o.getHora_salida_odontologo()+"','"+o.getCitas_maximas_odontologo()+"')";//hacemos la consulta sql
		int res=cx.execQuery(com);//ejecutamos la consulta
		cx.desconectar();//cerramos la conexion
		
		//System.out.println(d);
		System.out.println("Llego a la clase Odontologo del Modelo");
		//int res=0;
		return res;
	}
	
	
	public int actualizar_odontologo(Odontologo o){
		cx.con();
		String com = "UPDATE ODONTOLOGO SET "+
				"ID_HORARIO='"+o.getId_horario_odontologo()+"', " +
				"ID_ESPECIALIDAD='"+o.getId_especialidad_odontologo()+"', " +
				"NOMRE_USR='"+o.getNombre_usuario_odontologo()+"', " +
				"PASSWORD_USR= '"+o.getPassword_odontologo()+"', " +
				"CONFIRM_PASSWORD_USR= '"+o.getConfirm_password_odontologo()+"', " +
				"NOMBRE1_USR= '"+o.getNombre1_odontologo()+"', " +
				"NOMBRE2_USR= '"+o.getNombre2_odontologo()+"', " +
				"APELLIDO1_USR= '"+o.getApellido1_odontologo()+"', " +
				"APELLIDO2_USR= '"+o.getApellido2_odontologo()+"', " +
				"CEDULA_USR= '"+o.getCedula_odontologo()+"', " +
				"FECNAC_USR= '"+o.getFecha_nacimiento_odontologo()+"', " +
				"LUGARNAC_USR= '"+o.getLugar_nacimiento_odontologo()+"', " +
				"DIRECCION_USR= '"+o.getDirección_odontologo()+"'," +
				"TELFDOM_USR= '"+o.getTelefono_domicilio_odontologo()+"', " +
				"TELFCEL_USR= '"+o.getTelefono_celular_odontologo()+"', " +
				"EDAD_USR= '"+o.getEdad_odontologo()+"', " +
				"SEXO_USR= '"+o.getSexo_odontologo()+"', " +
				"CORREOE_USR= '"+o.getCorreo_electronico_odontologo()+"', " +
				"ESTADOCIVIL_USR= '"+o.getEstado_civil_odontologo()+"', " +
				"ESTADO_USR= '"+o.getEstado_odontologo()+"', " +
				"HORAENTRADA_ODONTOLOGO= '"+o.getHora_entrada_odontologo()+"', " +
				"HORASALIDA_ODONTOLOGO= '"+o.getHora_salida_odontologo()+"', " +
				"CITAMAXIMA_ODONTOLOGO= '"+o.getCitas_maximas_odontologo()+"' " +
				"WHERE ID_USR='"+o.getId_odontologo()+"'";
		int res = cx.execQuery(com); //ejecutamos la consulta
		cx.desconectar(); //cerramos la conexion
		return res;	
	}
	
	public int eliminar_odontologo(Odontologo o){
		cx.con();
		String com="DELETE FROM ODONTOLOGO WHERE ID_USR='"+o.getId_odontologo()+"'";
		int res=cx.execQuery(com);
		return res;
	}
	
	public ResultSet buscar_odontologo(Odontologo o){
		String com="SELECT * FROM ODONTOLOGO WHERE ID_USR='"+o.getId_odontologo()+"'";
		ResultSet rs=cx.getDatos(com);
		return rs;
	}
	
	public ResultSet listar_odontologo(){
		String com="SELECT * FROM ODONTOLOGO";
		ResultSet rs=cx.getDatos(com);
		return rs;
	}

	public ResultSet listar_horario_odontologo(){
		String com="select *from horario where ID_HORARIO in (select ID_HORARIO from odontologo where odontologo.ID_HORARIO=horario.ID_HORARIO)";
		ResultSet rs=cx.getDatos(com);
		return rs;
	}


	public String getConfirm_password_odontologo() {
		return confirm_password_odontologo;
	}




	public void setConfirm_password_odontologo(
			String confirm_password_odontologo) {
		this.confirm_password_odontologo = confirm_password_odontologo;
	}
}

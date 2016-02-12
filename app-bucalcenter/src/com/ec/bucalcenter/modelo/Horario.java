package com.ec.bucalcenter.modelo;

import java.sql.ResultSet;

public class Horario {

	private int id_horario;
	private String hora_inicio_horario;
	private String hora_fin_horario;
	private String hora_Lunes_horario;
	private String hora_Martes_horario;
	private String hora_Miercoles_horario;
	private String hora_Jueves_horario;
	private String hora_Viernes_horario;
	Conectar cx= new Conectar();
	
	public Horario() {
		// TODO Auto-generated constructor stub
	}

	public int getId_horario() {
		return id_horario;
	}

	public void setId_horario(int id_horario) {
		this.id_horario = id_horario;
	}

	public String getHora_inicio_horario() {
		return hora_inicio_horario;
	}

	public void setHora_inicio_horario(String hora_inicio_horario) {
		this.hora_inicio_horario = hora_inicio_horario;
	}

	public String getHora_fin_horario() {
		return hora_fin_horario;
	}

	public void setHora_fin_horario(String hora_fin_horario) {
		this.hora_fin_horario = hora_fin_horario;
	}

	public String getHora_Lunes_horario() {
		return hora_Lunes_horario;
	}

	public void setHora_Lunes_horario(String hora_Lunes_horario) {
		this.hora_Lunes_horario = hora_Lunes_horario;
	}

	public String getHora_Martes_horario() {
		return hora_Martes_horario;
	}

	public void setHora_Martes_horario(String hora_Martes_horario) {
		this.hora_Martes_horario = hora_Martes_horario;
	}

	public String getHora_Miercoles_horario() {
		return hora_Miercoles_horario;
	}

	public void setHora_Miercoles_horario(String hora_Miercoles_horario) {
		this.hora_Miercoles_horario = hora_Miercoles_horario;
	}

	public String getHora_Jueves_horario() {
		return hora_Jueves_horario;
	}

	public void setHora_Jueves_horario(String hora_Jueves_horario) {
		this.hora_Jueves_horario = hora_Jueves_horario;
	}

	public String getHora_Viernes_horario() {
		return hora_Viernes_horario;
	}

	public void setHora_Viernes_horario(String hora_Viernes_horario) {
		this.hora_Viernes_horario = hora_Viernes_horario;
	}

	public int registrar_horario(Horario h){
		cx.con();
		String com="INSERT INTO HORARIO (ID_HORARIO,HORAINICIO_HORARIO,HORAFIN_HORARIO,LUNES_HORARIO,"
				+ "MARTES_HORARIO,MIERCOLES_HORARIO,JUEVES_HORARIO,VIERNES_HORARIO)"
				+"VALUES (null,'"+h.getHora_inicio_horario()+"','"+h.getHora_fin_horario()
				+"','"+h.getHora_Lunes_horario()+"','"+h.getHora_Martes_horario()
				+"','"+h.getHora_Miercoles_horario()+"','"+h.getHora_Jueves_horario()
				+"','"+h.getHora_Viernes_horario()+"')";//hacemos la consulta sql
		int res=cx.execQuery(com);//ejecutamos la consulta
		cx.desconectar();//cerramos la conexion
		//System.out.println(p);
		System.out.println("Llego a la clase Horario del Modelo");
		//int res=0;
		return res;
	}
	
	public int actualizar_horario(Horario h){
		cx.con();
		String com = "UPDATE HORARIO SET "+
				"HORAINICIO_HORARIO='"+h.getHora_inicio_horario()+"', " +
				"HORAFIN_HORARIO= '"+h.getHora_fin_horario()+"', " +
				"LUNES_HORARIO= '"+h.getHora_Lunes_horario()+"', " +
				"MARTES_HORARIO= '"+h.getHora_Martes_horario()+"', " +
				"MIERCOLES_HORARIO= '"+h.getHora_Miercoles_horario()+"', " +
				"JUEVES_HORARIO= '"+h.getHora_Jueves_horario()+"', " +
				"VIERNES_HORARIO= '"+h.getHora_Viernes_horario()+"', " +
				"WHERE ID_HORARIO='"+h.getId_horario()+"'";
		int res = cx.execQuery(com); //ejecutamos la consulta
		cx.desconectar(); //cerramos la conexion
		return res;
	}
	
	public int eliminar_horario(Horario h){
		cx.con();
		String com="DELETE FROM HORARIO WHERE ID_HORARIO='"+h.getId_horario()+"'";
		int res=cx.execQuery(com);
		return res;
	}
	public ResultSet buscar_horario(Horario h){
		String com="SELECT * FROM HORARIO WHERE ID_HORARIO='"+h.getId_horario()+"'";
		ResultSet rs=cx.getDatos(com);
		return rs;
	}
	public ResultSet listar_horario(){
		String com="SELECT * FROM HORARIO";
		ResultSet rs=cx.getDatos(com);
		return rs;
		
	}
	


}

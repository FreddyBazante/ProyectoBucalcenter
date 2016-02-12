package com.ec.bucalcenter.modelo;

import java.sql.ResultSet;

public class Especialidad {

	private int id_especialidad;
	private String nombre_especialidad;
	Conectar cx= new Conectar();
	
	public Especialidad() {
		// TODO Auto-generated constructor stub
	}

	public int getId_especialidad() {
		return id_especialidad;
	}

	public void setId_especialidad(int id_especialidad) {
		this.id_especialidad = id_especialidad;
	}

	public String getNombre_especialidad() {
		return nombre_especialidad;
	}

	public void setNombre_especialidad(String nombre_especialidad) {
		this.nombre_especialidad = nombre_especialidad;
	}
	
	public int registrar_especialidad(Especialidad es){
		cx.con();
		String com="INSERT INTO ESPECIALIDAD (ID_ESPECIALIDAD,NOMBRE_ESPECIALIDAD)"
				+"VALUES (null,'"+es.getNombre_especialidad()+"')";//hacemos la consulta sql
		int res=cx.execQuery(com);//ejecutamos la consulta
		cx.desconectar();//cerramos la conexion
		//System.out.println(p);
		System.out.println("Llego a la clase Especialidad del Modelo");
		//int res=0;
		return res;
	}
	
	public int actualizar_especialidad(Especialidad es){
		cx.con();
		String com = "UPDATE ESPECIALIDAD SET "+
				"NOMBRE_ESPECIALIDAD='"+es.getNombre_especialidad()+"' " +
				"WHERE ID_ESPECIALIDAD='"+es.getId_especialidad()+"'";
		int res = cx.execQuery(com); //ejecutamos la consulta
		cx.desconectar(); //cerramos la conexion
		return res;	
	}
	
	public int eliminar_especialidad(Especialidad es){
		cx.con();
		String com="DELETE FROM ESPECIALIDAD WHERE ID_ESPECIALIDAD='"+es.getId_especialidad()+"'";
		int res=cx.execQuery(com);
		return res;
	}
	
	public ResultSet buscar_especialidad(Especialidad es){
		String com="SELECT * FROM ESPECIALIDAD WHERE ID_ESPECIALIDAD='"+es.getId_especialidad()+"'";
		ResultSet rs=cx.getDatos(com);
		return rs;
	}
	
	public ResultSet listar_especialidad(){
		String com="SELECT * FROM ESPECIALIDAD";
		ResultSet rs=cx.getDatos(com);
		return rs;
		
	}
	

}

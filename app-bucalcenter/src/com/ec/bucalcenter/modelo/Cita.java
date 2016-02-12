package com.ec.bucalcenter.modelo;

import java.sql.ResultSet;

public class Cita {
	
	private int id_cita;
	private int id_paciente;
	private int id_odontologo;
	private String fecha_cita;
	private String hora_cita;
	private String estado_cita;
	Conectar cx= new Conectar();	
	public Cita() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_cita() {
		return id_cita;
	}

	public void setId_cita(int id_cita) {
		this.id_cita = id_cita;
	}

	public int getId_paciente() {
		return id_paciente;
	}

	public void setId_paciente(int id_paciente) {
		this.id_paciente = id_paciente;
	}

	public int getId_odontologo() {
		return id_odontologo;
	}

	public void setId_odontologo(int id_odontologo) {
		this.id_odontologo = id_odontologo;
	}

	public String getFecha_cita() {
		return fecha_cita;
	}

	public void setFecha_cita(String fecha_cita) {
		this.fecha_cita = fecha_cita;
	}

	public String getHora_cita() {
		return hora_cita;
	}

	public void setHora_cita(String hora_cita) {
		this.hora_cita = hora_cita;
	}

	public int registrar_cita(Cita c){
		cx.con();
		String com="INSERT INTO CITA (ID_CITA,ID_USR,ODO_ID_USR,FECHA_CITA,HORA_CITA,ESTADO_CITA)"
				+"VALUES (null,'"+c.getId_paciente()+"','"+c.getId_odontologo()
				+"','"+c.getFecha_cita()+"','"+c.getHora_cita()+"','"+c.getEstado_cita()+"')";//hacemos la consulta sql
		int res=cx.execQuery(com);//ejecutamos la consulta
		cx.desconectar();//cerramos la conexion
		//System.out.println(p);
		System.out.println("Llego a la clase Cita del Modelo");
		//int res=0;
		return res;
	}
	
	public int actualizar_cita(Cita c){
		cx.con();
		String com = "UPDATE CITA SET " +
				"ID_USR='"+c.getId_paciente()+"', " +
						"ODO_ID_USR='"+c.getId_odontologo()+"'," +
								"FECHA_CITA='"+c.getFecha_cita()+"'," +
										"HORA_CITA='"+c.getHora_cita()+"'," +
												"estado='"+c.getEstado_cita()+"' " +
														"WHERE ID_CITA='"+c.getId_cita()+"'";
		int res = cx.execQuery(com); //ejecutamos la consulta
		cx.desconectar(); //cerramos la conexion
		return res;	
	}
	
	public int eliminar_Cita(Cita c){
		cx.con();
		String com="DELETE FROM CITA WHERE ID_CITA='"+c.getId_cita()+"'";
		int res=cx.execQuery(com);
		return res;
	}
	
	public ResultSet buscar_cita(Cita c){
		String com="SELECT * FROM CITA WHERE ID_CITA='"+c.getId_cita()+"'";
		ResultSet rs=cx.getDatos(com);
		return rs;
	}
	
	public ResultSet listar_Cita_paciente(Cita c){
		
		System.out.println(c.getId_paciente());
		String com="select *from cita where ID_USR='"+c.getId_paciente()+"'";
		ResultSet rs=cx.getDatos(com);
		return rs;
		
	}
	
	public ResultSet listar_Cita_odontologo(){
		String com="select cita.ID_CITA,odontologo.NOMBRE1_USR,odontologo.APELLIDO1_USR,paciente.NOMBRE1_USR,paciente.APELLIDO1_USR,cita.FECHA_CITA,cita.HORA_CITA,cita.ESTADO_CITA from odontologo inner join cita on cita.ODO_ID_USR=Odontologo.ID_USR  inner join paciente on cita.ID_USR=paciente.ID_USR";
		ResultSet rs=cx.getDatos(com);
		return rs;
		
	}
	
	public ResultSet listar_Cita(){
		String com="SELECT * FROM CITA";
		ResultSet rs=cx.getDatos(com);
		return rs;
		
	}
	
	public ResultSet buscar_Cita(Cita c){
		String com="SELECT * FROM CITA WHERE ID_CITA='"+c.getId_cita()+"'";
		ResultSet rs=cx.getDatos(com);
		return rs;
		
	}
	
	public ResultSet paginacionCita(int pg){
		String com = "select cita.ID_CITA,odontologo.NOMBRE1_USR,odontologo.APELLIDO1_USR,paciente.NOMBRE1_USR,paciente.APELLIDO1_USR,cita.FECHA_CITA,cita.HORA_CITA,cita.ESTADO_CITA from odontologo inner join cita on cita.ODO_ID_USR=Odontologo.ID_USR  inner join paciente on cita.ID_USR=paciente.ID_USR LIMIT "+pg;
		ResultSet rs = cx.getDatos(com);
		return rs;
	}

	public String getEstado_cita() {
		return estado_cita;
	}

	public void setEstado_cita(String estado_cita) {
		this.estado_cita = estado_cita;
	}
	

}

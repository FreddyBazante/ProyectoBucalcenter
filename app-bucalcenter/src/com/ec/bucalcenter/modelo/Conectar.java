package com.ec.bucalcenter.modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conectar {
	private Connection con = null;
	private Statement consulta = null;
	private ResultSet data = null;
	private String server;
	private String BD;
	private String userBD;
	private String passwBD;
	public int MAXROW = 5;
	
	public Conectar(){
		this.server = "127.0.0.1"; //localhost
		this.BD = "bucalcenter"; 		//nombre de la base de datos
		this.userBD = "root";		//usuario de la base de datos
		this.passwBD = "admin";	//password del usuario
	}
	//metodo para abrir la conexion
	public void con(){
		try {
			Class.forName("com.mysql.jdbc.Driver");	//cargamos el driver registramos
			String url = "jdbc:mysql://"+this.server+"/"+this.BD;
			this.con = DriverManager.getConnection(url,this.userBD,this.passwBD); //abrimos la conexion
			System.out.println("Conexion exitosa..ok");
			this.consulta = con.createStatement(); //inicializamos el objeto Statement para SQL
		} catch (Exception e) {
			System.out.println("Eror de Conexion "+e.getMessage());
		}
	}
	//metodo para cerrar la conexion
	public void desconectar(){
		try {
			if(con!=null){
				this.con.close();
			}
		} catch (Exception e) {
			System.out.println("Error de desconexion "+e.getMessage());
		}
	}
	//metodo para ejecutar SQL Insert Update Delete
	public int execQuery(String com){
		int res = 0;
		try {
			this.con();
			res = this.consulta.executeUpdate(com);
		} catch (Exception e) {
			System.out.println("Error de Ejecucion "+e.getMessage());
		}
		return res;
	}
	//metodo para ejecutar SELECT
	public ResultSet getDatos(String com){
		try {
			this.con();
			this.data = this.consulta.executeQuery(com);			
		} catch (Exception e) {
			System.out.println("Error de la consulta "+e.getMessage());
		}
		return data;
	}
	//PAGINACION  ES DECIR MUESTRA DE 10 EN 10 SEGUN LO DESEE
	public int contarFilas(String com){
		 try {
			 this.con();
			 this.data = this.consulta.executeQuery(com);
			 int contador = 0;
			 while(data.next()){ //recorre todo el resulset
				 contador++;	//sumara las veces que haya registros
			 }
			 return contador; //devuelve cantidad de registros
		} catch (Exception e) {
			System.out.println("Error al contar registros "+e.getMessage());
			System.out.println(com);
			return 0;
		}		 
	 }
}

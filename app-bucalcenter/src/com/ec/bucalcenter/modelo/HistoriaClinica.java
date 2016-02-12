package com.ec.bucalcenter.modelo;

public class HistoriaClinica {

	private int id_historiaclinica;
	private int id_paciente_historiaclinica;
	private int id_odontologo_historiaclinica;
	private String tipo_sangre_historiaclinica;
	private String peso_historiaclinica;
	private String altura_historiaclinica;
	private String riesgo_historiaclinica;
	private String antecedentes_historiaclinica;
	private String motivoconsulta_historiaclinica;
	public HistoriaClinica() {
		// TODO Auto-generated constructor stub
	}
	
	public int getId_historiaclinica() {
		return id_historiaclinica;
	}

	public void setId_historiaclinica(int id_historiaclinica) {
		this.id_historiaclinica = id_historiaclinica;
	}

	public int getId_paciente_historiaclinica() {
		return id_paciente_historiaclinica;
	}

	public void setId_paciente_historiaclinica(int id_paciente_historiaclinica) {
		this.id_paciente_historiaclinica = id_paciente_historiaclinica;
	}

	public int getId_odontologo_historiaclinica() {
		return id_odontologo_historiaclinica;
	}

	public void setId_odontologo_historiaclinica(int id_odontologo_historiaclinica) {
		this.id_odontologo_historiaclinica = id_odontologo_historiaclinica;
	}

	public String getTipo_sangre_historiaclinica() {
		return tipo_sangre_historiaclinica;
	}

	public void setTipo_sangre_historiaclinica(String tipo_sangre_historiaclinica) {
		this.tipo_sangre_historiaclinica = tipo_sangre_historiaclinica;
	}

	public String getPeso_historiaclinica() {
		return peso_historiaclinica;
	}

	public void setPeso_historiaclinica(String peso_historiaclinica) {
		this.peso_historiaclinica = peso_historiaclinica;
	}

	public String getAltura_historiaclinica() {
		return altura_historiaclinica;
	}

	public void setAltura_historiaclinica(String altura_historiaclinica) {
		this.altura_historiaclinica = altura_historiaclinica;
	}

	public String getRiesgo_historiaclinica() {
		return riesgo_historiaclinica;
	}

	public void setRiesgo_historiaclinica(String riesgo_historiaclinica) {
		this.riesgo_historiaclinica = riesgo_historiaclinica;
	}

	public String getAntecedentes_historiaclinica() {
		return antecedentes_historiaclinica;
	}

	public void setAntecedentes_historiaclinica(String antecedentes_historiaclinica) {
		this.antecedentes_historiaclinica = antecedentes_historiaclinica;
	}

	public String getMotivoconsulta_historiaclinica() {
		return motivoconsulta_historiaclinica;
	}

	public void setMotivoconsulta_historiaclinica(
			String motivoconsulta_historiaclinica) {
		this.motivoconsulta_historiaclinica = motivoconsulta_historiaclinica;
	}

	public int registrar_historiaclinica(HistoriaClinica hc){
		int res=0;
		return res;
	}
	
	public int actualizar_historiaclinica(HistoriaClinica hc){
		int res=0;
		return res;
	}
	public int eliminar_historiaclinica(HistoriaClinica hc){
		int res=0;
		return res;
	}

}

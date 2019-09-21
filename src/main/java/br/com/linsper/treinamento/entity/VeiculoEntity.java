package br.com.linsper.treinamento.entity;

import java.util.List;

import br.com.linsper.treinamento.interfaces.VeiculoInterface;

public abstract class VeiculoEntity implements VeiculoInterface{

	protected String placa;
	protected int numeroPortas;
	protected String modelo;
	protected int anoFabricacao;
	protected int anoModelo;
	protected String cor;
	protected String chassi;
	
	private List<String> nomeMotorista; //= {"João","Talissa", "Jefferson"};
	
	private static Integer NUMERO_RETROVISORES = 2; // constante
	
	public VeiculoEntity() {
	}
	
	public VeiculoEntity(int numeroMotoristas){
	}
	
	public List<String> getNomeMotorista() {
		return nomeMotorista;
	}
	
	public void setNomeMotorista(List<String> nomeMotorista) {
		this.nomeMotorista = nomeMotorista;
	}
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getNumeroPortas() {
		return numeroPortas;
	}
	public void setNumeroPortas(int numeroPortas) {
		this.numeroPortas = numeroPortas;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	
	/**
	 * Método usado para definir o ano da fabricação
	 * */
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public int getAnoModelo() {
		return anoModelo;
	}
	public void setAnoModelo(int anoModelo) {
		this.anoModelo = anoModelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
}

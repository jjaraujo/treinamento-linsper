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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((placa == null) ? 0 : placa.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VeiculoEntity other = (VeiculoEntity) obj;
		if (placa == null) {
			if (other.placa != null)
				return false;
		} else if (!placa.equals(other.placa))
			return false;
		return true;
	}
	
	
	
}

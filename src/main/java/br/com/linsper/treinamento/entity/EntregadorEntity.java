package br.com.linsper.treinamento.entity;

public class EntregadorEntity extends FuncionarioEntity {

	private int id;
	private String placaVeiculo;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPlacaVeiculo() {
		return placaVeiculo;
	}
	public void setPlacaVeiculo(String placaVeiculo) {
		this.placaVeiculo = placaVeiculo;
	}
	
	

}

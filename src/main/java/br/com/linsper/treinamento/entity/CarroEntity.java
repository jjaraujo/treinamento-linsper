package br.com.linsper.treinamento.entity;

public class CarroEntity extends VeiculoEntity{

	private final int NUMERO_RETROVISORES;
	
	public CarroEntity() {
		NUMERO_RETROVISORES = 3;
	}
	
	
	public boolean carroDoAno(int anoFabricacao) {
		return this.anoFabricacao == anoFabricacao ? true : false;
	}
}

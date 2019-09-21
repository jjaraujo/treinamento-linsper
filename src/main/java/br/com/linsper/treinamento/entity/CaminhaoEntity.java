package br.com.linsper.treinamento.entity;

public class CaminhaoEntity extends VeiculoEntity{

	public CaminhaoEntity(int numeroMotoristas) {
		super(numeroMotoristas);
	}
	
	public String mudarCor() {
		return "BRANCO";
	}

	public double tamanhoVolante() {
		return 35.5;
	}

}

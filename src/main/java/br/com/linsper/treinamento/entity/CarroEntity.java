package br.com.linsper.treinamento.entity;

public class CarroEntity extends VeiculoEntity{

	public CarroEntity(int numeroMotoristas) {
		super(numeroMotoristas);
	}
	
	public CarroEntity() {
		
	}
	
	public CarroEntity(String placa) {
		this.placa = placa;
	}

	public static int NUMERO_RETROVISORES = 3;
	

	
	
	public static boolean carroDoAno(int anoFabricacao, String teste) {
		return false;
	}
	
	public static boolean carroDoAno(String anoFabricacao) {
		return false;
	}


	public String mudarCor() {
		return "VERDE";
	}

	public double tamanhoVolante() {
		return 20.5;
	}
	
	@Override
	public String toString() {
		return "'Chassi: " + chassi + ", Placa: " + placa + "'";
	}
	
	
	
}

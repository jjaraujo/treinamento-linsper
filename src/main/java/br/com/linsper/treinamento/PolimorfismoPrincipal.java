package br.com.linsper.treinamento;

import br.com.linsper.treinamento.entity.CarroEntity;
import br.com.linsper.treinamento.entity.VeiculoEntity;


/**
 * Classe usada para cria��o de objetos usando 
 * polimorfismo e tratamento de exce��es
 * */
public class PolimorfismoPrincipal {

	
	public static void main(String args[]) {
		CarroEntity carro = new CarroEntity("PLACA"); // objeto 1
		//carro = new CarroEntity();
		VeiculoEntity veiculo = new CarroEntity(); // objeto 2
		
		veiculo.setAnoFabricacao(2019);// m�todo da classe VeiculoEntity
		veiculo.mudarCor();// m�todo da interface VeiculoInterface
		
		//carro.carroDoAno(0);		
		
		//int, double, float, boolean
		String c = "678c";
				
		try{
			Double i = Double.parseDouble(c);
			System.out.println("N�mero correto: " + i);
		}catch(NullPointerException | NumberFormatException e) {
			System.out.println(e.getMessage());
			System.out.println("N�mero errado: " + c);
		}
		System.out.println(carro.getPlaca().length());
	}
}
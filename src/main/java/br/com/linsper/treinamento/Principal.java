package br.com.linsper.treinamento;

import br.com.linsper.treinamento.entity.CaminhaoEntity;
import br.com.linsper.treinamento.entity.CarroEntity;
import br.com.linsper.treinamento.entity.VeiculoEntity;

public class Principal {

	public static void main(String args[]) {
		CarroEntity carro = new CarroEntity(); // ojbeto 1
		VeiculoEntity veiculo = new CaminhaoEntity(); // objeto 2
		
		veiculo.setAnoFabricacao(2019);
		carro.carroDoAno(0);		
		
		System.out.println(veiculo.getPlaca());
	}
}
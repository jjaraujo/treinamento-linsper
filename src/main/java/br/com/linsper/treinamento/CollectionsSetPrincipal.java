package br.com.linsper.treinamento;

import java.util.HashSet;
import java.util.Set;

import br.com.linsper.treinamento.entity.CarroEntity;

public class CollectionsSetPrincipal {

	public static void main(String[] args) {
		CarroEntity carro1 = new CarroEntity();
		CarroEntity carro2 = new CarroEntity();
		carro1.setChassi("chassi carro 1");
		Set<CarroEntity> conjuntoCarros = new HashSet<>();
		carro2.setPlaca("PLACA CARRO 2");
		carro1.setPlaca("PLACA CARRO 2");
		conjuntoCarros.add(carro1);
		conjuntoCarros.add(carro2);
		
		System.out.println(conjuntoCarros);
	}

}

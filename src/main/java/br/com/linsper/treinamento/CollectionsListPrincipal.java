package br.com.linsper.treinamento;

import java.util.ArrayList;
import java.util.List;

import br.com.linsper.treinamento.entity.CarroEntity;
import br.com.linsper.treinamento.entity.VeiculoEntity;

public class CollectionsListPrincipal {

	public static void main(String[] args) {
		VeiculoEntity veiculo = new CarroEntity(); // polimorfismo (o Carro entity é um veículo graças a herança)
		veiculo.setNomeMotorista(new ArrayList<String>());
		List<String> nomes = veiculo.getNomeMotorista();
		nomes.add("João"); // adiciona um valor na próxima posição da lista
		nomes.add("Talissa");
		nomes.add("Jefferson");
		
		System.out.println(nomes.get(1));
		boolean contemJoao = nomes.contains("João");
		nomes.add(1, "Bruno"); // adiciona um novo valor a uma posição existente da lista
		System.out.println(nomes);
		nomes.clear(); // limpa a lista
		int posicaoTalissa = nomes.indexOf("Talissa");
		
		nomes.add("Jefferson");
		System.out.println(nomes);
	}
}

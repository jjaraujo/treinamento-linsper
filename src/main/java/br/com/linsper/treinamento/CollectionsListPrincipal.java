package br.com.linsper.treinamento;

import java.util.ArrayList;
import java.util.List;

import br.com.linsper.treinamento.entity.CarroEntity;
import br.com.linsper.treinamento.entity.VeiculoEntity;

public class CollectionsListPrincipal {

	public static void main(String[] args) {
		VeiculoEntity veiculo = new CarroEntity(); // polimorfismo (o Carro entity � um ve�culo gra�as a heran�a)
		veiculo.setNomeMotorista(new ArrayList<String>());
		List<String> nomes = veiculo.getNomeMotorista();
		nomes.add("Jo�o"); // adiciona um valor na pr�xima posi��o da lista
		nomes.add("Talissa");
		nomes.add("Jefferson");
		
		System.out.println(nomes.get(1));
		boolean contemJoao = nomes.contains("Jo�o");
		nomes.add(1, "Bruno"); // adiciona um novo valor a uma posi��o existente da lista
		System.out.println(nomes);
		nomes.clear(); // limpa a lista
		int posicaoTalissa = nomes.indexOf("Talissa");
		
		nomes.add("Jefferson");
		System.out.println(nomes);
	}
}

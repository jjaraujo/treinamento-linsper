package br.com.linsper.treinamento;

import java.util.ArrayList;
import java.util.List;

import br.com.linsper.treinamento.entity.CarroEntity;
import br.com.linsper.treinamento.entity.VeiculoEntity;

public class CollectionsPrincipal {

	public static void main(String[] args) {
		VeiculoEntity veiculo = new CarroEntity();
		veiculo.setNomeMotorista(new ArrayList<String>());
		List<String> nomes = veiculo.getNomeMotorista();
		nomes.add("João");
		nomes.add("Talissa");
		nomes.add("Jefferson");
		
		System.out.println(nomes.get(1));
		boolean contemJoao = nomes.contains("João");
		nomes.add(1, "Bruno");
		System.out.println(nomes);
		nomes.clear();
		int posicaoTalissa = nomes.indexOf("Talissa");
		
		nomes.add("Jefferson");
		System.out.println(nomes);
		
	}
}

package br.com.linsper.treinamento.service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.linsper.treinamento.entity.FuncionarioEntity;
import br.com.linsper.treinamento.repository.FuncionarioRepository;

@Service
public class FuncionarioService {
	
	@Autowired
	private FuncionarioRepository funcionarioRepository;
	
	public void teste() {
		System.out.println(funcionarioRepository.findByNome("JOAO"));
	}
	
	public void insert(FuncionarioEntity entity) {
		funcionarioRepository.save(entity); // salvar dados
	}
	
	public Iterable<FuncionarioEntity> listAll(){
		Iterable<FuncionarioEntity> resultado = funcionarioRepository.findAll();
		return resultado;
	}
	
	
}

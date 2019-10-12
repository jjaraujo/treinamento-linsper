package br.com.linsper.treinamento.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.linsper.treinamento.entity.FuncionarioEntity;

@Repository
public interface FuncionarioRepository extends CrudRepository<FuncionarioEntity, UUID> {
	
	//"SELECT f FROM FuncionarioEntity f WHERE f.nome = :nome AND telefonePessoal = :telefone  "
	//		" AND endereco.cep = :cep " 
	//JPQL -> Linguagem do JPA -> Javax Persistence Query Language
	//HQL -> Hibernate Query Language
	@Query("SELECT f FROM FuncionarioEntity f WHERE f.nome = ?1 AND telefonePessoal = ?2 AND endereco.cep = ?3")
	public FuncionarioEntity buscarPorNomeAndTelefoneAndCep(String nome, String telefone, String cep);
	
	public FuncionarioEntity findByNome(String nomePessoa);

//	public List<FuncionarioEntity> findByNome(String nome); está comentado, mas funcionaria normalmente. Use como exemplo para retornar os resultados em uma lista
	
}


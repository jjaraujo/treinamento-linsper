package br.com.linsper.treinamento.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empresa")
public class EmpresaEntity {
	
	@Id
	public UUID id;
	private String razaoSocial;
	private String cnpj;
	private String telefone;
	@ManyToOne
	@JoinColumn
	private EnderecoEntity endereco;
	
	public static int variavelStatic;
	
	public EmpresaEntity() {

	}

	public UUID getId() {
		return id;
	}
	/**
	 * NAO PODE RECEBER VALOR NULO
	 * */
	public void setId(UUID id) {
		if(id == null) {
			this.id = UUID.randomUUID();
			return;
		}
		this.id = id;
	}

	public String getRazaoSocial() {
		
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public EnderecoEntity getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpresaEntity other = (EmpresaEntity) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
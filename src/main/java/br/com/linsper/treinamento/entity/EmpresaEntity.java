package br.com.linsper.treinamento.entity;

public class EmpresaEntity {
	
	public Integer id;
	private String razaoSocial;
	private String cnpj;
	private String telefone;
	private EnderecoEntity endereco;
	
	public static int variavelStatic;
	
	public EmpresaEntity() {

	}

	public Integer getId() {
		return id * 7;
	}
	/**
	 * NAO PODE RECEBER VALOR NULO
	 * */
	public void setId(Integer id) {
		if(id == null) {
			this.id = 0;
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
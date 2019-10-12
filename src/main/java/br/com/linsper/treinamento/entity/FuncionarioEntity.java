package br.com.linsper.treinamento.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
 
@Entity
@Table(name = "funcionario")
public class FuncionarioEntity {
	
	@Id
	protected UUID id;
	protected String nome;
	protected String  telefonePessoal;
	protected String  tipoFuncionario;
	protected String  dataContratacao;
	@ManyToOne // anotação para definir chave estrangeira
	@JoinColumn // para fazer o join da coluna endereco com acoluna  id da tabela endereco 
	protected EnderecoEntity endereco;
	@ManyToOne
	@JoinColumn
	protected EmpresaEntity empresa;
	protected double salario;
	
	public FuncionarioEntity(String nome, EmpresaEntity empresa) {
		this.nome=nome;
		this.empresa=empresa;
	}
	
	public FuncionarioEntity() {

	}
	
	public UUID getId() {
		return id;
	}
	public void setId(UUID id, String nome) {
		this.id = id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefonePessoal() {
		return telefonePessoal;
	}
	public void setTelefonePessoal(String telefonePessoal) {
		this.telefonePessoal = telefonePessoal;
	}
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}
	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	public String getDataContratacao() {
		return dataContratacao;
	}
	public void setDataContratacao(String dataContratacao) {
		this.dataContratacao = dataContratacao;
	}
	public EnderecoEntity getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoEntity endereco) {
		this.endereco = endereco;
	}
	public EmpresaEntity getEmpresa() {
		return empresa;
	}
	public void setEmpresa(EmpresaEntity empresa) {
		this.empresa = empresa;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculaHoraExtra(double horas) {
		return horas + salario;
	}
	
}

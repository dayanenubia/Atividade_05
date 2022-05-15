package model;

public class Functionary {
	private String nome;
	private String cpf;
	private double salario;
	private Company company;
	
	//Construtor da Classe
	public Functionary(String fNome) {
		this.nome = fNome;
	}
	
	// Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public Company getCompany() {
		return this.company;
	}
	
	//Setters
	public void setNome(String fNome) {
		this.nome = fNome;
	}

	public void setCpf(String fCpf) {
		this.cpf = fCpf;
	}

	public void setSalario(double fsalario) {
		this.salario = fsalario;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}

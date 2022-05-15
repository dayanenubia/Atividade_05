package model;

import java.util.ArrayList;
import java.util.List;

public class Company {
	//Atributos
	private String nome;
	private String cnpj;
	private List<Functionary> functionary;
	
	//Construtor
	public Company(String cNome, String cCnpj) {
		this.nome = cNome;
		this.cnpj = cCnpj;
		this.functionary = new ArrayList<Functionary>();
	}
	
	//Getters
	public String getNome() {
		return this.nome;
	}
	
	public String getCnpj() {
		return this.cnpj;
	}
	
	public List<Functionary> getFunctionary(){
		return this.functionary;
	}
	
	//Setters
	public void setNome(String cNome) {
		this.nome = cNome;
	}
	
	public void setCnpj(String cCnpj) {
		this.cnpj = cCnpj;
	}
	
	public void addFunctiony(Functionary cFunctionary, int qtd) {
		if(this.functionary.size() < qtd) {
			this.functionary.add(cFunctionary);
		}
	}
}

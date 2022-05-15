package view;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import model.Functionary;
import model.Company;

public class Main {

    public static void main(String[] args) {
    	
    	int cont = 0;
        	
        Scanner input = new Scanner(System.in);
        	 
        System.out.print("Nome da Empresa: ");
        String cNome = input.next();

        System.out.print("CNPJ da empresa: ");
        String cnpj = input.next();
             
        Company company1 = new Company(cNome, cnpj);
             
        System.out.print("Digite a quantidade de funcionarios que a empresa tem: ");
        int qtd = input.nextInt();
             
        while(cont < qtd){
        	
        	System.out.print("Nome do funcionario: ");
        	String fNome = input.next();
             
	        System.out.print("CPF do funcionário: ");
	        String cpf = input.next();
	
	        System.out.print("Salário do funcionário: ");
	        double salario = input.nextDouble();
	             
	        Functionary functionary1 = new Functionary(fNome);
	             
	        functionary1.setCpf(cpf);
	        functionary1.setSalario(salario);
	        
	        System.out.println(company1.getNome());
	        System.out.println(company1.getCnpj());
	        

        	System.out.println(functionary1.getNome());
        	System.out.println(functionary1.getCpf());
        	System.out.println(functionary1.getSalario());
        	
        	cont++;

        }
    }
}
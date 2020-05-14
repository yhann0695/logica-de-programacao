package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String nome;
		int idade;
		double salario;
		String sexo;
		String estadoCivil;
		boolean autenticacao = false;
		
		autenticacao = false;
		
		do {
			System.out.println("Digite o nome");
			nome = scan.next();
			
			if (nome.length() >= 3) {
				autenticacao = true;
			} else {
				System.out.println("nome inválido");
			}
			
		} while (!autenticacao);
		
		autenticacao = false;
		do {
			System.out.println("Digite a idade");
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 150) {
				autenticacao = true;
			} else {
				System.out.println("idade inválida");
			}
			
		} while (!autenticacao);
		
		autenticacao = false;
		do {
			System.out.println("Digite o solário");
			salario = scan.nextDouble();
			
			if (salario > 0) {
				autenticacao = true;
			} else {
				System.out.println("salario inválido");
			}
			
		} while (!autenticacao);
		
		autenticacao = false;
		do {
			System.out.println("Digite o sexo");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
				autenticacao = true;
			} else {
				System.out.println("sexo inválido");
			}
			
		} while (!autenticacao);
		
		autenticacao = false;
		do {
			System.out.println("Digite o estado civil");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") 
					|| estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
				
				autenticacao = true;
			} else {
				System.out.println("estado civil inválido");
			}
			
		} while (!autenticacao);
		
		System.out.println(" ----------------  ");
		System.out.println(" SUAS INFORMAÇÕES");
		System.out.println(" ----------------  ");
		
		
		System.out.println("Nome: " +nome);
		System.out.println(" --------- ");
		System.out.println("Idade: " +idade);
		System.out.println(" --------- ");
		System.out.println("Salário: " +salario);
		System.out.println(" --------- ");
		System.out.println("Sexo: " +sexo);
		System.out.println(" --------- ");
		System.out.println("Estado Civil: " +estadoCivil);
	}

}

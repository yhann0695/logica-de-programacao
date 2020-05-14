package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		boolean autenticacao = false;
		
		do {
			System.out.println("Digite o login");
			String login = scan.next();
			
			System.out.println("Digite a senha");
			String senha = scan.next();
			
			
			if (login.equalsIgnoreCase(senha)) {
				autenticacao = false;
				System.out.println("Senha igual ao usuário");
			
			} else {
				autenticacao= true;
				System.out.println("Autenticação válida");
			}
			
		} while (!autenticacao);
		
			
		
		
	}

}

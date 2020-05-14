package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//Divisível por 4. Sendo assim, a divisão é exata com o resto igual a zero;
		//Não pode ser divisível por 100. Com isso, a divisão não é exata, ou seja, deixa resto diferente de zero;
		//Pode ser que seja divisível por 400.
		
		
		System.out.println("Digite o ano");
		int ano = scan.nextInt();
		
		if((ano % 4) == 0) {
			System.out.println("É bissexto");
		
		} else if((ano % 100) != 0) {
			System.out.println("Não é bissexto");
		
		} else if((ano % 400) == 0) {
			System.out.println("É bissexto");
		}
		
		
	}

}

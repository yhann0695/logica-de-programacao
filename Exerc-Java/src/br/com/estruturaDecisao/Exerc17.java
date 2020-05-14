package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//Divis�vel por 4. Sendo assim, a divis�o � exata com o resto igual a zero;
		//N�o pode ser divis�vel por 100. Com isso, a divis�o n�o � exata, ou seja, deixa resto diferente de zero;
		//Pode ser que seja divis�vel por 400.
		
		
		System.out.println("Digite o ano");
		int ano = scan.nextInt();
		
		if((ano % 4) == 0) {
			System.out.println("� bissexto");
		
		} else if((ano % 100) != 0) {
			System.out.println("N�o � bissexto");
		
		} else if((ano % 400) == 0) {
			System.out.println("� bissexto");
		}
		
		
	}

}

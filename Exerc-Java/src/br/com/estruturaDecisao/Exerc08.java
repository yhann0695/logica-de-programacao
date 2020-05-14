package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite um valor");
		double valor1 = scan.nextDouble();
		
		System.out.println("Digite um valor");
		double valor2 = scan.nextDouble();
		
		System.out.println("Digite um valor");
		double valor3 = scan.nextDouble();
		
		
		if (valor1 <= valor2 && valor1 <= valor3) {
			System.out.println("Preço do valor 1 é mais barato");
		
		} else if (valor2 <= valor1 && valor2 <= valor3) {
			System.out.println("Preço do valor 2 é mais barato");
		
		} else {
			System.out.println("Preço do valor 3 é mais barato");
		}
		
	}

}

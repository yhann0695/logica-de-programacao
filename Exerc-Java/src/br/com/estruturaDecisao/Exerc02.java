package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero");
		int num1 = scan.nextInt();
		
		if (num1 >= 0) {
			System.out.println("n�mero par");
		
		} else {
			System.out.println("n�mero impar");
		}
		
	}

}

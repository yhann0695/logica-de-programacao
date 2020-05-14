package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um numero");
		int num1 = scan.nextInt();
		System.out.println("Digite um numero");
		int num2 = scan.nextInt();
		System.out.println("Digite um numero");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num2 >= num3) {
			System.out.println("número 1 é maior");
		
		} else if (num2 >= num1 && num1 >= num3) {
			System.out.println("número 2 é maior");
		
		} else if(num3 >= num1 && num1 >= num2) {
			System.out.println("número 3 é maior");
		
		} else {
			System.out.println("são todos iguais");
		}
	}

}

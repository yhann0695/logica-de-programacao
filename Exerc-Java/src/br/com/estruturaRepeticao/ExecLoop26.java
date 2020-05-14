package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número");
		int num = scan.nextInt();
		System.out.println("Fatorail de: 5");
		
		System.out.print(num + "! = ");
		
		int fatorial = 1;
		
		for (int i = num; i>1; i--) {
			fatorial *= i;
			
			System.out.print(i + ".");
		}
		
		
		
		System.out.print(" 1 = "+fatorial);

	}

}

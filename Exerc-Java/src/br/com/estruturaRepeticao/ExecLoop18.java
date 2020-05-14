package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um número");
		num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("Número não é primo, é divisível por = " +i);
				primo = false;
			
			} 
		}
		
		if(primo) {
			
			System.out.println("É primo");
		}
		

	}

}

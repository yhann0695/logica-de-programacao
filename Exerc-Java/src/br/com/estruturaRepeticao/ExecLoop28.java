package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop28 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Diga um número");
		num = scan.nextInt();
		
		boolean valido = true;
		
		for (int i = 2; i < num; i++) {
			
			if (num % i == 0) {
				System.out.println("Número não é primo");
				valido = false;
			
			} 
			
		}
		
		if(valido) {
			System.out.println("primo");
		}
		
	}
}

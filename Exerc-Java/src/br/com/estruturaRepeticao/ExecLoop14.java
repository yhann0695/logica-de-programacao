package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int pares = 0;
		int impares = 0;
		
		for (int i = 0; i < 10; i++) {
			
			System.out.println("Entre com um número: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				pares++;
			
			} else {
				impares++;
			}			
		}
		
		System.out.println("pares " + pares + " e " + "impares "+impares);

	}

}

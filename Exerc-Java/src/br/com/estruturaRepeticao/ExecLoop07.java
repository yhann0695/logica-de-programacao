package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int num;
		int maior = Integer.MIN_VALUE;
		
		for (int i = 1; i <=5; i++) {
			
			System.out.println("Digite um número");
			num = scan.nextInt();
			
			if (num > maior) {
				maior = num;
			}
		}
		
		System.out.println("Maior número é " +maior);
		
	}

}

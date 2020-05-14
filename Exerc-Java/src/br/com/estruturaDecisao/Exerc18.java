package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc18 {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Número");
		int num = scan.nextInt();
		
		if((num%2) ==0) {
			System.out.println("Número par");
		
		} else {
			
			System.err.println("Número impar");
		}
		
		
	}

}

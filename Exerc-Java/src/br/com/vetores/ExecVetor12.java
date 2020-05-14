package br.com.vetores;

import java.util.Scanner;

public class ExecVetor12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os valores das posições: " +i);
			vetorA[i] = scan.nextInt();
			
		}
		
		
		int soma = 0;
		for (int i = 0; i < vetorA.length; i++) {	
			soma += vetorA[i];
		}
		 
		System.out.print("Valores do vetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println(" ---------------  ");
		System.out.println("Soma = " +soma);
		
	}

}

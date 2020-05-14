package br.com.vetores;

import java.util.Scanner;

public class ExecVetor14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite as notas das posições de cada elemento: " +i);
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		int impar = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if((vetorA[i] %2) != 0 ) {
				soma += vetorA[i];
				impar++;
			}
			
		}
		
		System.out.println("valor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		System.out.println();
		
		double media = soma / impar; 
		System.out.println("Soma = " +soma);
		System.out.println("Média = " + media);
		
		
		
	}

}

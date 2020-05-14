package br.com.vetores;

import java.util.Scanner;

public class ExecVetor37 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite o valor de cada posição: " + (i+1));
			vetorA[i] = scan.nextInt();
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			
			vetorB[i] = 1;
			for (int j = 1; j <= vetorA[i]; j++) {
				vetorB[i] *= j;
			}
		}
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " | ");
		}
	}

}

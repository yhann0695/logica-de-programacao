package br.com.vetores;

import java.util.Scanner;

public class ExecVetor25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os valores do vetor: " + (i+1));
			vetorA[i] = scan.nextInt();
			
			//vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0;    UMA FORMA MAIS SIMPLIFICADA!
			
			if(vetorA[i] % 2 == 0) {
				vetorB[i] += 1;
			}
			
			if(vetorA[i] % 2 != 0) {
				vetorB[i] += 0;
			}
		}
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		
		System.out.println();
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " | ");
		}
		
	}

}

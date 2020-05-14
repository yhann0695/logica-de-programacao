package br.com.vetores;

import java.util.Scanner;

public class ExecVetor26 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA =  new int[10];
		int[] vetorB =  new int[vetorA.length];
		int[] vetorC =  new int[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os valores de cada posição do vetor A: " +(i+1));
			vetorA[i] = scan.nextInt();
			
		}
		
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println("Digite os valores de cada posição do vetor B: " +(i+1));
			vetorB[i] = scan.nextInt();
			
			if(vetorA[i] > vetorB[i]) {
				vetorC[i] += 1;
			}
			
			if(vetorA[i] == vetorB[i]) {
				vetorC[i] += 0;
			}
			
			if(vetorA[i] < vetorB[i]) {
				vetorC[i] += -1;
			}
		}
		
		System.out.println("Vetor A");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		
		System.out.println();
		
		System.out.println("Vetor B");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " | ");
		}
		
		System.out.println();
		
		System.out.println("Vetor C");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.print(vetorC[i] + " | ");
		}
		
		
		
		
	}

}

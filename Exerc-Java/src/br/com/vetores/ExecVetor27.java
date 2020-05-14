package br.com.vetores;

import java.util.Scanner;

public class ExecVetor27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		char[] vetorB = new char[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os valores de cada posição do vetor A: " + (i+1));
			vetorA[i] = scan.nextInt();
			
			if(vetorA[i] < 7) {
				vetorB[i] += 'a';
			}
			
			if(vetorA[i] == 7) {
				vetorB[i] += 'b';
			}
			
			if(vetorA[i] > 7 && vetorA[i] < 10) {
				vetorB[i] += 'c';
			}
			
			if(vetorA[i] == 10) {
				vetorB[i] += 'd';
			}
			
			if(vetorA[i] > 10) {
				vetorB[i] += 'e';
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

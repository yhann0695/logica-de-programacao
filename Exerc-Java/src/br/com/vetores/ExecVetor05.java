package br.com.vetores;

import java.util.Scanner;

public class ExecVetor05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor de cada posição: " +i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * i;
		}
		
		System.out.println("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("VetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(vetorB[i] + " ");
		}
		
		System.out.println();
	}

}

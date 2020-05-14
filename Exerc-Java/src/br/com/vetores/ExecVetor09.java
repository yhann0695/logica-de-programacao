package br.com.vetores;

import java.util.Scanner;

public class ExecVetor09 {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int [vetorA.length];
		
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor de cada posição: " +i+1);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i];
			
			vetorC[i] = vetorA[i] / vetorB[i];
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
		
		System.out.println("VetorC = ");
		for (int i = 0; i < vetorC.length; i++) {
			System.out.println(vetorC[i] + " ");
		}		
				
		
	}

}

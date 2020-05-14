package br.com.vetores;

import java.util.Scanner;

public class ExecVetor02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os valores da posição: " +i );
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] *2;
		}
		
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i]+ " ");
		}
		System.out.println();
		
		System.out.print("VetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		System.out.println();

	}

}

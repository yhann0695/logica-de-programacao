package br.com.vetores;

import java.util.Scanner;

public class ExecVetor10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		double[] vetorB = new double[vetorA.length];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor de cada posição");
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] % 2;
		}
		
		System.out.print("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.print("VetorB = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		
		
		
	}
	

}

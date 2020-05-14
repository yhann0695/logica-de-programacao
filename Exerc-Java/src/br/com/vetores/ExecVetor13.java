package br.com.vetores;

import java.util.Scanner;

public class ExecVetor13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os elementos do vetor: " +i);
			vetorA[i] = scan.nextInt();
		}
		
		int soma = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if((vetorA[i] % 5) == 0 ) {
				soma +=vetorA[i];
			}
			System.out.println();
		}
		
		System.out.print("Números do vetor = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.println("Soma dos valores divisíveis por 5 = " +soma);
		
		
	}

}

package br.com.vetores;

import java.util.Scanner;

public class ExecVetor23 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		
		
			for (int i = 0; i < vetorA.length; i++) {
				System.out.println("Digite os números de cada posição do vetor: " + (i + 1));
				vetorA[i] = scan.nextInt();
				
				if (vetorA[i] % 2 != 0) {
					System.out.println("você digitou um número impar, digite apenas números pares, comece outra vez.");
					break;
				}
			}
		
			System.out.print("Elementos do vetor A = ");
			for (int i = 0; i < vetorA.length; i++) {
				System.out.print(vetorA[i] + " | ");
			}

	}

}

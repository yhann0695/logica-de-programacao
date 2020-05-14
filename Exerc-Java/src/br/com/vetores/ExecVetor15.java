package br.com.vetores;

import java.util.Scanner;

public class ExecVetor15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite os números das posições: " + i);
			vetorA[i] = scan.nextInt();
		}

		int impar = 0;

		for (int i = 0; i < vetorA.length; i++) {
			if ((vetorA[i] % 2) != 0) {
				impar++;
			}

		}
		
		int par = vetorA.length - impar;
		//vetorA.length - 100%
		//par           - x
		//= x*vetorA.length == par*100
		//= x == (par*100) /vetorA.length
		double porcentagemPar = (par*100) / vetorA.length;
		double porcentagemImpar = (impar*100) / vetorA.length;
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + "| ");
		}
		System.out.println();
		System.out.println("Porcentagem pares  = " + porcentagemPar+ "%");
		System.out.println("Porcentagem impares = " + porcentagemImpar+ "%");

	}

}

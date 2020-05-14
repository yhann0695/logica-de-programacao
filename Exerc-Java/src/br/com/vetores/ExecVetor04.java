package br.com.vetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExecVetor04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		DecimalFormat format = new DecimalFormat("###,###.###");

		int[] vetorA = new int[15];
		double[] vetorB = new double[15];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor de cada posição: " +i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = Math.sqrt(vetorA[i]);
		}
		
		System.out.println("VetorA = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println(vetorA[i] + " ");
		}
		
		System.out.println();
		
		System.out.println("VetorB = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.println(format.format(vetorB[i]) + " ");
		}
		
		System.out.println();
		
	}

}

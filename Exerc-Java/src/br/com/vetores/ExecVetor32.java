package br.com.vetores;

import java.util.Scanner;

public class ExecVetor32 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[5];
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite o valor das posições: " +(i+1));
			vetorA[i] = scan.nextInt();
			
		}
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Tabuada de " + vetorA[i]);
			
			for (int j = 1; j <=10; j++) {
				
				System.out.println(j + "x"+ vetorA[i] + " = " + (vetorA[i]*j) );
			}
		}
		
		
		
	}

}

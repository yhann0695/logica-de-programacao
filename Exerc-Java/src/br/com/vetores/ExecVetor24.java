package br.com.vetores;

import java.util.Scanner;

public class ExecVetor24 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA =  new int[10];
		
		for (int i = 0; i <vetorA.length; i++) {
			System.out.println("Digite o n�mero de cada posi��o do vetor: " +(i+1));
			vetorA[i] = scan.nextInt();
			
		}
		boolean palindromo = true;
		
		for (int i = 0; i < (vetorA.length/2); i++) {
			if(vetorA[i] != vetorA[vetorA.length -1 - i]) {
				palindromo = false;
				break;
			
			}  
		}
		System.out.println();
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " | ");
		}
		System.out.println();
		
		if(palindromo) {
			System.out.println("� um palindromo");
		
		} else {
			System.out.println("n�o � um palindromo");
		}
		

	}

}

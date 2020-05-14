package br.com.vetores;

import java.util.Scanner;

public class ExecVetor16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[10];
		
		
		for (int i = 0; i < vetorA.length; i++) {
			System.out.println("Digite um valor para a posição do vetor: " +i);
			vetorA[i] = scan.nextInt();
		}
		
		int qtdSuperior = 0;
		int vetorInferior = 0;
		int vetorIgual = 0;
		int vetorSuperior = 0;
		for (int i = 0; i < vetorA.length; i++) {
			if(vetorA[i] < 15) {
				vetorInferior++;
			}
			
			if(vetorA[i] == 15) {
				vetorIgual++;
			}
			
			if(vetorA[i] > 15) {
				vetorSuperior += vetorA[i];
				qtdSuperior++;
			}
		}
		
		
		System.out.println("Superior = " + qtdSuperior);
		System.out.println("Igual = " + vetorIgual);
		System.out.println("Inferior = " + vetorInferior);
		System.out.println("A média dos vetores superior a 15 é: " + (vetorSuperior/qtdSuperior));
			
		
		
	}

}

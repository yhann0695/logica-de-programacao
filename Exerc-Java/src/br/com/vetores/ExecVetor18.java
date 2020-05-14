package br.com.vetores;

import java.util.Scanner;

public class ExecVetor18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite as idades em cada posição: " + (i+1));
			idades[i] = scan.nextInt();
		}
		int maior = idades[0];
		int menor = idades[0];
		int posicaoMenor = 0;
		int posicaoMaior = 0;
		for (int i = 1; i < idades.length; i++) {
			if(idades[i] < menor) {
				menor = idades[i];
				posicaoMenor = i;
			
			} else if (idades[i] > maior) {
				maior = idades[i];
				posicaoMaior = i;
			}
		}
		
		System.out.print("Vetor de idades");
		for (int i = 1; i < idades.length; i++) {
			System.out.print(idades[i]);
		}
		System.out.println();
		
		System.out.println("Maior idade: " + maior + ", posição "+ (posicaoMaior+1));
		System.out.println("Menor idade: " + menor + ", posição "+ (posicaoMenor+1));
		
	}

}

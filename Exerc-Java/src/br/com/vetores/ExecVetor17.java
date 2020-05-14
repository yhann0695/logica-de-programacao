package br.com.vetores;

import java.util.Scanner;

public class ExecVetor17 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] idades = new int[10];
		
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println("Digite as idades em cada posição: " +(i+1));
			idades[i] = scan.nextInt();
		}
		
		int qtdPessoas = 0;
		for (int i = 0; i < idades.length; i++) {
			if(idades[i] > 35) {
				qtdPessoas++; 
			}
		}
		
		System.out.println("Quantidade de pessoas = " +qtdPessoas);
		
	
		
		
	}

}

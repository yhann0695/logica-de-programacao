package br.com.matrizes;

import java.util.Scanner;

public class ExecMatriz01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga a quantidade de pessoas entrevistadas");
		int numEntrevistados = scan.nextInt();
		
		String[][] nomesFilhos = new String[numEntrevistados][];
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Diga a quantidade de filhos");
			int qtdFilhos = scan.nextInt();
			
			nomesFilhos[i] = new String[qtdFilhos];
			
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println("Diga o nome dos filho(s): " + (j + 1));
				
				nomesFilhos[i][j] = scan.next();
			}
		}
		
		for (int i = 0; i < nomesFilhos.length; i++) {
			System.out.println("Pessoa " +(i+1)+ " tem " + nomesFilhos[i].length + " filho(s)");
			for (int j = 0; j < nomesFilhos[i].length; j++) {
				System.out.println(nomesFilhos[i][j]);
				System.out.println(" ---------------------- ");
			}
		}
		
	}

}

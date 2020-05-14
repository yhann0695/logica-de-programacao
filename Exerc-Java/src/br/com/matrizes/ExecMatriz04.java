package br.com.matrizes;

import java.util.Scanner;

public class ExecMatriz04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[][] numeros = new int[3][3];
		
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println("Digite os valores da posição [" +i + "," + j+ "]");
				numeros[i][j] = scan.nextInt();
			}
		}
		System.out.println();
		
		System.out.println("Valores da Matriz = ");
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.print(numeros[i][j] + " | ");
			}
			System.out.println();
		}
		
		
		int par = 0;
		int impar = 0;
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				if(numeros[i][j] % 2 == 0) {
					par++;
				}
				
				if(numeros[i][j] % 2 != 0) {
					impar++;
				}
			}
		}
		
		System.out.println("Quantidade de números pares = " +par);
		System.out.println("Quantidade de números impares = "+impar);

		
	}

}

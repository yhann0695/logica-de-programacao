package br.com.vetores;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ExecVetor20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double[] vetorA = new double[20];
		double cotacao;
		
		System.out.println("Qual a cotação do dolar? ");
		cotacao = scan.nextDouble();
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = cotacao * (i+1);
		}
		
		System.out.println();
		
		DecimalFormat format = new DecimalFormat("###,###.###");
		
		System.out.print("Vetor A = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(format.format(vetorA[i]) + "| ");
		}
	}

}

package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Quantidade de CDs");
		int quantidade = scan.nextInt();
		
		double valor;
		double valorTotal = 0;
		
		for (int i = 0; i < quantidade; i++) {
			
			System.out.println("Digite o valor do CD " + (i+1));
			valor = scan.nextDouble();
			
			valorTotal += valor;
		}
		
		double media = valorTotal / quantidade;
		System.out.println("Valor total investido: " +valorTotal);
		System.out.println("Valor médio gasto: " +media);
		

	}

}

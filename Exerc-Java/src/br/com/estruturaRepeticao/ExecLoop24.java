package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Pre�o do p�o: R$ 0.18");
		System.out.println("Panificadora P�o de Ontem - Tabela de pre�os");
		
		System.out.println("Digite o pre�o do p�o ");
		double preco = scan.nextDouble();
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+ " - R$ " +(i*preco));
		}
	}

}

package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Preço do pão: R$ 0.18");
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		
		System.out.println("Digite o preço do pão ");
		double preco = scan.nextDouble();
		
		for (int i = 1; i <= 50; i++) {
			System.out.println(i+ " - R$ " +(i*preco));
		}
	}

}

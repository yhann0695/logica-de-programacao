package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		int soma = 0;
		double media;
		for (int i = 1; i <= 5; i++) {
			
			System.out.println("Digite os números");
			num = scan.nextInt();
			
			soma += num;
 			
		}
		
		media = soma/5;
		
		System.out.println(soma);
		System.out.println(media);

	}

}

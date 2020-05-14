package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		int soma = 0;
		
		System.out.println("Digite o primeiro número");
		num1 =  scan.nextInt();
		
		System.out.println("Digite o segundo número");
		num2 = scan.nextInt();
		
		for (int i = num1; i < num2; i++) {
			soma += i;
		}
		System.out.println(soma);

	}

}

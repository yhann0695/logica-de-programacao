package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Número 1");
		double num1 = scan.nextDouble();
		
		System.out.println("Número 2");
		double num2 = scan.nextDouble();
		
		System.out.println("Diga a operação que deseja realizar ( + - / *): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida= true;
		
		switch (operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		default:
			System.out.println("operação inválida");
			valida = false;
		}
		
		if (valida) {
			if(resultado >= 0) {
				System.out.println("Número positivo");
			
			} else {
				System.out.println("Número negativo");
			}
			
			if(resultado % 2 == 0) {
				System.out.println("Número par");
			
			} else {
				System.out.println("Número impar");
			}
			
			System.out.println(resultado);
			
		}
	}

}

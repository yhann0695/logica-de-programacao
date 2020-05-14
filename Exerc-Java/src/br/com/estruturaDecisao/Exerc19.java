package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("N�mero 1");
		double num1 = scan.nextDouble();
		
		System.out.println("N�mero 2");
		double num2 = scan.nextDouble();
		
		System.out.println("Diga a opera��o que deseja realizar ( + - / *): ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida= true;
		
		switch (operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		default:
			System.out.println("opera��o inv�lida");
			valida = false;
		}
		
		if (valida) {
			if(resultado >= 0) {
				System.out.println("N�mero positivo");
			
			} else {
				System.out.println("N�mero negativo");
			}
			
			if(resultado % 2 == 0) {
				System.out.println("N�mero par");
			
			} else {
				System.out.println("N�mero impar");
			}
			
			System.out.println(resultado);
			
		}
	}

}

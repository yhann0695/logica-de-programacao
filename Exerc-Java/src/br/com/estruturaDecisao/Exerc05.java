package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota");
		double nota1 = scan.nextDouble();
		System.out.println("Digite a segunda nota");
		double nota2 = scan.nextDouble();
		double resultado = (nota1 + nota2) / 2;
		
		if (resultado == 10) {
			System.out.println("Aprovado com Distinção ");
		
		} else if (resultado < 7) {
			System.out.println("Reprovado " + resultado);
		
		} else if (resultado >= 7) {
			System.out.println("Aprovado " + resultado);
		}
			

	}

}

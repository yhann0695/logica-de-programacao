package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Nota 1");
		double nota1 = scan.nextDouble();
		
		System.out.println("Nota 2");
		double nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) /2;
		
		String aproveitamento = "";
		
		if(media >= 9 && media == 10) {
			aproveitamento = "A";
			
		
		} else if (media > 7.5 && media < 9) {
			aproveitamento= "B";
			
			
		} else if (media > 6 && media < 7.5) {
			aproveitamento = "C";
			
			
		} else if (media > 4 && media < 6) {
			aproveitamento = "D";
			
			
		} else if(media < 4 && media > 0) {
			aproveitamento = "E";
			
		}
		
		System.out.println("Nota 1: " +nota1);
		System.out.println("Nota 2: " +nota2);
		System.out.println("Média: " +media);
		System.out.println("Conceito: " +aproveitamento);
		
		if (aproveitamento.equalsIgnoreCase("A") || aproveitamento.equalsIgnoreCase("B") || aproveitamento.equalsIgnoreCase("C")) {
			System.out.println("Aprovado");
		
		} else {
			System.out.println("Reprovado");
		}
		
		
		
	}

}

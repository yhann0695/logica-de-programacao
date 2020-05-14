package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
			
		System.out.println("Salário");
		double salario = scan.nextDouble();
		System.out.println("Salário antes do reajuste " +salario);
		
		
		double percentual = 0;
		if (salario > 1500) {
			percentual = 5;
			
		} else if (salario > 700 && salario < 1500) {
			percentual = 10;
			
		
		} else if (salario > 280 && salario < 700) {
			percentual = 15;
			
		
		} else {
			percentual = 20;
		}
		
		double aumento = (salario / 100) * percentual;
		double salarioReajuste = aumento + salario;
		
		System.out.println("Aumento "+ aumento + " e o reajuste " + salarioReajuste);
		
		
		
		
		
	}

}

package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Valor de A");
		double a = scan.nextDouble();
		
		if (a == 0) {
			System.out.println("Não é equação de segundo grau");
		
		} else {
			
			System.out.println("Valor de B");
			double b = scan.nextDouble();
			
			System.out.println("Valor de C");
			double c = scan.nextDouble();
			
			
			double delta = Math.pow(b, 2) - (4*a*c);
			if (delta < 0) {
				System.out.println("Não possui raizes reais");
			
			} else {
				
				double x1 = ((-b) + Math.sqrt(delta) / (2*a));
				double x2 = ((-b) - Math.sqrt(delta) / (2*a));
				
				System.out.println("x1 = " +x1);
				System.out.println("x2 = " +x2);
				
			}
			
		}
		
		
				
		
		
	}

}

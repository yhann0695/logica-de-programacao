package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lado 1");
		double lado1 = scan.nextDouble();
		
		System.out.println("Lado 2");
		double lado2 = scan.nextDouble();
		
		System.out.println("Lado 3");
		double lado3 = scan.nextDouble();
		
		if ((lado1 + lado2) > lado3 || (lado1 + lado3) > lado2 || (lado2 + lado3) > lado1) {
			
			if(lado1 == lado2 && lado1 == lado3 && lado3 == lado2) {
				System.out.println("Tri�ngulo Equil�tero");
				
			} else if (lado1 != lado2 && lado2 == lado3) {
				System.out.println("Triangulo is�sceles");
				
			} else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
				System.out.println("Tri�ngulo Escaleno");
				
			} 
		
		} else {
			System.out.println("N�o � um tri�ngulo");
		}
		
		
			
		

	}

}

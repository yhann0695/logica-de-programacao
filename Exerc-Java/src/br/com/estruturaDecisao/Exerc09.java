package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite num1");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite num2");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite num3");
		double num3 = scan.nextDouble();
		
		
		if (num1 <= num2 && num1 <= num3 && num2 <= num3) {
			//num1 � menor
			//num3 � maior
			//num1 < num2 < num3
			System.out.println(num3 + " - " + num2 + " - " + num1);
		
		} else if (num1 <= num2 && num1 <= num3 && num3 <= num2) {
				//num1 � menor
				//num2 � maior
				//num1 < num3 < num2
				System.out.println(num2 + " - " + num3 + " - " + num1);
		
		
		} else if (num2 <= num1 && num2 <= num3 && num1 <= num3) {
			//num2 � menor
			//num3 � maior
			//num2 < num1 < num3
			System.out.println(num3 + " - " + num1 + " - " + num2);
	
		} else if (num2 <= num1 && num2 <= num3 && num3 <= num1) {
			//num2 � menor
			//num1 � maior
			//num2 < num3 < num1
			System.out.println(num1 + " - " + num3 + " - " + num2);
		
		} else if (num3 <= num1 && num3 <= num2 && num1 <= num2) {
			//num3 � menor
			//num2 � maior
			//num3 < num1 < num2
			System.out.println(num1 + " - " + num3 + " - " + num2);
		
		} else if (num3 <= num1 && num3 <= num2 && num2 <= num1) {
			//num3 � menor
			//num1 � maior
			//num3 < num2 < num1
			System.out.println(num1 + " - " + num2 + " - " + num3);
		}
	
	}
}

package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		
		System.out.println("Digite um número");
		num1 = scan.nextInt();
		
		System.out.println("Tabuada de " + num1 + ":");
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "x" + num1 + " = " + (i*num1));
		}
		

	}

}

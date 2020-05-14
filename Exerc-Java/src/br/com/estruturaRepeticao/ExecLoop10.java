package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num1;
		int num2;
		
			 System.out.println("Digite o número 1");
			 num1= scan.nextInt();
			 
			 System.out.println("Digite o número 2");
			 num2 = scan.nextInt();
			 
			
			 for (int i = num1; i < num2; i++) {
				System.out.println(i);
			}
	}

}

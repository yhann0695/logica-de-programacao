package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop18 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um n�mero");
		num = scan.nextInt();
		
		boolean primo = true;
		
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println("N�mero n�o � primo, � divis�vel por = " +i);
				primo = false;
			
			} 
		}
		
		if(primo) {
			
			System.out.println("� primo");
		}
		

	}

}

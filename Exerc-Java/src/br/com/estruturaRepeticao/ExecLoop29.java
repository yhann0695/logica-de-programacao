package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop29 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int num;

		boolean primo;

		System.out.println("Informe o n�mero inteiro");
		num = scan.nextInt();
		
		for (int i = 1; i <= num; i++) {
			
			primo = true;
		

		for (int j = 2; j<i; j++) {
			if (i % j == 0) {
				//System.out.println("N�mero n�o � primo");
				primo = false;
			}

		}

		if (primo) {
			System.out.println(i);
		}
	}
	}

}



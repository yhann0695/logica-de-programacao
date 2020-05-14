package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com ao n-ésimo termo da série de fibonacci: ");
		int n = scan.nextInt();
		
		int primeiro = 1;
		int segundo = 1;
		int proximo;
		
		for (int i = 3; i <= n; i++) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			
			System.out.println(proximo);
		}
		
	}

}

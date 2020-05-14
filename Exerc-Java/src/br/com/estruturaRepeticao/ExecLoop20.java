package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantas pessoas?");
		double pessoas = scan.nextDouble();
		
		
		int idade;
		int pessoa = 0;
		
		
		for (int i = 0; i < pessoas; i++) {
			System.out.println("Digite a idade para a pessoa " + (i+1));
			idade = scan.nextInt();
			pessoa += idade;			
		}
		
		double media = pessoa / pessoas;
		System.out.println("Media: " +media);
		if (media > 0 && media <= 25) {			
			System.out.println("Jovens");
			
		} else if (media >= 26 && media <= 60) {		
			System.out.println("Adultos");
			
		} else {
			System.out.println("Idosos");
		}
		
	

	}

}

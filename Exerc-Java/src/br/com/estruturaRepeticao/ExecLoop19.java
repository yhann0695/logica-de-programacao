package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop19 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
			System.out.println("Digite a quantidade da notas");
			double notas = scan.nextDouble();
			
			double soma = 0;
			double media;
			double nota;
			
			for (int i = 0; i <notas; i++) {
				System.out.println("Entre com a nota " + (i+1));
				nota = scan.nextDouble();
				
				soma += nota;
			}
			
			media = soma / notas;
			System.out.println("Soma: " +soma);
			System.out.println("Média: " + media/notas);
		
			
		
		
	}

}

package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc21 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("qtd de litros vendidos");
		double litro = scan.nextDouble();
		
		System.out.println("Tipo do combustível");
		String tipo = scan.next();
		
		double precoGasolina = 2.5;
		double precoAlcool = 1.9;
		int percentualDesconto = 0;
		double total = 0;
		double totalDesconto = 0;
		
		if (tipo.equalsIgnoreCase("A")) {
			
			if(litro <= 20) {
				percentualDesconto = 3;
			
			} else {
				percentualDesconto = 5;
			}
			
			total = litro * precoAlcool;
			
		}else if (tipo.equalsIgnoreCase("G")) {
			
			if (litro <= 20) {
				percentualDesconto = 4;
			
			} else {
				percentualDesconto = 6;
			}
			
			total = litro * precoGasolina;
			
		}
	    
	    
		totalDesconto = total / 100 * percentualDesconto;
		
		double precoAPagar = total - totalDesconto;
		
		System.out.println("Valor a ser pago: " + precoAPagar);
		
	}

}

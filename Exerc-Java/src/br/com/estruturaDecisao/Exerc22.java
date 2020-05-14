package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc22 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Morango");
		double morango = scan.nextDouble();
		
		System.out.println("Maçã");
		double maca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if(morango <= 5) {
			precoKgMorango = 2.5;
		
		} else {
			precoKgMorango = 2.20;
		}
		
		double precoKgMaca = 0;
		if(maca <=5 ) {
			precoKgMaca = 1.80;
		
		} else {
			precoKgMaca = 1.50;
		}
		
		double precoTotalMorango = morango * precoKgMorango;
		double precoTotalMaca = maca * precoKgMaca;
		
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if ((morango + maca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) *10);
		}
		
		System.out.println("Preço total: " + precoTotal);

	}

}

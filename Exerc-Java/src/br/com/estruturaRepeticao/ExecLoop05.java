package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		double popA; 
		double popB;
		double taxaA;
		double taxaB;
		boolean valido = false;
		
		do {
			System.out.println("Digite a popula��o A");
			popA = scan.nextDouble();
			
			
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("popula��o A inv�lida");
			}
		
		} while (!valido);
		
		valido = false;
		do {
			
			System.out.println("Digite a popula��o B");
			popB = scan.nextDouble();
			
			
			if(popB > 0) {
				valido = true;
			} else {
				System.out.println("popula��o B inv�lida");
			}
			
		} while (!valido);
		
		do {
			System.out.println("Digite a Taxa da popula��o A");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			} else {
				System.out.println("� preciso colocar uma taxa A v�lida");
			}
						
		} while (!valido);
		
		
		
		do {
			System.out.println("Digite a Taxa da popula��o B");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			 } else {
				 System.out.println("� preciso colocar uma taxa B v�lida");
			 }
			
		} while (!valido);
		
		
		
		int cont = 0;
       while (popA < popB) {
			
			popA += (popA/100) * taxaA;
			popB +=(popB/100) * taxaB;
			cont++;
		}
		
		System.out.println("Pais A: " + popA);
		System.out.println("Pais B: " + popB);
		System.out.println("Qtd de anos: " +cont);
	}

}

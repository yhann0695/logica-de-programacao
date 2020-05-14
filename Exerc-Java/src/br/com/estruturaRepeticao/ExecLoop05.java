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
			System.out.println("Digite a população A");
			popA = scan.nextDouble();
			
			
			if(popA > 0) {
				valido = true;
			} else {
				System.out.println("população A inválida");
			}
		
		} while (!valido);
		
		valido = false;
		do {
			
			System.out.println("Digite a população B");
			popB = scan.nextDouble();
			
			
			if(popB > 0) {
				valido = true;
			} else {
				System.out.println("população B inválida");
			}
			
		} while (!valido);
		
		do {
			System.out.println("Digite a Taxa da população A");
			taxaA = scan.nextDouble();
			
			if(taxaA > 0) {
				valido = true;
			} else {
				System.out.println("É preciso colocar uma taxa A válida");
			}
						
		} while (!valido);
		
		
		
		do {
			System.out.println("Digite a Taxa da população B");
			taxaB = scan.nextDouble();
			
			if(taxaB > 0) {
				valido = true;
			 } else {
				 System.out.println("É preciso colocar uma taxa B válida");
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

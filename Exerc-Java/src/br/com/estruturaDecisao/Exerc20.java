package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Telefonou para a v�tima?");
		String resposta = scan.next();
		
		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.next();
		
		System.out.println("Mora perto da v�tima?");
		String resposta3 = scan.next();
		
		System.out.println("Devia para a v�tima?");
		String resposta4 = scan.next();
		
		System.out.println("J� trabalhou com a v�tima?");
		String resposta5 = scan.next();
		
		int cont = 0;
		
		if(resposta.equalsIgnoreCase("S")) {
			cont++;
		
		} if (resposta2.equalsIgnoreCase("S")) {
			cont++;
		
		} if(resposta3.equalsIgnoreCase("S")) {
			cont++;
		
		} if(resposta4.equalsIgnoreCase("S")) {
			cont++;
		
		} if(resposta5.equalsIgnoreCase("S")) {
			cont++;
		}
		
		if(cont == 2) {
			System.out.println("Suspeita");
		
		} else if (cont == 3 || cont == 4) {
			System.out.println("C�mplice");
		
		} else if(cont == 5) {
			System.out.println("Assassino");
		
		} else if(cont == 0) {
			System.out.println("Inocente");
		}
		
		
		
	}

}

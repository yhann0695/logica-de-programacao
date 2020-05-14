package br.com.estruturaDecisao;

import java.util.Scanner;

public class Exerc12 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Qual o preço da hora de trabalho?");
		double preco = scan.nextDouble();
		
		System.out.println("Qual foi a quantidade de horas trabalhada no mês?");
		double horas = scan.nextDouble();
		
		double salarioBruto = preco * horas;
		
		int percentual = 0;
		if(salarioBruto <= 900) {
			percentual = 0;
		
		} else if (salarioBruto <= 1500) {
			percentual = 5;
		
		} else if (salarioBruto <= 2500) {
			percentual = 10;
		
		} else {
			percentual = 20;
		}
		
		double ir = (salarioBruto/100)* percentual; 
		double inss = (salarioBruto/100) * 10;
		double fgts = (salarioBruto/100) *11;
		double totalDeDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDeDescontos;
		
		System.out.println("SalárioBruto: R$" + salarioBruto);
		System.out.println("IR: R$" + ir);
		System.out.println("INSS: R$" +inss);
		System.out.println("FGTS: R$" +fgts);
		System.out.println("Total de descontos: R$" + totalDeDescontos);
		System.out.println("Salário Líquido: R$" + salarioLiquido);
		
		
	}

}

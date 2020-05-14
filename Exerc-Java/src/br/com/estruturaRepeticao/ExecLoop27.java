package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop27 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int qtdTemperatura;
		double temp;
		int soma = 0;
		double menor = Double.MAX_VALUE;
		double maior = Double.MIN_VALUE;
		
		
		System.out.println("Informe a a quantidade de temperaturas");
		qtdTemperatura = scan.nextInt();
		
		
		for (int i = 1; i <= qtdTemperatura; i++) {
			
				System.out.println("Informe a temperatura");
				temp = scan.nextDouble();
				soma += temp;
				
				if (temp > maior) {
					maior = temp;
				
				}
				
				if(temp < menor){
					menor = temp;
				}
		}
		
		double media = soma / qtdTemperatura;
		
		
		System.out.println("Maior número: " + maior);
		System.out.println("Menor número: " + menor);
		System.out.println("Média = " +media);
	}

}

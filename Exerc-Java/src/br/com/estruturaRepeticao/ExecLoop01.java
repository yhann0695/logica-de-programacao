package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean notaValida = false;
		
		
		do {
		
		System.out.println("Digite uma nova");
		double nota = scan.nextDouble();
		
		boolean valorValido = false;
		
			if (nota >= 0 && nota <= 10) {
				notaValida = true;
				System.out.println("Parabéns vc acertou a nota");
			
			} else {
				notaValida = false;
				System.out.println("Nota inválida, digite outra vez");
			}
		} while (!notaValida);
		
 	}

}

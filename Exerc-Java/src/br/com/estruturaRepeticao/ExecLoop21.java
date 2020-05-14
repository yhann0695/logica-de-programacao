package br.com.estruturaRepeticao;

import java.util.Iterator;
import java.util.Scanner;

public class ExecLoop21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quantidade de turmas");
		int turmas = scan.nextInt();
		
		int numAlunos =0;
		int alunos;
		
		for (int i = 1; i <=turmas; i++) {
			
			boolean invalido = true;
			do {
				System.out.println("Número de alunos da turma: "+  (i));
				alunos = scan.nextInt();
				
				
				if (alunos <= 40) {
					invalido = false;
				}else {
					
					System.out.println("Quantidade inválida");
				}
			} while (invalido);
			
			numAlunos += alunos;
		}
		
		double media = numAlunos / turmas;
		System.out.println("Média de alunos para cada turma: " + media);
				
		

	}

}

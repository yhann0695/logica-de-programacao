package br.com.matrizes;

import java.util.Scanner;

public class ExecMatriz05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		String[][] compromissos = new String[31][24];
		
		boolean sair = false;
		byte opcao;
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar compromisso.");
			System.out.println("Digite 2 para verificar compromisso.");
			System.out.println("Digite 0 para sair.");
			
			opcao = scan.nextByte();
			
			if(opcao == 1) {
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia do m�s: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inv�lido, digite novamente");
					}					
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("Digite o hor�rio.");
					hora = scan.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hor�rio inv�lido, digite novamente");
					}					
				}
				
				dia--;
				System.out.println("Digite o compromisso");
				compromissos[dia][hora] = scan.next();
				
			} else if (opcao == 2) {
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia do m�s: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
						
					} else {
						System.out.println("Dia inv�lido, digite novamente");
					}					
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("hor�rio do agendamento");
					hora =  scan.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
						
					} else {
						System.out.println("Hor�rio inv�lido, digite novamente");
					}					
				}
				
				dia--;
				System.out.println("O compromisso agendado �:");
				System.out.println(compromissos[dia][hora]);
				
			} else if (opcao == 0){
				sair = true;
				
			} else {
				System.out.println("Op��o inv�lida, Digite novamente");
			}
		}
		
		for (int i = 0; i < compromissos.length; i++) {
			for (int j = 0; j < compromissos[i].length; j++) {
				System.out.print(compromissos[i][j] + " | ");
			}
			System.out.println();
		}
		
	}

}

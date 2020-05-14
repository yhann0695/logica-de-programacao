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
					System.out.println("Entre com o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}					
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("Digite o horário.");
					hora = scan.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Horário inválido, digite novamente");
					}					
				}
				
				dia--;
				System.out.println("Digite o compromisso");
				compromissos[dia][hora] = scan.next();
				
			} else if (opcao == 2) {
				
				boolean diaValido = false;
				int dia = 0;
				while(!diaValido) {
					System.out.println("Entre com o dia do mês: ");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
						
					} else {
						System.out.println("Dia inválido, digite novamente");
					}					
				}
				
				boolean horaValida = false;
				int hora = 0;
				while(!horaValida) {
					System.out.println("horário do agendamento");
					hora =  scan.nextInt();
					if(hora >= 0 && hora <= 24) {
						horaValida = true;
						
					} else {
						System.out.println("Horário inválido, digite novamente");
					}					
				}
				
				dia--;
				System.out.println("O compromisso agendado é:");
				System.out.println(compromissos[dia][hora]);
				
			} else if (opcao == 0){
				sair = true;
				
			} else {
				System.out.println("Opção inválida, Digite novamente");
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

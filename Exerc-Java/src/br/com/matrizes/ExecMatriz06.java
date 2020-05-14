package br.com.matrizes;

import java.util.Scanner;

public class ExecMatriz06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String[][][] compromisso = new String[12][31][24];
		
		
		boolean sair = false;
		byte opcao;
		while(!sair) {
			
			System.out.println("Digite 1 para adicionar um compromisso");
			System.out.println("Digite 2 para consultar um compromisso");
			System.out.println("Digite 0 para sair da agenda de compromissos");	
			
			opcao = scan.nextByte();

				if(opcao == 1) {
					
					boolean validarMes = false;
					int mes = 0;				
					while(!validarMes) {			
					System.out.println("Digite o mês do compromisso");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						validarMes = true;
						
					} else {
						System.out.println("Digite novamente, a opção foi inválida");
					}
				
			}
				
			boolean validarDia = false;
			int dia = 0;
				while(!validarDia) {
				System.out.println("Digite o dia do compromisso");
				dia = scan.nextInt();
				if(dia > 0 && dia <= 31) {
					validarDia =  true;
				
				} else {
					System.out.println("Digite novamente, a opção foi inválida");
				}
				}
				
				
				boolean validarHora = false;
				int hora = 0;
				while(!validarHora) {
					
					System.out.println("Digite o horário do compromisso");
					hora = scan.nextInt();
					if(hora > 0 && hora <= 8) {
						validarHora = true;
					
					} else {
						System.out.println("Digite novamente, a opção foi inválida");
					}
					
				}
				
				mes--;
				dia--;
				System.out.println("Digite o compromisso");
				compromisso[mes][dia][hora] = scan.next();
				

			} else if (opcao == 2) {
				
				boolean validarMes = false;
				int mes = 0;
				while (!validarMes) {
					System.out.println("Digite o mês do compromisso");
					mes = scan.nextInt();
					if (mes > 0 && mes <= 12) {
						validarMes = true;

					} else {
						System.out.println("Digite novamente, a opção foi inválida");
					}

				}

				boolean validarDia = false;
				int dia = 0;
				while (!validarDia) {
					System.out.println("Digite o dia do compromisso");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						validarDia = true;

					} else {
						System.out.println("Digite novamente, a opção foi inválida");
					}
				}

				boolean validarHora = false;
				int hora = 0;
				while (!validarHora) {

					System.out.println("Digite o horário do compromisso");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 8) {
						validarHora = true;

					} else {
						System.out.println("Digite novamente, a opção foi inválida");
					}

				}
				
				mes--;
				dia--;
				System.out.println("O compromisso agendado é");
				System.out.println(compromisso[mes][dia][hora]);

			} else if (opcao == 0) {
				sair = true;
			}

		}

	}

}

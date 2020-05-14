package br.com.estruturaRepeticao;

import java.util.Scanner;

public class ExecLoop25 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		
		boolean sair = false;
		String continuarCompra;
		int qtdProdutos;
		double preco;
		String outPut;
		double total;
		double valorPago;
		double troco;
		
		do {
			
			System.out.println("Deseja informar uma nova compra? S/N");
			continuarCompra = scan.next();
			
			if(continuarCompra.equalsIgnoreCase("S")) {
				
				outPut = "Lojas Tabajara\n";
				
				System.out.println("Digite a  quantidade de proodutos da compra: ");
				qtdProdutos = scan.nextInt();
			
				total = 0;
				
				for (int i = 1; i <= qtdProdutos; i++) {
					System.out.println("Informe preço do produtos " +i);
					preco = scan.nextDouble();
					total += preco;
					outPut += "Produto" + i + ": R$ " + preco + "\n";
				}
				
				outPut += "Total: R$ " + total;
				
				System.out.println("Total: R$ " + total);
				
				System.out.println("Entre com o valor pago");
				valorPago = scan.nextDouble();
				
				outPut += "Dinheiro: R$ " + valorPago + "\n";
				
				troco = total - valorPago;
				
				outPut += "Troco: R$ " + troco;
				
				System.out.println(outPut);
	
			 } else {
				 sair = true;
			 }		
		} while (!sair);
		
	}

}

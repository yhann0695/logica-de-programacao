package br.com.estruturaRepeticao;

public class ExecLoop04 {

	public static void main(String[] args) {
		
		double paisA = 80000;
		double paisB = 200000;
		int cont = 0;
		
		
		while (paisA < paisB) {
			
			paisA += (paisA/100) * 3;
			paisB +=(paisB/100) * 1.5;
			cont++;
		}
		
		System.out.println("Pais A: " + paisA);
		System.out.println("Pais B: " + paisB);
		System.out.println("Qtd de anos: " +cont);
	}

}

package br.com.estruturaRepeticao;

public class ExecLoop16 {

	public static void main(String[] args) {


		int primeiro = 1;
		int segundo = 1;
		int proximo = 0;
		
		System.out.println(primeiro);
		System.out.println(segundo);
		
		while(proximo <= 500) {
			
			proximo = primeiro + segundo;
			primeiro = segundo;
			segundo = proximo;
			System.out.println(proximo);
		}

	}

}

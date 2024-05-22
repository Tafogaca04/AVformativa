package AVformativa;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		// TODO Auto-generated method stub
		int valor1,valor2,resultado,soma,subtracao,multiplicacao ;
		String operacao;


		System.out.print("Informe o 1° valor:");
		valor1 = ler.nextInt();

		System.out.print("Informe o 2° valor:");
		valor2 = ler.nextInt();

		System.out.print("Informe a operação desejada + ou - ou *:");
		operacao = ler.next();

		//processamento
		soma = ( valor1 + valor2);
		
		subtracao = ( valor1 - valor2);
		
		multiplicacao  = ( valor1 * valor2);
	
		
		//saída

		if (operacao.equals ("+")) {
			System.out.println("O resultado é:" +  soma);
		}
		else if (operacao.equals ("-")) {
			System.out.println("O resultado é:" + subtracao);
		}
		else {
			System.out.println("O resultado é:" + multiplicacao);
		}
		ler.close();
	}

}

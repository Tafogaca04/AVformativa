package AVformativa;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       double lado,area;
       Scanner ler = new Scanner (System.in);
       System.out.print("Informe o valor do tamanho lateral do quadrado:");
       lado = ler.nextDouble();
       
       //Processamento
       area = (lado * lado);
       System.out.print("A área do quadrado é:" + area);
       ler.close();
	}

}

package LPA2;

import java.util.Scanner;

public class incrementaçao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double valor;
		
		System.out.println("informe um valor: ");
		valor = ler.nextDouble();
		
		if (valor % 5 ==0) {
			System.out.println("o numero" + valor+ " é multiplo de 5");
		}
        if (valor % 5 !=0) {
        	System.out.println("o numero" + valor+ " nao é multiplo de 5");
        	ler.close();
        }
	}

}

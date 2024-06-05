package LPA2;

import java.util.Scanner;

public class incrementaçaoATV2 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int senhaADM, senhateste;
		double num1, num2, soma;
		
		System.out.print("Cadastre uma senha (insira apenas numeros): ");
		senhaADM= ler.nextInt();
        
		System.out.print("Digite um numero:");
		num1 = ler.nextDouble();
		System.out.print("Digite um numero diferente:");
		num2 = ler.nextDouble();
		
		soma = num1+num2;
		
		System.out.println("Digite sua senha para desbloquear a soma:");
		senhateste= ler.nextInt();
		
		if (senhateste == senhaADM) {
			System.out.println("a soma é"+soma);
		}
		if (senhateste != senhaADM) {
			System.out.println(" ERRO! senha incoreta");
			ler.close();
			}
		}

}

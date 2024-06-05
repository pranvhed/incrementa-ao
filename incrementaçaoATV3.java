package LPA2;

import java.util.Scanner;

public class incrementaçaoATV3 {

	public static void main(String[] args) {
		Scanner ler =new Scanner(System.in);
		
		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[4];
		
		System.out.println("vetor1 ");
		for (int i=0; i<2; i++) {
			System.out.println("informe o"+i+"valor.. (vetor A)");
			a[i] = ler.nextInt();
			
			System.out.println("informe o"+i+"valor.. (vetor B)");	
			b[i] = ler.nextInt();			
		}
        for(int i=0; i<2; i++) {
        	c[i] = a[i];
        	c[i+2] = b[i];
        }
        System.out.println("vetor C ");
        for(int i=0; i<4; i++) {
        	System.out.println("informe o"+i+"º valor.. "+c[i]);
        }
        ler.close();
	}

}

package br.senai.sp.jandira;

import java.util.Scanner;

public class subtracao {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int valor1 , valor2, total, total2 ;
		
        System.out.println("Valor1 ");
        valor1 = teclado.nextInt();
        
        System.out.println("Valor2 ");
        valor2 = teclado.nextInt();
        
        total = valor1 - valor2;
        
        total2 = valor2 - valor1;
        
        if (valor1 > valor2) { System.out.println("Valor " + total);
			
		} else {
			 
			System.out.println("Valor " + total2);
		}
        
       

	}

}

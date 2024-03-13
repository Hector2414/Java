package br.senai.sp.jandira;

import java.util.Scanner;

public class caso_se {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Qual a sua idade ?");
         idade = teclado.nextInt();
        
        
        
        if (idade >= 18) {System.out.println("Você é maior");
			
		}
        
        else {
			System.out.println("Você é menor");
		}

	   
	
	
	}

}

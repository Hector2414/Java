package br.senai.sp.jandira;

import java.util.Scanner;

public class media_final {

	public static void main(String[] args) {
		
    Scanner teclado = new Scanner(System.in);
    
    
    
    
    System.out.println("Informe seu nome ");
    String nome = teclado.nextLine();
    
    System.out.println("Qual foi a nota do primeiro bimestre ?");
    double nota1 = teclado.nextDouble();
    
    System.out.println("Qual foi a nota do segundo bimestre ?");
    double nota2 = teclado.nextDouble();
    
    System.out.println("Qual foi a nota do terceiro bimestre?");
    double nota3 = teclado.nextDouble();
    		
    System.out.println("Qual foi a nota do quarto bimestre ?");	
    double nota4 = teclado.nextDouble();
    		
    		double notaFinal = (nota1 + nota2 + nota3 + nota4) / 4;
    		
    System.out.println("------------------");		
	System.out.println(    "Média final"   );
	System.out.println("-------------------");
	
	System.out.println(". " + nome);
	
	System.out.println("Nota do primeiro bimestre " + notaFinal);
	
	
	
	
	double notaFinal1;
	
	System.out.println("Qual foi a sua nota final ");
	notaFinal1 = teclado.nextDouble();
	
	if (notaFinal1 >= 7) {System.out.println("Você passou de ano!");
		
	}else {
		System.out.println("Você não passou de ano");
	}
	
	
	
	
	
	}

}

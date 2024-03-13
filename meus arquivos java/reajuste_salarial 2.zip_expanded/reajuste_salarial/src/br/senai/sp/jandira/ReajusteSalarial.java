package br.senai.sp.jandira;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double salario, reajuste, valortotal;
		String nome;
		
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println("           Reajuste salarial");
		System.out.println("* * * * * * * * * * * * * * * * * * * *");
		System.out.println();
		
		System.out.println("Estamos realizando um reajuste salarial em nossa empresa, mas antes, precisamos saber seu salário atual");
		System.out.println();
		
		System.out.print("Diga-nos o seu nome: ");
		nome = teclado.next();
		
		System.out.print("Dga-nos seu salário atual: R$");
		salario = teclado.nextInt();
		System.out.println();
		
		if (salario < 1500) {
			reajuste = salario * 0.15;
			valortotal = salario + reajuste;
			System.out.println("Caro " + nome + " seu reajuste de acordo com o seu salário será de 15% -- " + reajuste + " ou seja, seu salário novo será de: " + valortotal);
		} else {
			if (salario <= 3000) {
				reajuste = salario * 0.10;
				valortotal = salario + reajuste;
				System.out.println("Caro " + nome + " seu reajuste de acordo com o seu salário será de 10% -- " + reajuste + " ou seja, seu salário novo será de: " + valortotal);
			} else {
				reajuste = salario * 0.05;
				valortotal = salario + reajuste;
				System.out.println("Caro " + nome + " seu reajuste de acordo com o seu salário será de 5% -- " + reajuste + " ou seja, seu salário novo será de: " + valortotal);
			
			}
		}
			
		
	}

}


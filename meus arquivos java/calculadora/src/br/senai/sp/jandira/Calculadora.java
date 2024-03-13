package br.senai.sp.jandira;

import java.util.Scanner;

class Calculadora {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
int multiplicador, resultado, Multiplicando1, Multiplicando2;

		

		System.out.println("C A L C U L A D O R A");

		System.out.println();

		System.out.println("        digite o valor que deseja multiplicar e \nos números iniciais e finais para criarmos uma tabuada;");

		System.out.println();

		

		System.out.print("número que deseja multiplicar: ");

		multiplicador = teclado.nextInt();

		System.out.print("número inicial: ");

		Multiplicando1 = teclado.nextInt();

		System.out.print("número final: ");

		Multiplicando2 = teclado.nextInt();

		System.out.println("-------------------------------------");

		

		while (Multiplicando1 != Multiplicando2 + 1) {

			resultado = multiplicador * Multiplicando1;

			System.out.println(multiplicador + " * " + Multiplicando1 + " = " + resultado);

			Multiplicando1++;

		}

		System.out.println("--------------------------------------");

	}

}

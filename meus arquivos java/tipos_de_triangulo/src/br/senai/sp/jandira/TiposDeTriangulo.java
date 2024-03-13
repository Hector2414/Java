package br.senai.sp.jandira;

import java.util.Scanner;

public class TiposDeTriangulo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Qual o valor A ? ");
		int a = teclado.nextInt();
		
		System.out.println("Qual o valor B ? ");
		int b = teclado.nextInt();
		
		System.out.println("Qual o valor C ? ");
		int c = teclado.nextInt();
		
		int triangulo = 0;
		
		if (a + b > c && c + a > b && b + c > a ) {
			
			if ( a == b || b == c) {triangulo = 1;}
			if (a == b && b == c) {triangulo = 3;} else {triangulo = 2;}
			
			if (triangulo == 1) {System.out.println("Esse é um triângulo Isoceles");}
			if (triangulo == 2) {System.out.println("Esse é um triângulo Escaleno");}
			if (triangulo == 3) {System.out.println("Esse é um triangulo Equilátero");}
			
			
			
		}

	}

}

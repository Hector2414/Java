package br.senai.sp.jandira;

import java.util.Scanner;

public class AreaDaCasa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String continuacao;
		String comodo;
		int Areatotal=0;
		
		System.out.println("Deseja adicionar um cômodo? y/n");
		continuacao = teclado.next();
		
		for (int comprimento, largura, area;continuacao.equals("y");) {
		System.out.println("Qual  o nome do cômodo?");
		comodo = teclado.next();
		System.out.println("Qual a altura do cômodo?");
		comprimento = teclado.nextInt();
		System.out.println("Qual a largura do cômodo?");
		largura = teclado.nextInt();
		area = largura*comprimento;
		Areatotal = Areatotal + area;
		System.out.println("Área do seu cômodo: " + area);
		System.out.println("Deseja adicionar mais um cômodo? y/n");
		continuacao = teclado.next();
		}
		System.out.println("A soma do total de áreas é "+Areatotal);

	}

}

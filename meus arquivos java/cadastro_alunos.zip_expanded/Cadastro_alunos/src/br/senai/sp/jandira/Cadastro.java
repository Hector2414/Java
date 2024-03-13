package br.senai.sp.jandira;
import java.util.Scanner;

public class Cadastro {

	public static void main(String[] args) {
		
		Scanner teclado =new Scanner(System.in);
		int i = 0, q = 0;
		double[][] nota = new double[35] [5];
		String[][] alunosaprovacao = new String [35][2]; 
		String acabou;
		
		System.out.println("=====================================");
		System.out.println("             NOTAS FINAIS");
		System.out.println("=====================================");
		System.out.println();
		
		for (i = 0; i != 35; i++) {
			
			System.out.print("Nome do aluno:");
			alunosaprovacao[i][0] = teclado.next();
			System.out.print("Nota do 1º bimestre:");
			nota[i][0] = teclado.nextDouble();
			System.out.print("Nota do 2º bimestre:");
			nota[i][1] = teclado.nextDouble();
			System.out.print("Nota do 3º bimestre:");
			nota[i][2] = teclado.nextDouble();
			System.out.print("Nota do 4º bimestre:");
			nota[i][3] = teclado.nextDouble();
			
			nota[i][4] = (nota[i][0] + nota[i][1] + nota[i][2] + nota[i][3]) / 4;
			
			if ( nota[i][4] >= 5) {
				alunosaprovacao[i][1] = "APROVADO";
			} else {
				alunosaprovacao[i][1] = "REPROVADO";
			}
			
			System.out.println();
			System.out.println("cadastrar outro aluno (S/N)?");
			acabou = teclado.next();
			if( acabou.equalsIgnoreCase("n") || acabou.equalsIgnoreCase("não")) {
				q = i;
				break;
			}
		}
		i = 0;
		System.out.println();
		System.out.println("=====================================");
		System.out.println("         LISTA GERAL DA TURMA");
		System.out.println("=====================================");
		System.out.printf("Nome          Nota1  Nota2  Nota3  Nota4  Média  Situação");
		while(i <= q) {
			System.out.printf("\n %-14s %-6s %-6s %-6s %-6s %-4s %s", alunosaprovacao[i][0], nota[i][0], nota[i][1], nota[i][2], nota[i][3], nota[i][4], alunosaprovacao[i][1] );
			i++;
		}
		
	}

}

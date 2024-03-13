package br.senai.sp.jandira;

import java.util.Scanner;

public class ReajusteSalarial {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		

        System.out.println("=== Reajuste de Salário ===");
        System.out.print("Digite o nome do funcionário: ");
        String nomeFuncionario = teclado.nextLine();

        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = teclado.nextDouble();

        double Reajuste;
        double novoSalario;

        if (salarioAtual < 1500) {
            Reajuste = 15;
        } else if (salarioAtual <= 3000) {
            Reajuste = 10;
        } else {
            Reajuste = 5;
        }

        novoSalario = salarioAtual * (1 + Reajuste / 100);

        System.out.println("\n=== Resultado ===");
        System.out.println("Nome do funcionário: " + nomeFuncionario);
        System.out.println("Percentual de reajuste: " + Reajuste + "%");
        System.out.println("Novo salário com reajuste: R$" + novoSalario);

	}

}

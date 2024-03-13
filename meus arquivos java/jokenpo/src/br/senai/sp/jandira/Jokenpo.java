package br.senai.sp.jandira;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		Random random = new Random();
		

        System.out.println("=== Jogo de Jokenpô ===");
        System.out.println("Escolha sua jogada:");
        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.print("Digite o número correspondente à sua jogada: ");
        int escolhaUsuario = teclado.nextInt();

        if (escolhaUsuario < 1 || escolhaUsuario > 3) {
            System.out.println("Opção inválida. O jogo será encerrado.");
            return;
        }

        String jogadaUsuario = obterJogadaString(escolhaUsuario);

        int escolhaComputador = random.nextInt(3) + 1;
        String jogadaComputador = obterJogadaString(escolhaComputador);

        System.out.println("Você escolheu: " + jogadaUsuario);
        System.out.println("O computador escolheu: " + jogadaComputador);

        if (escolhaUsuario == escolhaComputador) {
            System.out.println("Empate!");
        } else if ((escolhaUsuario == 1 && escolhaComputador == 3) ||
                (escolhaUsuario == 2 && escolhaComputador == 1) ||
                (escolhaUsuario == 3 && escolhaComputador == 2)) {
            System.out.println("Você venceu!");
        } else {
            System.out.println("O computador venceu!");
        }
    }

    private static String obterJogadaString(int escolha) {
        if (escolha == 1) {
            return "Pedra";
        } else if (escolha == 2) {
            return "Papel";
        } else if (escolha == 3) {
            return "Tesoura";
        } else {
            return "Desconhecido";
        }

	}

}

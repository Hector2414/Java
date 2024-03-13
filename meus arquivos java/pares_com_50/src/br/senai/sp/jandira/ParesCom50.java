package br.senai.sp.jandira;

public class ParesCom50 {

	public static void main(String[] args) {
		int somador = 0;
		for (int contagem = 1; contagem <= 50; contagem++) {
			if ((contagem % 2) == 0) {
				somador = somador + contagem;
			}
		}
		System.out.println("A soma dos números pares entre 1 e 50 é: " + somador);

	}

}

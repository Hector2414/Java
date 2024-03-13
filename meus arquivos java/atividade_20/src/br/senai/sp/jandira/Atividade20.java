package br.senai.sp.jandira;

public class Atividade20 {

	public static void main(String[] args) {
		
		 int[] matrizA = new int[20];
	        int[] matrizB = new int[20];

	        // Preenchendo a matriz A
	        for (int i = 0; i < matrizA.length; i++) { matrizA[i] = i + 1; }

	        // Invertendo os valores para a matriz B
	        for (int i = 0; i < matrizA.length; i++) {
	            matrizB[matrizB.length - 1 - i] = matrizA[i];
	        }

	        // Exibindo os valores da matriz B
	        
	        
	       System.out.println("Matriz-B");
	        for (int i = 0; i < matrizB.length; i++) {System.out.print(matrizB[i] + " ");}

	}

}

package br.senai.sp.br;

public class Matriz2 {

	public static void main(String[] args) {
		int A[] = new int[10];

		int B[] = new int[10];

		

		A[0] = 1;

		A[1] = 2;

		A[2] = 3;

		A[3] = 4;

		A[4] = 5;

		A[5] = 6;

		A[6] = 7;

		A[7] = 8;

		A[8] = 9;

		A[9] = 10;

		

		

		

		

		for(int i = 0; i < 10; i++) {

			if (i % 2 == 0) { B[i] = A[i] * 5;} else {B[i] = A[i] + 5;}

			

			for(int i1 = 0; i1 < 10; i1++ ) {System.out.println("B [" + i1 +"]" + B[i1] );}

	}

}
}	

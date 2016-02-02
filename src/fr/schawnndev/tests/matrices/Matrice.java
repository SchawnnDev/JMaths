package fr.schawnndev.tests.matrices;

import fr.schawnndev.maths.Matrix;
import fr.schawnndev.tests.ITest;

public class Matrice implements ITest {

	@Override
	public void test(boolean debug) {
		System.out.println("------ MULTIPLY ------");
		System.out.println(" ");

		{ // Multiply

			int[][] A = { { 1, -2, 5 }, { 0, 3, 7 } };
			int[][] B = { { 3, -4, -1 }, { 9, 7, -8 }, { 0, 1, 3 } };

			Matrix matrixA = new Matrix(A);
			Matrix matrixB = new Matrix(B);

			if(debug) {
				System.out.println("Matrix A :");
				System.out.println(matrixA.toString());
				System.out.println("Matrix B :");
				System.out.println(matrixB.toString());
			}
			
			System.out.println("Matrix A x B:");
			System.out.println(matrixA.multiply(matrixB).toString());

		}

		System.out.println("------ ADDING ------");
		System.out.println(" ");

		{ // Adding

			int[][] A = { { 8, -19, -5 }, { 10, -7, 6 } };
			int[][] B = { { 9, 15, 2, }, { -2, 8, 1 } };

			Matrix matrixA = new Matrix(A);
			Matrix matrixB = new Matrix(B);

			if(debug) {
				System.out.println("Matrix A :");
				System.out.println(matrixA.toString());
				System.out.println("Matrix B :");
				System.out.println(matrixB.toString());
			}
			
			System.out.println("Matrix A + B:");
			System.out.println(matrixA.add(matrixB).toString());

		}

		System.out.println("------ SUBTRACTING ------");
		System.out.println(" ");

		{ // Subtracting

			int[][] A = { { 8, -19, -5 }, { 10, -7, 6 } };
			int[][] B = { { 9, 15, 2 }, { -2, 8, 1 } };

			Matrix matrixA = new Matrix(A);
			Matrix matrixB = new Matrix(B);

			if(debug) {
				System.out.println("Matrix A :");
				System.out.println(matrixA.toString());
				System.out.println("Matrix B :");
				System.out.println(matrixB.toString());
			}
			
			System.out.println("Matrix A - B:");
			System.out.println(matrixA.subtract(matrixB).toString());

		}
	}

}

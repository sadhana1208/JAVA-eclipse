//multiplication of matrix using methods
import java.util.Scanner;
public class matrix_multiplication_using_methods {

	public static void main(String[] args) {
		Scanner in  = new Scanner(System.in);
		System.out.println("no. of rows for A matrix: ");
		int row_A = in.nextInt();
		System.out.println("no. of coloumns for A matrix: ");
		int coloumn_A = in.nextInt();
		System.out.println("no. of rows for B matrix: ");
		int row_B = in.nextInt();
		System.out.println("no. of coloumns for A matrix: ");
		int coloumn_B = in.nextInt();
	
		if(coloumn_A == row_B) {
			int[][] A = getMatrix(row_A, coloumn_A);
			int[][] B = getMatrix(row_B, coloumn_B);
			int[][] prod = product(A,B);
			printMatrix(prod);
		}
		else {
			System.out.println("multiplication not possible");
		}
	}
	public static int[][] getMatrix(int a, int b) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the matrix: ");
		int[][] X = new int[a][b];
		for(int i=0 ; i<a ; i++) {
			for(int j=0 ; j<b ; j++) {
				X[i][j] = in.nextInt();
			}
			System.out.println();
		}
		return X;
	}
	public static int[][] product(int[][] A, int[][] B) {
		int[][] P = new int[A.length][B[0].length];
		for(int i=0 ; i<A.length ; i++) {
			for(int j=0 ; j<B[0].length ; j++) {
				P[i][j] = 0;
				for(int k=0 ; k<A[0].length ; k++) {
					P[i][j] += A[i][k] * B[k][j];
				}			
			}
		}
		return P;
	}
	public static void printMatrix(int[][] prod) {
		for(int i=0 ; i<prod.length ; i++) {
			for(int j=0 ; j<prod[0].length ; j++) {
				System.out.print(prod[i][j] + " ");			
			}
			System.out.println();
		}
	}

}

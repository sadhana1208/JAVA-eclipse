//to print pattern of upper case alphabets in form of triangle
//package Welcome;
//public class Program {
//	public static void main(String[] args) {
//		for(int i=0 ; i<5 ; i++) {
//			for(int j=4 ; j>i ; j--) {
//				System.out.print(" ");
//			}
//			for(int k=0 ; k<=i ; k++) {
//				System.out.print((char)(k+65));
//			}
//			for(int l=0 ; l<i ; l++) {
//				System.out.print((char)(i-l+64));
//			}
//			System.out.println();
//		}
//	}
//}




//to print inverted triangle of stars
//package Welcome;
//public class Program {
//	public static void main(String[] args) {
//		for(int i=0 ; i<=3 ; i++) {
//			for(int j=i ; j>=1 ; j--) {
//				System.out.print(" ");
//			}
//			for(int k=i ; k<4 ; k++) {
//				System.out.print("*");
//			}
//			for(int l=i ; l<3 ; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}




//public class learn{
//	int x =90;
//	int y = 100;
//	public static void main(String[] args) {
//		System.out.println("hi");
//		learn obj = new learn();
//		obj.sum();
//		System.out.println(obj.x);
//		System.out.println(obj.y);
//		System.out.println("hello");		
//	}
//	public void sum() {
//		int a = 90;
//		int b = 200;
//		int c = a+b;
//		System.out.println(c);
//	}
//}




//code to find exponent of a number
//package Welcome;
//import java.util.Scanner;
//public class datatypes {
//	public static void main(String[] args) {
//		Scanner in = new Scanner (System.in);
//		System.out.println("enter the base number B:");
//		int B = in.nextInt();
//		System.out.println("enter the exponent number E:");
//		int E = in.nextInt();
//		int prod = 1;
//		int i = 1;
//		while(i<=E) {
//			prod*=B;
//			i++;
//		}
//		System.out.println("base to power of exponent is:" + prod);
//	}
//}




//to get the input of array elements and print that array
//import java.util.*;
//public class learn{
//    public static void main(String[] args){
//        Scanner s=new Scanner(System.in);
//        int n = s.nextInt();
//        int arr[]=new int[n];
//        for(int i = 0; i < arr.length; i++) //this loop is to get the array elements
//        {
//            arr[i] = s.nextInt();
//        }
//        for (int i = 0; i < arr.length; i++) //this loop is to print the array elements
//        {
//            System.out.print(arr[i] + " " );
//        }
//    }
//}





//to print the sum of all elements in the given array
//import java.util.*;
//public class learn {
//    public static void main(String args[]) {
//        int s1 = sum(new int[]{1,2,3,4,5});
//        System.out.print(s1);
//    }
//    public static int sum(int a[]){
//        int total = 0;
//        for(int i:a){
//            total = total+i;
//        }
//        return total;
//    }
//}




//to print the matrix
//public class learn{
//	public static void main(String args[]){
//		int arr[][]={{1,2,3},{4,5,6},{4,4,5}};
//		for(int x[]:arr) { //to access each set of 3 elements in the above array
//			for(int y:x) { //to access element from set of 3 elements
//				System.out.print(y + " ");
//			}
//			System.out.println();
//		}
//	}
//}




//JAGGED ARRAY
//public class learn{
//	public static void main(String[] args) {
//		int[][]arr = new int[3][];
//		arr[0] = new int[3];
//		arr[1] = new int[4];
//		arr[2] = new int[2];
//		
//		int count = 0;
//		for(int i=0 ; i<arr.length ; i++) {
//			for(int j=0 ; j<arr[i].length ; j++) {
//				arr[i][j] = count++;
//			}
//		}
//		for(int i=0 ; i<arr.length ; i++) {
//			for(int j=0 ; j<arr[i].length ; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}		
//	}
//}




//code to fing largest number in the given array
//import java.util.Scanner;
//public class learn{
//	public static void main(String[] args) {
//		Scanner in = new Scanner (System.in);
//		System.out.println("enter the size of array: ");
//		int arr_size = in.nextInt();
//		int[] arr = new int[arr_size];
//		System.out.println("enter the array: ");
//		for(int i=0 ; i<arr.length ; i++) {
//			arr[i] = in.nextInt();
//		}
//		int largest = arr[0];
//	    for(int j=1 ; j<arr.length ; j++) {
//	    	if(arr[j] > largest) {
//	    		largest = arr[j];    	
//	    	}
//	    }	
//	    System.out.println("the largest number of the given array is: " + largest);
//	}
//}




//to print the pair of numbers in the array whose sum is 30
//import java.util.Scanner;
//public class learn{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the array size");
//		int arr_size = in.nextInt();
//		int[] arr = new int[arr_size];
//		System.out.println("enter the array");
//		for(int i=0 ; i<arr.length ; i++) {
//			arr[i] = in.nextInt();			
//		}
//		for(int j=0 ; j<arr.length ; j++) {
//			for(int k=j+1 ; k<arr.length ; k++) {
//				if(arr[j]+arr[k]==30) {
//					System.out.println(arr[j] + ", " + arr[k]);	
//				}
//			}
//		}
//	}
//}




//matrix multiplication using arrays
//import java.util.Scanner;
//public class learn{
//	public static void main(String[] args) {
//		Scanner in  = new Scanner(System.in);
//		System.out.println("no. of rows for A matrix: ");
//		int row_A = in.nextInt();
//		System.out.println("no. of coloumns for A matrix: ");
//		int coloumn_A = in.nextInt();
//		System.out.println("no. of rows for B matrix: ");
//		int row_B = in.nextInt();
//		System.out.println("no. of coloumns for A matrix: ");
//		int coloumn_B = in.nextInt();
//		int[][] A = new int[row_A][coloumn_A];
//		int[][] B = new int[row_B][coloumn_B];
//		if(coloumn_A == row_B) {
//			System.out.println("enter the elements of matrix A: ");
//			for(int i=0 ; i<row_A ; i++) {
//				for(int j=0 ; j<coloumn_A ; j++) {
//					A[i][j] = in.nextInt();
//				}
//				System.out.println();
//			}
//			System.out.println("enter the elements of matrix B: ");
//			for(int i=0 ; i<row_B ; i++) {
//				for(int j=0 ; j<coloumn_B ; j++) {
//					B[i][j] = in.nextInt();
//				}
//				System.out.println();
//			}
//			int[][] prod = new int[row_A][coloumn_B];
//			for(int i=0 ; i<row_A ; i++) {
//				for(int j=0 ; j<coloumn_B ; j++) {
//					prod[i][j] = 0;
//					for(int k=0 ; k<coloumn_A ; k++) {
//						prod[i][j] += A[i][k] * B[k][j];
//					}
//					
//				}
//			}
//			for(int i=0 ; i<row_A ; i++) {
//				for(int j=0 ; j<coloumn_B ; j++) {
//					System.out.println(prod[i][j]);
//				}
//			}
//		}
//		else {
//			System.out.println("multiplication not possible");
//		}
//	}
//}




//sum of elements in the array
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the array size");
//		int s = in.nextInt();
//		int[] A = new int[s];
//		System.out.println("enter the elements of array: ");
//		for(int i=0 ; i<s ; i++) {
//			A[i] = in.nextInt();
//		}
//		int sum = 0;
//		for(int i=0 ; i<A.length ; i++) {
//			sum += A[i];
//		}
//		System.out.println("the sum of elements in the array is: " + sum);
//	}
//}




//to print jagged array
//import java.util.Scanner;
//public class learn{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int[][]arr = new int[3][];
//		arr[0] = new int[3];
//		arr[1] = new int[4];
//		arr[2] = new int[2];
//		
//		//int count = 0;
//		for(int i=0 ; i<arr.length ; i++) {
//			for(int j=0 ; j<arr[i].length ; j++) {
//				arr[i][j] = in.nextInt();
//			}
//		}
//		for(int i=0 ; i<arr.length ; i++) {
//			for(int j=0 ; j<arr[i].length ; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}		
//	}
//}




//to print jagged array
//import java.util.Scanner;
//public class learn{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter no.of rows required: ");
//		int row = in.nextInt();
//		int[][]arr = new int[row][];
//		for(int i=0 ; i<row ; i++) {
//			System.out.println("enter no. of elements in each row " + (i+1) + ": ");
//			int x = in.nextInt();
//			arr[i] = new int[x];
//		}
//		for(int i=0 ; i<row ; i++) {
//			System.out.println("enter the elements of row " + (i+1) + ": ");
//			for(int j=0 ; j<arr[i].length ; j++) {
//				arr[i][j] = in.nextInt();
//			}
//		}
//		for(int i=0 ; i<row ; i++) {
//			for(int j=0 ; j<arr[i].length ; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//}




//to print the reverse array of given array
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int[] arr = new int[n];
//		for(int i=0 ; i<arr.length ; i++) {
//			arr[i] = in.nextInt();
//		}
//		int[] Rarr = new int[n];
//		for(int i=0 ; i<Rarr.length ; i++) {
//			System.out.print((Rarr[i]=arr[n-(i+1)]) + " ");
//		}
//	}
//}




//to merge 2 arrays
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter no. of elements in array A: ");
//		int n = in.nextInt();
//		int[] A = new int[n];
//		System.out.println("enter no. of elements in array B: ");
//		int m = in.nextInt();
//		int[] B = new int[m];
//		for(int i=0 ; i<A.length ; i++) {
//			A[i] = in.nextInt();
//		}
//		for(int i=0 ; i<B.length ; i++) {
//			B[i] = in.nextInt();
//		}
//		for(int i=0 ; i<(n) ; i++) {
//			System.out.print(A[i] + " ");
//		}
//		for(int i=0 ; i<(m) ; i++) {
//			System.out.print(B[i] + " ");
//		}
//		
//	}
//}




//transpose of a matrix
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter no. of rows: ");
//		int r = in.nextInt();
//		System.out.println("enter no. of coloumns: ");
//		int c = in.nextInt();
//		int[][] A = new int[r][c];
//		for(int i=0 ; i<r ; i++) {
//			System.out.println("enter row " + (i+1) + " elements: ");
//			for(int j=0 ; j<c ; j++) {
//				A[i][j] = in.nextInt();
//			}
//		}
//		int[][] B = new int[c][r]; 
//		for(int i=0 ; i<c ; i++) {
//			for(int j=0 ; j<r ; j++) {
//				System.out.print((B[i][j] = A[j][i]) + " ");
//			}
//			System.out.println();		
//		}
//	}
//}




//multiplication of matrix using methods
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in  = new Scanner(System.in);
//		System.out.println("no. of rows for A matrix: ");
//		int row_A = in.nextInt();
//		System.out.println("no. of coloumns for A matrix: ");
//		int coloumn_A = in.nextInt();
//		System.out.println("no. of rows for B matrix: ");
//		int row_B = in.nextInt();
//		System.out.println("no. of coloumns for A matrix: ");
//		int coloumn_B = in.nextInt();
//	
//		if(coloumn_A == row_B) {
//			int[][] A = getMatrix(row_A, coloumn_A);
//			int[][] B = getMatrix(row_B, coloumn_B);
//			int[][] prod = product(A,B);
//			printMatrix(prod);
//		}
//		else {
//			System.out.println("multiplication not possible");
//		}
//	}
//	public static int[][] getMatrix(int a, int b) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the matrix: ");
//		int[][] X = new int[a][b];
//		for(int i=0 ; i<a ; i++) {
//			for(int j=0 ; j<b ; j++) {
//				X[i][j] = in.nextInt();
//			}
//			System.out.println();
//		}
//		return X;
//	}
//	public static int[][] product(int[][] A, int[][] B) {
//		int[][] P = new int[A.length][B[0].length];
//		for(int i=0 ; i<A.length ; i++) {
//			for(int j=0 ; j<B[0].length ; j++) {
//				P[i][j] = 0;
//				for(int k=0 ; k<A[0].length ; k++) {
//					P[i][j] += A[i][k] * B[k][j];
//				}			
//			}
//		}
//		return P;
//	}
//	public static void printMatrix(int[][] prod) {
//		for(int i=0 ; i<prod.length ; i++) {
//			for(int j=0 ; j<prod[0].length ; j++) {
//				System.out.print(prod[i][j] + " ");			
//			}
//			System.out.println();
//		}
//	}
//}	
		



//to find trace of matrix
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter no. of rows: ");
//		int r = in.nextInt();
//		System.out.println("enter no. of coloumn: ");
//		int c = in.nextInt();
//		if(r==c) {
//			int[][] A = new int[r][c];
//			System.out.println("enter the matrix: ");
//			for(int i=0 ; i<r ; i++) {
//				for(int j=0 ; j<c ; j++) {
//					A[i][j] = in.nextInt();
//				}
//			}
//			int s=0;
//			for(int i=0 ; i<r ; i++) {
//				for(int j=0 ; j<c ; j++) {
//					if(i==j) {
//						s+=A[i][j];
//					}					
//				}
//			}
//			System.out.println("trace of a matrix is: " + s);
//		}
//		else {
//			System.out.println("trace cannot be found");
//		}
//		
//	}
//}
	



//transpose of matrix using methods
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter no.of rows: ");
//		int r = in.nextInt();
//		System.out.println("enter no.of coloumns: ");
//		int c = in.nextInt();
//		int[][] A = getMatrix(r,c, in);
//		int[][] B = transpose(A);
//		printMatrix(B);
//	}
//	public static int[][] getMatrix(int a, int b, Scanner in) {
//		System.out.println("enter a matrix: ");
//		int[][] X = new int[a][b];
//		for(int i=0 ; i<a ; i++) {
//			for(int j=0 ; j<b ; j++) {
//				X[i][j] = in.nextInt();
//			}
//			System.out.println();
//		}
//		return X;		
//	}
//	public static int[][] transpose(int[][] A) {
//		int[][] Y = new int[A[0].length][A.length];
//		for(int i=0 ; i<A[0].length ; i++) {
//			for(int j=0 ;  j<A.length ; j++) {
//				Y[i][j] = A[j][i];
//			}
//			System.out.println();
//		}
//		return Y;
//	}
//	public static void printMatrix(int[][] B) {
//		for(int i=0 ; i<B.length ; i++) {
//			for(int j=0; j<B[0].length ; j++) {
//				System.out.print(B[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//	
//}

		


//multiplication of matrix, moovit format
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in  = new Scanner(System.in);
//		System.out.println("no. of rows for A matrix: ");
//		int row_A = in.nextInt();
//		System.out.println("no. of coloumns for A matrix: ");
//		int coloumn_A = in.nextInt();
//		System.out.println("no. of rows for B matrix: ");
//		int row_B = in.nextInt();
//		System.out.println("no. of coloumns for A matrix: ");
//		int coloumn_B = in.nextInt();
//	
//		if(coloumn_A == row_B) {
//			int[][] A = getMatrix(row_A, coloumn_A,in);
//			int[][] B = getMatrix(row_B, coloumn_B,in);
//			int[][] prod = product(A,B);
//			printMatrix(prod);
//		}
//		else {
//			System.out.println("multiplication not possible");
//		}
//	}
//	public static int[][] getMatrix(int a, int b, Scanner in) {
//		System.out.println("enter the matrix: ");
//		int[][] X = new int[a][b];
//		for(int i=0 ; i<a ; i++) {
//			for(int j=0 ; j<b ; j++) {
//				X[i][j] = in.nextInt();
//			}
//			System.out.println();
//		}
//		return X;
//	}
//	public static int[][] product(int[][] A, int[][] B) {
//		int[][] P = new int[A.length][B[0].length];
//		for(int i=0 ; i<A.length ; i++) {
//			for(int j=0 ; j<B[0].length ; j++) {
//				P[i][j] = 0;
//				for(int k=0 ; k<A[0].length ; k++) {
//					P[i][j] += A[i][k] * B[k][j];
//				}			
//			}
//		}
//		return P;
//	}
//	public static void printMatrix(int[][] prod) {
//		for(int i=0 ; i<prod.length ; i++) {
//			for(int j=0 ; j<prod[0].length ; j++) {
//				System.out.print(prod[i][j] + " ");			
//			}
//			System.out.println();
//		}
//	}
//}	




//split
//public class learn{
//	public static void main(String[] args) {
//		String s1 = "you are a stupid pranitha";
//		String [] split = s1.split(" ");
//		for(String obj : split) {
//			System.out.println(obj);
//		}
//	}
//}



//concat 
//import java.util.Scanner;
//public class learn{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String s1 = in.nextLine();
//		String s2 = in.nextLine();
//		System.out.println(s1.concat(s2));
//	}
//}



//endsWith
//import java.util.Scanner;
//public class learn{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String s1 = in.nextLine();
//		String s2 = in.nextLine();
//		System.out.println(s1.endsWith(s2));
//	}
//}




//startssWith
//import java.util.Scanner;
//public class learn{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String s1 = in.nextLine();
//		String s2 = in.nextLine();
//		System.out.println(s1.startsWith(s2));
//	}
//}





//addition of matrix using methods
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter order of matrix: ");
//		System.out.println("enter row of A matrix: ");
//		int rowA = in.nextInt();
//		System.out.println("enter coloumn of A matrix: ");
//		int colA = in.nextInt();
//		System.out.println("enter row of B matrix: ");
//		int rowB = in.nextInt();
//		System.out.println("enter coloumn of B matrix: ");
//		int colB = in.nextInt();
//		if(rowA==rowB && colA==colB) {
//			int[][] A = getMatrix(rowA, colA, in);
//			int[][] B = getMatrix(rowB, colB, in);
//			int[][] S = add(A,B);
//			printMatrix(S);	
//		}
//		else {
//			System.out.println("addition not poosible");
//		}
//			
//	}
//	public static int[][] getMatrix(int a, int b, Scanner in) {
//		System.out.println("enter the elements of matrix: ");
//		int[][] X = new int[a][b];
//		for(int i=0 ; i<a ; i++) {
//			for(int j=0 ; j<b ; j++) {
//				X[i][j] = in.nextInt();
//			}
//			System.out.println();
//		}
//		return X;		
//	}
//	public static int[][] add(int[][] A, int[][] B) {
//		int[][] Y = new int[A.length][B[0].length];
//		for(int i=0 ; i<A.length ; i++) {
//			for(int j=0 ; j<B.length ; j++) {
//				Y[i][j] = A[i][j] + B[i][j];
//			}
//			//System.out.println();
//		}
//		return Y;
//	}
//	public static void printMatrix(int[][] S) {
//		for(int i=0 ; i<S.length ; i++) {
//			for(int j=0 ; j<S[0].length ; j++) {
//				System.out.print(S[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//}




//lower triangular matrix using methods
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter no. of rows: ");
//		int row = in.nextInt();
//		System.out.println("enter no.of coloumns: ");
//		int col = in.nextInt();
//		if(row==col) {
//			int[][] A = getMatrix(row, col, in);
//			int[][] L = lowerTriangular(A);
//			printMatrix(L);
//		}
//		else {
//			System.out.println("you entered a inappropriate matrix");
//		}		
//	}
//	public static int[][] getMatrix(int a, int b, Scanner in) {
//		System.out.println("enter the elements of a matrix: ");
//		int[][] X = new int[a][b];
//		for(int i=0 ; i<a ; i++) {
//			for(int j=0 ; j<b ; j++) {
//				X[i][j] = in.nextInt();
//			}
//			System.out.println();
//		}
//		return X;
//	}
//	public static int[][] lowerTriangular(int[][] A) {
//		int[][] Y =  new int[A.length][A[0].length];
//		for(int i=0 ; i<A.length ; i++) {
//			for(int j=0 ; j<A[0].length ; j++) {
//				if(i<j) {
//					Y[i][j] = 0;				
//				}
//				else {
//					Y[i][j] = A[i][j];
//				}
//			}
//			System.out.println();
//		}
//		return Y;
//	}
//	public static void printMatrix(int[][] L) {
//		for(int i=0 ; i<L.length ; i++) {
//			for(int j=0 ; j<L[0].length ; j++) {
//				System.out.print(L[i][j]);
//			}
//			System.out.println();
//		}
//	}
//}




//toCharArray
//public class learn {
//     public static void main(String[] args) {
//	String str = "Saket";
//        char[] chars = str.toCharArray();
//        System.out.println(chars);
//        for (int i= 0; i< chars.length; i++) {
//            System.out.println(chars[i]);
//        }
//  } 
//}




//StringBuffer
//public class learn {
//	public static void main(String[] args) {
//		String s = "Sadhana";
//		StringBuffer x = new StringBuffer(s);
//		x.reverse();
//		System.out.println(x);
//	}
//}




//toUpperCase using methods
//import java.util.Scanner;
//public class learn {
//	public static void  main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String s = getString(in);
//		String A = upper(s);
//		printString(A);		
//	}
//	public static String getString(Scanner in) {
//		System.out.println("enter a string: ");
//		String x = in.nextLine();
//		return x;
//	}
//	public static String upper(String s) {
//		String y = s.toUpperCase();
//		return y;		
//	}
//	public static void printString(String A) {
//		System.out.println(A);
//	}	
//}




//to check if the given string is palindrome or not using methods
//import java.util.Scanner;
//public class learn {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String s = getStr(in);
//		String r = rev(s);
//		if(s==r) {
//			System.out.println("yes");
//		}
//		else {
//			System.out.println("no");
//		}
//	}
//	public static String getStr(Scanner in) {
//		System.out.println("enter a string: ");
//		String a = in.nextLine();
//		return a;
//	}
//	public static String rev(String r) {
//		StringBuffer b = new StringBuffer(r);
//		b.reverse();
//		String c = b.toString();
//		return c;	
//	}
//}




//import Welcome.animal;
//import Welcome.animal2;
//class animal{
//	void king() {
//		System.out.println("lion");
//	}
//}
//class animal2 extends animal {
//	void nextking() {
//		System.out.println("tiger");
//	}
//}
//public class learn {
//	public static void main(String args[]) {
//		animal2 obj = new animal2();
//		obj.nextking();
//		obj.king();
//	}	
//}



//capacity() in string buffer class
//public class learn{
//	public static void main(String args[]) {
//		String s = "today";
//		StringBuffer sb = new StringBuffer(s.length());
//		System.out.println(sb.capacity());
//	}
//}




//capacity() in string builder class
//public class learn{
//	public static void main(String args[]) {
//		StringBuilder s = new StringBuilder("");
//		System.out.println(s.capacity());
//	}
//}



//public class learn {
//	int x=5;
//	public static void main(String args[]) {
//		learn obj1 = new learn();
//		learn obj2 = new learn();
//		System.out.println(obj1.x);
//		System.out.println(obj2.x);
//	}
//}




//class Log{
//    public int debugLevel = 1;
//    public void debug(String logLine){
//        System.out.println("Debug: "+logLine);
//    }
//    public void info(String logLine){
//        System.out.println("Information: "+logLine);
//    }
//}
//public class learn{
//    public static void main( String[] args ) {
//        Log log = new Log();
//        log.debug("debug with level " + log.debugLevel);
//        log.debugLevel = 5;
//        log.info("information with level " + log.debugLevel);
//    }
//}




//package Welcome;
//import java.util.*;
//import java.text.*;
//import java.time.*;
//import java.time.format.*;
//public class learn {
//
//	public static void main(String[] args) {
////		int year1 = 2025, month1 = 03, day1 = 26, hour1 = 15, minutes1 = 45, seconds1 = 30;
////		int milliseconds1 = 222; 
//
//		Calendar C1 = new GregorianCalendar();
//		C1.set(Calendar.YEAR, 2025);
//		C1.set(Calendar.MONTH, 03);
//		C1.set(Calendar.DAY_OF_MONTH, 26);
//		C1.set(Calendar.HOUR_OF_DAY, 15);
//		C1.set(Calendar.MINUTE, 45);
//		C1.set(Calendar.SECOND, 30);
//		C1.set(Calendar.MILLISECOND, 222);
//		
//		Date d1 = C1.getTime();
//		System.out.println(d1);
//		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:S a z");
//		System.out.println("Date and Time in prescribed format: " + ft.format(d1));
//		
//		LocalDateTime L1 = LocalDateTime.of(2025, 03, 26, 15, 45, 30);
//		System.out.println(L1);
//		DateTimeFormatter f1 = DateTimeFormatter.ofPattern("yyyy/MM/dd hh-mm-ss a");
//		System.out.println("Format using LOCALDATETIME: "+f1.format(L1));
//	}
//
//}


//package Welcome;
//import java.util.*;
//public class learn {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner in = new Scanner(System.in);
//		String name1 = in.nextLine();
//		double amount = in.nextDouble();
//		Account1 A = new Account1(name1, amount);
//		System.out.printf("%s's account balance is: %.2f%n", A.getName(), A.getBalance()); 
//		
//		
//		System.out.print("Enter deposit amount for A: "); 
//	    double depositAmount = in.nextDouble(); 
//	    System.out.printf("%nadding %.2f to account A balance%n%n", depositAmount);
//	    A.deposit(depositAmount);	
//	    System.out.printf("Balance in %s account is: %.2f%n", A.getName(), A.getBalance()); 
//	    
//	    System.out.print("Enter withdraw amount from A: "); 
//	    double withdrawAmount = in.nextDouble(); 
//	    System.out.printf("%nsubtracting %.2f from account A balance%n%n", withdrawAmount);
//	    A.withdraw(withdrawAmount);	
//	    System.out.printf("Balance in %s account is: %.2f%n", A.getName(), A.getBalance()); 
//
//	}
//
//}
//
//class Account1{
//	private String name;
//	private double balance;
//	public Account1(String name, double balance) {
//		this.name = name;
//		if(balance>0.0) {
//			this.balance = balance;
//		}
//	}
//	public void deposit(double depositAmount) {
//		if(depositAmount>0.0) {
//			balance = balance + depositAmount;
//		}
//	}
//	public void withdraw(double withdrawAmount) {
//		double Amount = withdrawAmount;
//		if(Amount>0.0 && balance>Amount) {
//			balance = balance - Amount;
//			System.out.println("Withdrawn amount is " + Amount);
//			//System.out.println("Balance available in account " + balance);
//		}
//		else {
//			System.out.println("Withdraw amount exceeded account balance");
//		}
//	}
//	public double getBalance() {
//		return balance;
//	}
//	public String getName() {
//		return name;
//	}	
//}





//import java.util.*; 
//class Animal{
//    void king()    {  System.out.println("Lion");    }
//}
//class Animal2 extends Animal
//{
//    void nextking()
//    {        System.out.println("Tiger");    }
//}
//public class learn{
//    public static void main(String aargs[]){
//        Animal2 obj=new Animal2();
//        obj.nextking();
//        obj.king();
//    }
//}



//class Animal{
//void eat(){System.out.println("eating...");}
//}
//class Dog extends Animal{
//void bark(){System.out.println("barking...");}
//}
//class Cat extends Animal{
//void meow(){System.out.println("meowing...");}
//}
//public class learn{
//public static void main(String args[]){
//Cat c=new Cat();
//c.meow();
//c.eat();
////c.bark();//C.T.Error
//}}



//to search a given number in an array, if element is found print found else print not found
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter array size:");
//		int arr_size = in.nextInt();
//		int arr[] = new int[arr_size];
//		for(int i=0 ; i<arr_size ; i++) {
//			arr[i] = in.nextInt();	
//		}
//		for(int i=0 ; i<arr_size ; i++) {
//			System.out.print(arr[i] + " ");
//		}
//		System.out.println("\nEnter search element:");
//		int search_element = in.nextInt();
//		boolean f = false;
//		for(int i=0 ; i<arr_size ; i++) {
//			if(search_element == arr[i]) {
//				f=true;
//			}
//		}
//		if(f) {
//			System.out.println("Found");
//		}
//		else {
//			System.out.println("Not Found");
//		}
//	}
//}



//to print rectangular matrix using methods
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the rows:");
//		int rows = in.nextInt();
//		System.out.println("Enter the columns:");
//		int col = in.nextInt();
//		if(rows!=col) {
//			int[][] A = getMatrix(rows , col , in);
//			printMatrix(A);
//		}
//		else {
//			System.out.println("Order of the rows and columns should be different.");
//		}
//	}
//	public static int[][] getMatrix(int a, int b, Scanner in) {
//		int[][] X = new int[a][b];
//		for(int i=0 ; i<a ; i++) {
//			for(int j=0 ; j<b ; j++) {
//				X[i][j] = in.nextInt();
//			}
//		}
//		return X;
//		
//	}
//	public static void printMatrix(int[][] A) {
//		for(int i=0 ; i<A.length ; i++) {
//			for(int j=0 ; j<A[0].length ; j++) {
//				System.out.print(A[i][j] + " ");
//			}
//			System.out.println();
//		}
//	}
//}




//to get int, string, double and float inputs using scanner class
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter a string");
//		String s = in.nextLine();
//		System.out.println("You entered string " + s);
//		System.out.println("Enter an integer");
//		int i = in.nextInt();
//		System.out.println("You entered integer " + i);
//		System.out.println("Enter a float");
//		float f = in.nextFloat();
//		System.out.println("You entered float " + f);
//		System.out.println("Enter a double");
//		double d = in.nextDouble();
//		System.out.println("You entered double " + d);
//		
//	}
//}




//to return the index of first occurrence of specified char and convert all char into uppercase
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String s = in.nextLine();
//		String x = in.nextLine();
//		String a = in.nextLine();
//		System.out.println("Index of " + "\'" + x + "\'" + ": " + s.indexOf(x));
//		System.out.println("Uppercase: " + a.toUpperCase());
//		
//	}
//}




//to convert fahrenheit to celcius
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter temperature in Fahrenheit");
//		float f = in.nextFloat();
//		float c = (((f-32)*5)/9);
//		System.out.println("Temperature in Celsius = " + c);
//	}
//}




//to calculate electricity bill
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter the number of units:");
//		int u = in.nextInt();
//		if(u>0 && u<=100) {
//			System.out.println("The Electricity Bill is 200 Rupees");
//		}
//		else if(u>100 && u<=150) {
//			System.out.println("The Electricity Bill is " + (200+(u-100)*0.6) + " Rupees");
//		}
//		else if(u>150 && u<=200) {
//			System.out.println("The Electricity Bill is " + (200+(50*0.6)+(u-150)*1.2) + " Rupees");
//		}
//		else {
//			System.out.println("The Electricity Bill is " + (200+(50*0.6)+(50*1.2)+(u-200)*2.4) + " Rupees");
//		}
//	}
//}




//hierarchical inheritance
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String S1 = in.nextLine();
//		A obj = new A();
//		A11 obj1 = new A11();
//		A12 obj2 = new A12();
//		obj.display(S1);
//		obj1.display();
//		obj2.display();		
//	}
//}
//class A {
//	void display(String S1) {
//		System.out.println(S1);
//	}
//}
//class A1 extends A {
//	void display() {		
//	}
//}
//class A2 extends A {
//	void display() {
//	}
//}
//class A11 extends A1 {
//	void display() {
//		System.out.println("I'm in child class A11");
//	}
//}
//class A12 extends A1 {
//	void display() {
//		System.out.println("I'm in child class A12");
//	}
//}




//to print pattern of numbers
//package Welcome;
//import java.util.*;
//public class Program{
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter the number of rows:");
//        int r = in.nextInt();
//        for(int i=1 ; i<=r ; i++){
//            for(int j=(r-1) ; j>=i ; j--){
//                System.out.print("  ");
//            }
//            for(int k=i ; k>0 ; k--){
//                System.out.print(k + " ");
//            }
//            for(int l=2 ; l<=i ; l++){
//                System.out.print(l + " ");
//            }
//            System.out.println();
//        }
//    }
//}




//to get area and perimeter of a rectangle
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter R1 width:");
//		double w = in.nextDouble();
//		System.out.println("Enter R1 height:");
//		double h = in.nextDouble();
//		Rectangle R1 = new Rectangle(w,h);
//		System.out.println("For width " + w + " and height " + h + " the area and perimeters are " + R1.getArea() + ", and " + R1.getPerimeter() + " , Respectively.");		
//	}
//}
//class Rectangle {
//	double width;
//	double height;
//	Rectangle() {
//		width = 1.0;
//		height = 1.0;
//	}
//	Rectangle(double x, double y) {
//		width = x;
//		height = y;
//	}
//	double getArea() {
//		return width*height;
//	}
//	double getPerimeter() {
//		return 2*(height+width);
//	}
//}




//attendance exception
//package Welcome;
//import java.util.*;
//class AttendenceException extends Exception {
//    public AttendenceException(String message) {
//        super(message);
//    }
//}
//public class Program {
//    public static void checkAttendence(int percentage) throws AttendenceException {
//        if (percentage < 75) {
//            throw new AttendenceException("AttendenceException: Debarred... Not allowed to write exam.");
//        } else {
//            
//            System.out.println("Allowed to write exam... All The Best.");
//        }
//    }
//
//    public static void main(String[] args) {
//    	Scanner in = new Scanner(System.in);
//    	System.out.println("Enter percentage of attendence");
//    	int a = in.nextInt();
//        try {
//            checkAttendence(a);
//        } catch (AttendenceException e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}




//package Welcome;
//import java.util.*;
//class AttendanceException extends Exception {
//    public AttendanceException(String message) {
//        super(message);
//    }
//}
//public class Program{
//    public static void main(String [] args){
//        Scanner at=new Scanner(System.in);
//        System.out.println("Enter percentage of attendence");
//        float a=at.nextFloat();
//        if(a<75){
//            try{
//                throw new AttendanceException("Attendance insufficient");
//            }
//            catch(AttendanceException e){
//                System.out.println("AttendenceException: Debarred... Not allowed to write exam.");
//            }
//        }
//        else{
//            System.out.println("Allowed to write exam... All The Best.");
//        }
//    }
//}






//import java.util.*;
//public class Program {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String name = in.nextLine();
//        double balance = in.nextDouble();
//        Account A = new Account(name, balance);
//        System.out.printf("%s's account balance is: %.2f%n" , A.getName() , A.getBalance());
//        System.out.println("Enter deposit amount for A:");
//        double depositAmount = in.nextDouble();
//        A.deposit(depositAmount);
//        System.out.printf("adding %.2f to account A balance%n%n" , depositAmount);
//        System.out.printf("Balance in %s account is: %.2f%n" , A.getName() , A.getBalance());
//        System.out.println("Enter withdraw amount from A:");
//        double withdrawAmount = in.nextDouble();
//        System.out.printf("subtracting %.2f from account A balance%n%n" , withdrawAmount);
//        A.withdraw(withdrawAmount);
//        System.out.printf("Balance in %s account is: %.2f" , A.getName() , A.getBalance());
//    }
//}
//class Account {
//    private double balance;
//    private String name;
//    public Account (String name, double balance) {
//        this.name = name;
//        if(balance > 0.0) {
//            this.balance = balance;
//        }
//    }
//    public void deposit(double depositAmount) {
//        if(depositAmount > 0.0){
//            balance = balance + depositAmount;
//        }
//    }
//    public void withdraw(double withdrawAmount) {
//        if(withdrawAmount > 0.0 && balance > withdrawAmount) {
//            balance = balance - withdrawAmount;
//            System.out.println("Withdrawn amount is " + withdrawAmount);
//        }
//        else {
//            System.out.println("Withdraw amount exceeded account balance");
//        }
//    }
//    public double getBalance() {
//        return balance;
//    }
//    public String getName() {
//        return name;
//    }
//}




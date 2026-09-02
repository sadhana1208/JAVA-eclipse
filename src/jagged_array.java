//to print jagged array
import java.util.Scanner;
public class jagged_array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter no.of rows required: ");
		int row = in.nextInt();
		int[][]arr = new int[row][];
		for(int i=0 ; i<row ; i++) {
			System.out.println("enter no. of elements in each row " + (i+1) + ": ");
			int x = in.nextInt();
			arr[i] = new int[x];
		}
		for(int i=0 ; i<row ; i++) {
			System.out.println("enter the elements of row " + (i+1) + ": ");
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j] = in.nextInt();
			}
		}
		for(int i=0 ; i<row ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}

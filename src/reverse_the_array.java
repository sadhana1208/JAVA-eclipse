//to print the reverse array of given array
import java.util.Scanner;
public class reverse_the_array {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] arr = new int[n];
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = in.nextInt();
		}
		int[] Rarr = new int[n];
		for(int i=0 ; i<Rarr.length ; i++) {
			System.out.print((Rarr[i]=arr[n-(i+1)]) + " ");
		}
	}

}

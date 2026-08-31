//to print the pair of numbers in the array whose sum is 30
import java.util.Scanner;
public class sum_of_pair_is_30 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the array size");
		int arr_size = in.nextInt();
		int[] arr = new int[arr_size];
		System.out.println("enter the array");
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = in.nextInt();			
		}
		for(int j=0 ; j<arr.length ; j++) {
			for(int k=j+1 ; k<arr.length ; k++) {
				if(arr[j]+arr[k]==30) {
					System.out.println(arr[j] + ", " + arr[k]);	
				}
			}
		}
	}

}

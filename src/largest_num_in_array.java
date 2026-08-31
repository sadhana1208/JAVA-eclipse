//code to find largest number in the given array
import java.util.Scanner;
public class largest_num_in_array {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the size of array: ");
		int arr_size = in.nextInt();
		int[] arr = new int[arr_size];
		System.out.println("enter the array: ");
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = in.nextInt();
		}
		int largest = arr[0];
	    for(int j=1 ; j<arr.length ; j++) {
	    	if(arr[j] > largest) {
	    		largest = arr[j];    	
	    	}
	    }	
	    System.out.println("the largest number of the given array is: " + largest);
	}

}

//fibonacci series
import java.util.*;
public class fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[] = new int[n];
		arr[0]=0;
		arr[1]=1;
		if (n>2) {
			for(int i=2 ; i<n ; i++) {
				arr[i] = arr[i-1] + arr[i-2];
			}
			for(int j=0 ; j<n ; j++) {
				System.out.print(arr[j] + " ");
			}
		}
		else {
			for(int k=0 ; k<n ; k++) {
				System.out.print(arr[k] + " ");
			}
		}
	}
}

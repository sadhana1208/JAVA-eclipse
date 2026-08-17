//finding whether the given is armstrong number or not
import java.util.*;
public class armstrong_number {
	public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int x = n;
      int numOfDigits = String.valueOf(n).length(); //converting integer to string and finding its length
      double sum = 0;
      while (n>0) {
      	int A = n%10;
      	sum = sum + Math.pow(A, numOfDigits);
      	n = n/10;
      }
      if (sum == x) {
          System.out.println("The number is an Armstrong number");
      } 
      else {
          System.out.println("The number is not an Armstrong number");
      }
  }
}

import java.util.*;
public class binary_palindrome {
	public static boolean palindrome(String s) {
		int left = 0;
		int right = s.length()-1;
		while(left<right) {
			if(s.charAt(left) != s.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if(palindrome(s)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}			
	}
}

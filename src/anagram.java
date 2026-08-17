//check if two strings are anagram
import java.util.Scanner;
import java.util.Arrays;
public class anagram {
	public static String sortString(String S) {
		char[] x = S.toCharArray(); //to convert string into array which contain all characters of the string
		Arrays.sort(x); //to arrange in alphabetical order
		return new String(x);		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String A = in.nextLine();
		String B = in.nextLine();
		String M = A.replaceAll("\\s" , "");
		String N = B.replaceAll("\\s" , "");
		String a = sortString(M);
		String b = sortString(N);
		if (a.equalsIgnoreCase(b)) {
			System.out.println("the strings are anagrams");
		}
		else {
			System.out.println("the strings are not anagram");
		}
	}
}

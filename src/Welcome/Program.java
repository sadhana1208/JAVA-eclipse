//to check if two strings are anagram
//package Welcome;
//import java.util.Scanner;
//import java.util.Arrays;
//public class Program {
//	public static String sortString(String S) {
//		char[] x = S.toCharArray(); //to convert string into array which contain all characters of the string
//		Arrays.sort(x); //to arrange in alphabetical order
//		return new String(x);		
//	}
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String A = in.nextLine();
//		String B = in.nextLine();
//		String M = A.replaceAll("\\s" , "");
//		String N = B.replaceAll("\\s" , "");
//		String a = sortString(M);
//		String b = sortString(N);
//		if (a.equalsIgnoreCase(b)) {
//			System.out.println("the strings are anagrams");
//		}
//		else {
//			System.out.println("the strings are not anagram");
//		}
//	}
//}




//fibonnaci series
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int arr[] = new int[n];
//		arr[0]=0;
//		arr[1]=1;
//		if (n>2) {
//			for(int i=2 ; i<n ; i++) {
//				arr[i] = arr[i-1] + arr[i-2];
//			}
//			for(int j=0 ; j<n ; j++) {
//				System.out.print(arr[j] + " ");
//			}
//		}
//		else {
//			for(int k=0 ; k<n ; k++) {
//				System.out.print(arr[k] + " ");
//			}
//		}
//	}
//}




//array has 1 to n integers, find the missing number [1,2,4,5]=missing is 3
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int sum = n*(n+1)/2;
//		int arr[] = new int[n-1];
//		int x = 0;
//		for(int i=0 ; i<(n-1) ; i++) {
//			arr[i] = in.nextInt();
//		}
//		for(int j=0 ; j<(n-1) ; j++) {
//			x = x + arr[j];
//		}
//		System.out.println("the missing number is: " + (sum-x));
//	}
//}




//armstrong number, this code does not work 
//package Welcome;
//import java.math.*;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		char[] A = String.valueOf(n).toCharArray(); 
//		int x = A.length;
//		System.out.println(x);
//		double s = 0;
//		for(int i=0 ; i<x ; i++) {
//			System.out.println(A[i]);
//			s = s + Math.pow(A[i], x); //A[i] represents ASCII value of the character hence gives wrong answer
//			System.out.println(s);
//		}
//		if(s==n) {
//			System.out.println("the number is armstrong number");
//		}
//		else {
//			System.out.println("the number is not armstarong number");
//		}
//	}
//}




//finding whether the given is armstrong number or not
//package Welcome;
//import java.util.*;
//public class Program {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int x = n;
//        int numOfDigits = String.valueOf(n).length(); //converting integer to string and finding its length
//        double sum = 0;
//        while (n>0) {
//        	int A = n%10;
//        	sum = sum + Math.pow(A, numOfDigits);
//        	n = n/10;
//        }
//        if (sum == x) {
//            System.out.println("The number is an Armstrong number");
//        } 
//        else {
//            System.out.println("The number is not an Armstrong number");
//        }
//    }
//}





//to find longest consequent sequence in an array of numbers, wrong code
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int arr[] = new int[n];
//		int l = 0;
//		for(int i=0 ; i<n ; i++) {
//			arr[i] = in.nextInt();
//		}
//		for(int i=0 ; i<n ; i++) {
//			for(int j=0 ; j<n ; j++) {
//				if(arr[i]==(arr[j]+1) || arr[i]==(arr[j]-1)) {
//					l = l+1;
//				}
//				else {
//					continue;
//				}
//			}
//		}
//		System.out.println(l);
//		
//	}
//}



//package Welcome;
//import java.util.Scanner;
//public class Program {
//	public static void main (String[] args) {
//		Scanner in = new Scanner(System.in);
//		String A = in.nextLine();
//		String S[] = A.split(" ");
//		int n = S.length;
//		for(int i=0 ; i<n ; i++) {
//			for(int j=0 ; j<n ; j++) {
//				
//			}
//		}
//	}
//}
//


//simple sieve
//package Welcome;
//public class Program {
//	public static void simplesieve(int limit) {
//		boolean[] prime = new boolean[limit+1];
//		for(int i=2; i<=limit; i++) {
//			prime[i] = true;
//		}
//		for(int p=2; p<=limit; p++) {
//			if (prime[p]==true){
//				for(int i=p*p; i<=limit; i+=p) {
//					prime[i]=false;
//				}
//			}
//		}
//		for(int p=2; p<=limit; p++) {
//			if (prime[p]==true) {
//				System.out.print(p+" ");
//			}
//		}	
//	}
//	public static void main (String[] args) {
//		simplesieve(50);
//	}
//}



//segmented incremental sieve
//package Welcome;
//public class Program {
//	public static void segsieve(int l, int h) {
//		boolean prime[] = new boolean[h+1];
//		for(int i=2; i*i<=h; i++) {
//			int sm = (l/i)*i;
//			if(sm<l) {
//				sm=sm+i;
//			}
//			for(int j=sm; j<=h; j+=i) {
//				prime[j] = true;
//			}
//		}
//		
//		for(int k=l; k<=h; k++) {
//			if(prime[k]==false) {
//			System.out.println(k );
//			}
//		}
//	}
//	public static void main(String[] args) {
//		segsieve(10,30);
//	}
//}



//euler's phi 
//package Welcome;
//public class Program {
//	public static int eulerphi(int n) {
//		int result = n;
//		for(int p=2; p*p<=n; p++) {
//			if(n%p==0) {
//				while(n%p==0) {
//					n/=p;
//				}
//				result-=result/p;
//			}
//		}
//		if(n>1) {
//			result-=result/n;
//		}
//		return result;
//	}
//	public static void main(String[] args) {
//		int num = 12;
//		System.out.println("no. of coprime: " + eulerphi(num));
//	}
//}



//strobogrammatic number
//package Welcome;
//import java.util.Scanner;
//import java.util.HashMap;
//import java.util.Map;
//public class Program {
//	static boolean strobogrammatic (String num) {
//		Map<Character,Character> map = new HashMap<Character,Character>();
//		map.put('6','9');
//		map.put('9','6');
//		map.put('0','0');
//		map.put('1','1');
//		map.put('8','8');
//		int l=0, r=num.length()-1;
//		while(l<r) {
//		if(!map.containsKey(num.charAt(l))) return false;
//		if(map.get(num.charAt(l)) != num.charAt(r)) return false;
//		l++;
//		r--;
//		}
//		return true;
//	}
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter a number: ");
//		String num = in.nextLine();
//		System.out.println(strobogrammatic(num));
//	}
//}



//toggle
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		boolean b[] = new boolean[n+1];
//		int c=0;
//		int o = 0;
//		for(int i=1; i<=n; i++) {
//			for(int j=i; i*j<=n; j++) {
//				if(b[j]==false) {
//					b[j]=true;
//				}
//				else {
//					b[j]=false;
//				}
//			}
//		}
//		for(int i=1; i<=n; i++) {
//			if(b[i]==true) {
//				c++;
//			}
//			else {
//				o++;
//			}
//		}
//		System.out.println("closed doors are: " + c);
//		System.out.println("open doors are: " + o);
//	}
//}




//Alice apple tree
//package Welcome;
//import java.util.*;
//public class Program {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int apple = in.nextInt();
//		int level = 0;
//		int sum =  0;
//		if(sum<apple) {
//			level++;
//			sum += 12*level*level;
//		}
//		System.out.println(8*level);
//	}
//}


//binary palindrome
//package Welcome;
//import java.util.*;
//public class Program {
//	public static boolean palindrome(String s) {
//		int left = 0;
//		int right = s.length()-1;
//		while(left<right) {
//			if(s.charAt(left) != s.charAt(right)) {
//				return false;
//			}
//			left++;
//			right--;
//		}
//		return true;
//	}
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		String s = in.nextLine();
//		if(palindrome(s)) {
//			System.out.println("it is palindrome");
//		}
//		else {
//			System.out.println("it is not palindrome");
//		}			
//	}
//}


//simple sieve
//package Welcome;
//public class Program {
//	public static void simplesieve(int limit) {
//		boolean prime[] = new boolean[limit+1];
//		for(int i=2; i<=limit; i++) {
//			prime[i]=true;
//		}
//		for(int p=2; p*p<=limit; p++) {
//			if(prime[p]==true) {
//				for(int i=p*p; i<=limit; i+=p) {
//					prime[i] = false;
//				}
//			}
//		}
//		for(int p=2; p<=limit; p++) {
//			if (prime[p]=true) {
//				System.out.print(p+" ");
//			}
//		}
//	}
//	public static void main(String[] args) {
//		simplesieve(50);
//	}
//}


//segmented sieve
//package Welcome;
//public class Program {
//	public static void segsieve(int l, int h) {
//		boolean prime[] = new boolean[h+1];
//		for(int i=2; i*i<=h; i++) {
//			int sm = (l/i)*i;
//			if(sm<1) {
//				sm+=i;
//			}
//			for(int j=sm; j<=h; j+=i) {
//				prime[j]=true;
//			}
//		}
//		for(int k=l; k<=h; k++) {
//			if(prime[k]==false) {
//				System.out.print(k+" ");
//			}
//		}
//	}
//	public static void main(String[] args) {
//		segsieve(10,30);
//	}
//}
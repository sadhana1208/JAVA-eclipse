/*package Welcome;
public class datatypes {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 float x = 1.2345f;
		 System.out.println("x value  is" + x);
	}

}*/


/*package Welcome;
public class datatypes {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 float x = 1.2345f;
		 System.out.print("x value  is" + x);
		 System.out.print("x value  is" + x);
	}

}*/


/*package Welcome;
public class datatypes {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 float x = 1.2345f;
		 System.out.printf("x value is %.2f " , x);
		 
	}

}*/


/*package Welcome;
public class datatypes {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 float x = 1.2345f;
		 System.out.printf("x value is %f " , x);
		 
	}

}*/


/*package Welcome;
public class datatypes {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 int a =3;
		 int b =4;
		 System.out.println(""+a+b);
		 System.out.println(a+b);
		 System.out.println("3"+"4");
		 System.out.println(3+4+a+" "+b+a);
		 System.out.println("result: "+(a+b));
		 System.out.println("result: "+a+b);


		 
	}

}*/


/*package Welcome;
public class datatypes {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 char a=65;
		 char b='A';
		 System.out.println(a);
		 System.out.println(b);

		 
	}

}*/


//the below program takes input in the console and prints it as it is
/*package Welcome;
import java.util.Scanner;
public class Program {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String hello = scanner.nextLine();
		System.out.println(hello);
	}
}*/



//the below program calculates the bill and if it is more that 5000 gives discount of 10 percent
/*package Welcome;
import java.util.Scanner;
public class datatypes {

	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter prices");
		float price = scanner.nextFloat();
		System.out.println("enter quantity");
		int quantity = scanner.nextInt();
		double bill = price*quantity;
		double netbill = 0;
		double discount = 0;
		if(bill>=5000) {
			discount = 0.1*bill;
			netbill = bill - discount;
			System.out.println("discount=" + discount);
			System.out.println("final bill=" + netbill);
		}
		else {
			System.out.println("discount=" + discount);
			System.out.println("final bill=" + bill);
			
		}
			
	}

}*/


//the below code to calculate electric bill
/*package Welcome;
import java.util.Scanner;
public class datatypes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter units");
		int units = in.nextInt();
		double bill = 0;
		if(units<=100) {
			bill=200;
			System.out.println("the electric bill is" + bill);
		}
			
		else if(units>100 && units<=150) {
			bill=200 + (units-100)*0.6;
			System.out.println("the electric bill is" +bill);
		}
			
		else if(units>150 && units<=200) {
			bill=200 + 50*0.6 + (units-150)*1.2;
			System.out.println("the electric bill is" +bill);
		}
		else {
			bill=200 + 50*0.6 + 50*1.2 + (units-200)*2.4;
			System.out.println("the electric bill is" +bill);	
		}		
	}
}*/



//switch case
/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 int i = 9;
		 switch (i)
		 {
		 case 0 :
			 System.out.println("i is zero");
			 break;
		 case 1 :
			 System.out.println("i is one");
			 break;
		 case 2 :
			 System.out.println("i is two");
			 break;
		 default:
			System.out.println("i is greater than two");
		 }
		 
	}

}*/


//package Welcome;
//public class datatypes {
//	public static void main(String[] args) {
//		 // TODO Auto-generated method stub
//		 int x=10;
//		 if(true) {
//			 System.out.println("HELLO");
//		 System.out.println("WELCOME");
//			 
//		 }
//		 else
//		 {
//			 System.out.println("BYE");
//		 }		 
//	}
//}



//the below code gives error
/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		 // TODO Auto-generated method stub
		 int x=10;
		 if(x) {
			 System.out.println("HELLO");
		 }
		 else {
			 System.out.println("BYE");
		 }
			 
	}

}*/



//the below code is to calculate grade of the student
/*package Welcome;
import java.util.Scanner;
public class datatypes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter mark1");
		int mark1 = in.nextInt();
		System.out.println("enter mark2");
		int mark2 = in.nextInt();
		System.out.println("enter mark3");
		int mark3 = in.nextInt();
		System.out.println("enter mark4");
		int mark4 = in.nextInt();
		System.out.println("enter mark5");
		int mark5 = in.nextInt();
		double average = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
		if (average>=90 && average<=100) {
			System.out.println("the grade is S");
		}
		else if(average>=80 && average<=89) {
			System.out.println("the grade is A");
		}
		else if(average>=70 && average<=79) {
			System.out.println("the grade is B");
		}
		else if(average>=60 && average<=69) {
			System.out.println("the grade is C");
		}
		else if(average>=55 && average<=59) {
			System.out.println("the grade is D");
		}
		else if(average>=50 && average<=54) {
			System.out.println("the grade is E");
		}
		else {
			System.out.println("the grade is F");
		}
	}
}*/




//the below code is to calculate the grade and print the remarks using switch case
/*package Welcome;
import java.util.Scanner;
public class datatypes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter mark1");
		int mark1 = in.nextInt();
		System.out.println("enter mark2");
		int mark2 = in.nextInt();
		System.out.println("enter mark3");
		int mark3 = in.nextInt();
		System.out.println("enter mark4");
		int mark4 = in.nextInt();
		System.out.println("enter mark5");
		int mark5 = in.nextInt();
		double average = (mark1 + mark2 + mark3 + mark4 + mark5)/5;
		char grade = 0;
		if (average>=90 && average<=100) {
			System.out.println("the grade is S");
		    grade = 'S';
		}
		else if(average>=80 && average<=89) {
			System.out.println("the grade is A");
			grade = 'A';
		}
		else if(average>=70 && average<=79) {
			System.out.println("the grade is B");
			grade = 'B';
		}
		else if(average>=60 && average<=69) {
			System.out.println("the grade is C");
			grade = 'C';
		}
		else if(average>=55 && average<=59) {
			System.out.println("the grade is D");
			grade = 'D';
		}
		else if(average>=50 && average<=54) {
			System.out.println("the grade is E");
			grade = 'E';
		}
		else {
			System.out.println("the grade is F");
			grade = 'F';
		}
		switch(grade) {
		case 'S':
			System.out.println("excellent");
			break;
		case 'A':
			System.out.println("very good");
			break;
		case 'B':
			System.out.println("good");
			break;
		case 'C':
			System.out.println("average");
			break;
		case 'D':
			System.out.println("can improve");
			break;
		case 'E':
			System.out.println("need improvement");
			break;
		case 'F':
			System.out.println("fail");
			break;
		}
	}
}*/




/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		int a = 10;
		int b = -10;
		boolean c = true;
	    boolean d = false;
	    System.out.println(~a);
	    System.out.println(~b);
	    System.out.println(!c);
	    System.out.println(!d);
	}
}*/




/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		int x = 10;
		System.out.println(x++);
		System.out.println(++x);
		System.out.println(x--);
		System.out.println(--x);
	}
}*/




/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
		System.out.println(a<<3);
		System.out.println(a>>2);
		System.out.println(a>>>2);
	}
}*/




//ternary operator
/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		int a = 2;
		int b = 5;
		int min=(a<b)?a:b;
		System.out.println(min);
	}
}*/




//instanceof operator
//this operator checks whether the object belongs to particular class
/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		String name = "James";
		boolean result = name instanceof String;
		System.out.println(result);				
	}
}*/




/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		String s1="face";
		String s2="face";
		System.out.println(s1==s2);
		System.out.println("s1==s2 is:" + s1 == s2);
		//the above statement results into comparision of s1==s2 is face == face		
	}
}*/




/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		System.out.println(10+20+"face");
		System.out.println("face"+10+20);
	}
}*/




//write the program demonstrate the concept of logical operators to find the year entered is a leap year
/*package Welcome;
import java.util.Scanner;
public class datatypes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the year");
		int year = in.nextInt();
		if (year%100==0 && year%400==0) {
			System.out.println("the given year is a leap year and it is a century year");
		}
		else if(year%100==0 && year%400 != 0) {
			System.out.println("the given year is not a leap year");
		}
		else if(year%100 !=0 && year%400==0) {
			System.out.println("the given year is not leap year");
		}
		else if (year%4==0) {
			System.out.println("the given year is a leap year and it is a non century year");			
		}
		else {
			System.out.println("the given year is not a leap year");
		}
				
	}
}*/


//arithmetic operator to perform basic operations by getting input from user for both value and the operator using switch case


//the below code is to display the perimeter of triangle if sum of all possible two sides is greater than third side 
/*package Welcome;
import java.util.Scanner;
public class datatypes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the first edge A");
		int A = in.nextInt();
		System.out.println("enter the second edge B");
		int B = in.nextInt();
		System.out.println("enter the third edge C");
		int C = in.nextInt();
		double peri = A+B+C;		
		if (A+B>C && B+C>A && C+A>B) {
			System.out.println("the perimeter is" + peri);			
		}
		else {
			System.out.println("the case is not valid");
		}		
	}
}*/




//the below code is to print the shipping cost of the package 
/*package Welcome;
import java.util.Scanner;
public class datatypes{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the weight of the package");
		int w = in.nextInt();
		if (w>0 && w<=2) {
			System.out.println("the cost is 2.5 dollars");
		}
		else if (w>2 && w<=4) {
			System.out.println("the cost is 4.5 dollars");
		}
		else if (w>4 && w<=10) {
			System.out.println("the cost is 7.5 dollars");
		}
		else if (w>10 && w<=20) {
			System.out.println("the cost is 10.5 dollars");
		}
		else {
			System.out.println("the package cannot be shipped");
		}	
		
		
	}
}*/




//LOOPS
//to print hlo world 5 times
/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		for(int i=0 ;  i<5 ; i++) {
			System.out.println("hlo world");
		}
	}
}*/


/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		for(int i=1 ;  i<=5 ; i++) {
			System.out.println(i + "." + "hlo world");
		}
	}
}*/




//the below code is to find sum of N natural numbers
/*package Welcome;
import java.util.Scanner;
public class datatypes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter N");
		int N = in.nextInt();
		double sum = 0;
		for(int i=1 ;  i<=N ; i++) {
			sum+=i;
		}
		System.out.println(sum);
	}
}*/




//to print hlo world 10 times
/*package Welcome;
public class datatypes {
	public static void main(String[] args) {
		int i = 1;
		while(i<=10 ) {
			System.out.println("hlo world");
			i++;
		}
	}
}*/




//sum of 10 natural numbers using while loop
/*package Welcome;
public class datatype {
	public static void main(String[] args) {
		int N = 10;
		int sum = 0;
		int i = 1;
		while(i<=N) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
	}
}*/




//debug, not working for all N
//product of N natural numbers using while loop
/*package Welcome;
import java.util.Scanner;
public class datatype {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter N");
		int N = in.nextInt();
		double fact = 1;
		int i = 1;
		while(i<=N) {
			fact=fact*i;
			i++;
		}
		System.out.println(fact);
	}
}*/




//the below code is calculate the balance amount considering deposits and withdraws
/*package Welcome;
import java.util.Scanner;
public class datatype {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the balance money in the account M:");
		int M = in.nextInt();
		System.out.println("enter the money deposited D:");
		int D = in.nextInt();
		System.out.println("enter the money withdrawn W:");
		int W = in.nextInt();
		double total = M+D-W;
		System.out.println("the total money in the account is:" + total);
	}
}*/




//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		 int x = 21;
//		 do {
//			 System.out.println("value of x :" + x);
//			 x++;
//		 }while(x<20);
//	}
//}




//the below code is to print the table of kilogram and corresponding pounds
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		 int i = 1;
//		 System.out.println("kilogram "  + "   pound " ); 
//		 while(i<=199) {
//			System.out.printf(i + "            " + "%2.3f\n", 2.2*i); 
//			i+=2;
//		 }
//	}
//}




//the below code is to print the multiplication table of the positive integer given by the user
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the positive integer N:");
//		int N = in.nextInt();
//		int i = 1;
//		while(i<=10) {
//			System.out.println(N + "*" + i + "=" + N*i);
//			i++;
//		}
//		 
//	}
//}




//pat model question - pattern of symbols
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		for(int i=1 ; i<=5 ; i++) {
//			for(int j=1 ; j<=i ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();	        
//		}
//		 
//	}
//}




//pat model question - pattern of symbols
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		for(int i=1 ; i<=5 ; i++) {
//			for(int j=i ; j<=5 ; j++) {
//				System.out.print("*");
//			}
//			System.out.println();	        
//		}
//		 
//	}
//}




//not completed
//code to check whether string input is palindrome or not using looping statement 
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the string:");
//	    char string = in.nextLine();
//	    
//	    
//	}
//}




//the below code is to print pattern of symbols 
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		for(int i=1 ; i<=5 ; i++) {
//			for(int j=1 ; j<i ; j++) {				
//				System.out.print(" ");
//			}
//			for(int k=i ; k<=5 ; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}		 
//	}
//}




//the below is to print pattern of symbols
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		for(int i=1 ; i<=5 ; i++) {
//			for(int j=4 ; j>=i ; j--) {				
//				System.out.print(" ");
//			}
//			for(int k=i ; k>0 ; k--) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}		 
//	}
//}




//the below is to print pattern of symbols
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		for(int i=1 ; i<=7 ; i++) {
//			for(int j=6 ; j>=i ; j--) {				
//				System.out.print(" ");
//			}
//			for(int k=i ; k>0 ; k--) {
//				System.out.print("*");
//			}
//			for(int l=2 ; l<=i ; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}		 
//	}
//}





//the below code is to print the pattern of numbers
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		for(int i=1 ; i<=7 ; i++) {
//			for(int j=6 ; j>=i ; j--) {				
//				System.out.print(" ");
//			}
//			for(int k=i ; k>0 ; k--) {
//				System.out.print(k);
//			}
//			for(int l=2 ; l<=i ; l++) {
//				System.out.print(l);
//			}
//			System.out.println();
//		}		 
//	}
//}





//code to print pattern of symbols in shape of rhombus
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		for(int i=1 ; i<5 ; i++) {
//			for(int j=4 ; j>i ; j--) {
//				System.out.print(" ");
//			}
//			for(int k=i ; k>0 ; k--) {
//				System.out.print("*");
//			}
//			for(int l=2 ; l<=i ; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//		for(int i=1 ; i<4 ; i++) {
//			for(int j=i ; j>0 ; j--) {
//				System.out.print(" ");
//			}
//			for(int k=4 ; k>i ; k--) {
//				System.out.print("*");
//			}
//			for(int l=i ; l<=2 ; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//	}
//}




//to print pattern of symbols to print in form of sand clock
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		
//		for(int i=1 ; i<4 ; i++) {
//			for(int j=i ; j>0 ; j--) {
//				System.out.print(" ");
//			}
//			for(int k=4 ; k>i ; k--) {
//				System.out.print("*");
//			}
//			for(int l=i ; l<=2 ; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		for(int i=1 ; i<5 ; i++) {
//			for(int j=4 ; j>i ; j--) {
//				System.out.print(" ");
//			}
//			for(int k=i ; k>0 ; k--) {
//				System.out.print("*");
//			}
//			for(int l=2 ; l<=i ; l++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			
//		}
//	}
//}



//ARRAYS
//to print the data stored in the array
//package Welcome;
//import java.util.*;
//public class datatype{
//	public static void main(String[] args) {
//		int[] arr = {12,4,5,2,5};
//		for (int i=0 ; i<arr.length ; i++) {
//			System.out.print(arr[i] + " ");
//		}				
//	}
//}




//package Welcome;
//import java.util.Scanner;
//public class datatype{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		double[] myList = new double[5];
//		//for loop to get input from the user and store data in array
//		for(int i=0 ; i<myList.length ; i++) {
//			myList[i] = in.nextDouble();
//		}
//		//for loop to print the data stored in the array
//		for(int i = 0 ; i<myList.length ; i++) {
//			System.out.print(myList[i] + " ");
//		}
//	}
//}




//code to print matrix
//package Welcome;
//public class datatype{
//	public static void main(String[] args) {
//		int arr[][]= {{1,2,3},{2,4,5},{4,4,5}};
//		for(int i=0 ; i<3 ; i++) {
//			for(int j=0 ; j<3 ; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}		
//	}
//}




//code to get input of array size and the elements to be stored in the array, and to search the element if present in array or not
//package Welcome;
//import java.util.Scanner;
//public class datatype{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter array size");
//		int arr_size = in.nextInt();
//		//storing the input in form of array named arr
//		int arr[] = new int[arr_size];
//		//for loop to get input from user 
//		for(int i=0 ; i<arr_size ; i++) {
//			arr[i] = in.nextInt();
//		}
//		//for loop to print the data in array 
//		for(int i=0 ; i<arr_size ; i++) {
//			System.out.println(arr[i] +" ");
//		}
//		System.out.println("enter the search element");
//		int search_element = in.nextInt();
//		boolean f = false;
//		for(int i = 0 ; i<arr.length ; i++) {
//			if(search_element==arr[i]) {
//				f=true;
//			}
//			
//		}
//		if(f) {
//			System.out.println("element found");
//		}
//		else {
//			System.out.println("element not found");
//		}
//	}
//}




//to store data in array and print the array and to count the number of occurence of the given search element 
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner (System.in);
//		System.out.println("enter the array size:");
//		int arr_size = in.nextInt();
//		int arr[] = new int[arr_size];
//		for(int i=0 ; i<arr.length ; i++) {
//			arr[i] = in.nextInt();
//		} 
//		for(int i=0 ; i<arr_size ; i++) {
//			System.out.println(arr[i] +" ");
//		}
//		System.out.println("enter the search element");
//		int search_element = in.nextInt();
//		int count = 0;
//		for(int i = 0 ; i<arr.length ; i++) {
//			if(search_element==arr[i]) {
//				count+=1;
//			}			
//		}
//		System.out.println("the occurence of element is:" + count);
//				
//	}
//}




//addition of two matrix
//package Welcome;
//import java.util.Scanner;
//public class datatype{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int[][] A = new int[2][2];
//		int[][] B = new int[2][2];
//		//store value in A matrix
//		for (int i=0 ; i<2 ; i++) {
//			for(int j=0 ; j<2 ; j++) {
//				A[i][j]=in.nextInt();
//			}
//			System.out.println();
//		}
//		//store value in B matrix
//		for (int i=0 ; i<2 ; i++) {
//			for(int j=0 ; j<2 ; j++) {
//				B[i][j]=in.nextInt();
//			}
//			System.out.println();
//		}
//		//to add A and B and store in C
//		int[][] C = new int[2][2];
//		for (int i=0 ; i<2 ; i++) {
//			for(int j=0 ; j<2 ; j++) {
//				C[i][j] = A[i][j] +B[i][j];
//			}
//			System.out.println();
//		}
//		//to print C matrix
//		for (int i=0 ; i<2 ; i++) {
//			for(int j=0 ; j<2 ; j++) {
//				System.out.print(C[i][j] + " ");
//			}
//			System.out.println();
//			
//		}		
//	}
//}




//to add diagonal elements of a matrix
//package Welcome;
//import java.util.Scanner;
//public class datatype{
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int[][] A = new int[2][2];
//		//store value in A matrix
//		for (int i=0 ; i<2 ; i++) {
//			for(int j=0 ; j<2 ; j++) {
//				A[i][j]=in.nextInt();
//			}
//		}
//		int sum = 0;
//		for(int i=0 ; i<2 ; i++) {
//			for(int j=0 ; j<2 ; j++) {
//				if(i==j) {
//					sum+=A[i][j];					
//				}
//			}
//		}
//		System.out.println(sum);
//		
//	}
//}




//to find GCD of two numbers
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter first number a: ");
//		int a = in.nextInt();
//		System.out.println("enter second number b: ");
//		int b = in.nextInt();
//		int g=1;
//		for(int i=1 ; i<=a && i<=b ; i++) {
//			if(a%i==0 && b%i==0) {
//				g=i;
//			}
//		}
//		System.out.println("GCD is: " + g);
//		
//	}
//}




//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter first number a: ");
//		int a = in.nextInt();
//		System.out.println("enter second number b: ");
//		int b = in.nextInt();
//		System.out.println("enter third number c: ");
//		int c = in.nextInt();
//		int g=1;
//		for(int i=1 ; i<=a && i<=b ; i++) {
//			if(a%i==0 && b%i==0) {
//				g=i;
//			}
//		}
//		System.out.println("GCD is: " + g);
//		
//		int g1=1;
//		for(int i=1 ; i<=b && i<=c ; i++) {
//			if(b%i==0 && c%i==0) {
//				g1=i;
//			}
//		}
//		System.out.println("GCD is: " + g1);
//		
//	}
//}




//METHODS
//to find gcd using methods
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		int g = gcd (15,30);
//		int g1 = gcd (30,40);
//		System.out.println(g);
//		System.out.println(g1);		
//	}
//	public static int gcd (int x , int y) {
//		int gc=1;
//		for(int i=1 ; i<=x && i<=y ; i++) {
//			if(x%i==0 && y%i==0) {
//				gc=i;			
//			}
//		}
//		return gc;			
//	}
//}





//to find the average temperature of 7 days and how many days above average temperature
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("How many day temperatures: ");
//		int x = in.nextInt();
//		System.out.println("Day 1 high temperature: ");
//		int a = in.nextInt();
//		System.out.println("Day 2 high temperature: ");
//		int b = in.nextInt();
//		System.out.println("Day 3 high temperature: ");
//		int c = in.nextInt();
//		System.out.println("Day 4 high temperature: ");
//		int d = in.nextInt();
//		System.out.println("Day 5 high temperature: ");
//		int e = in.nextInt();
//		System.out.println("Day 6 high temperature: ");
//		int f = in.nextInt();
//		System.out.println("Day 7 high temperature: ");
//		int g = in.nextInt();
//		
//	    float average = avg(x,a,b,c,d,e,f,g);
//		System.out.println("Average temp is: " + average);
//		
//		int p = 0;
//		if(a>average) {
//			p+=1;
//		}
//	    if(b>average) {
//			p+=1;
//		}
//		if(c>average) {
//			p+=1;
//		}
//		if(d>average) {
//			p+=1;
//		}
//		if(e>average) {
//			p+=1;
//		}
//		if(f>average) {
//			p+=1;
//		}
//		if(g>average) {
//			p+=1;
//		}
//		System.out.println(p);
//		
//	}
//	public static float avg(int x, int l,int m,int n,int o,int p,int q,int r) {
//		float z = (l+m+n+o+p+q+r)/x;
//		return z;
//	}
//}




//methods
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		int arr[] = {10,20,30,40};
//		int a = 50;
//		call(a,arr);
//		System.out.println(a); //prints 50 not 52 because in method there is no return type
//		System.out.println(arr[0]); //prints 100 not 10 because in method we dont pass the value, we share address of the array
//									//as parameters in method, it goes to that address and changes the value of given index
//		System.out.println(arr[1]);
//		
//	}
//	public static void call(int a , int arr[]) {
//		a=a+2;
//		arr[0]=100;
//		arr[1]=200;
//	}
//}





//to add 2 matrix using methods
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter row size: ");
//		int row = in.nextInt(); 
//		System.out.println("enter coloumn size: ");
//		int col = in.nextInt(); 
//		int[][] m = getArray(row , col);
//		int[][] n = getArray(row , col);
//		int[][] C = sum(m,n);
//		System.out.println("the addition matrix is:");
//		printMatrix(C);
//	}
//	public static int[][] getArray(int a,int b){
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the matrix");
//		int[][] A = new int[a][b];
//		for (int i=0 ; i<a ; i++) {
//			for(int j=0 ; j<b ; j++) {
//				A[i][j]=in.nextInt();
//		    }
//			System.out.println();
//	    }
//	    return A;
//	}
//	public static int[][] sum(int m[][], int n[][]){
//		int[][] C = new int[m.length][n[0].length];
//		for (int i=0 ; i<m.length ; i++) {
//			for(int j=0 ; j<n[0].length ; j++) {
//				C[i][j] = m[i][j] +n[i][j];
//			}
//			System.out.println();
//		}
//		return C;		
//	}
//	public static void printMatrix(int[][] C) {
//		for (int i=0 ; i<C.length; i++) {
//			for(int j=0 ; j<C[0].length ; j++) {
//				System.out.print(C[i][j] + " ");
//			}
//			System.out.println();			
//		}		
//	}	
//}




//STRINGS
//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		String s1 = "Welcome to Java";
//		String s2 = "Programming is fun";
//		String s3 = "Welcome to Java";
//		System.out.println(s1.indexOf('J'));
//		System.out.println(s1.indexOf("to"));
//		System.out.println(s1.lastIndexOf("o" , 15));
//		System.out.println(s1.compareTo(s2));
//		System.out.println(s1.substring(5,11));
//		System.out.println("\t Wel \t".trim());
//		System.out.println(s1.concat(s2));
//		System.out.println(s1.contains(s2));
//		System.out.println(s1.charAt(1));
//		
//	}
//}




//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		String str = "Thexyzwebsitexyzisxyzsoftwaretestingxyzhelp";
//		String [] split = str.split("x");
//		for(String obj: split) {
//			System.out.println(obj);
//		}
//	}
//}



//to check if the input string matches the string "Dhoni"
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the string");
//		String s = in.nextLine();
//		String a = "Dhoni";
//		if(s.equals(a)) {
//			System.out.println("Matching");
//		}
//		else {
//			System.out.println("Not Matching");
//		}
//	    
//	}
//}




//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		String s = "Apple";
//		String r = null;
//		System.out.println(s + r);
//		System.out.println(s.concat(r));
//		
//	    
//	}
//}



//package Welcome;
//public class datatype {
//	public static void main(String[] args) {
//		String s = "Apple";
//		int r = 10;
//		System.out.println(s + r);
//		System.out.println(s.concat(r));
//		
//	    
//	}
//}




//to get 2 input strings and perform some methods
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter string 1: ");
//		String a = in.nextLine();
//		System.out.println("enter string 2: ");
//		String b = in.nextLine();
//		System.out.println(a.length() + " " + b.length());
//		System.out.println(a.concat(" " + b));
//		System.out.println(a.toUpperCase());		
//	}
//}


 

//to get a string input and remove all the vowels in it and print the rest
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter a string: ");
//		String x = in.nextLine();
//	    String s = x.replaceAll("[aeiouAEIOU]" , "");
//	    System.out.println(s);		
//	} 
//}




//to count no. of vowels and consonants in the given string
//package Welcome;
//import java.util.Scanner;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner in = new Scanner(System.in);
//		System.out.println("enter the string: ");
//		String s = in.nextLine();
//		String s1 = s.toUpperCase();
//		int vowels = 0;
//		int consonants = 0;
//		for(int i =0 ; i<s1.length(); i++) {
//			if(s1.charAt(i)=='A' || s1.charAt(i)=='E' || s1.charAt(i)=='I' || s1.charAt(i)=='O' || s1.charAt(i)=='U') {
//				vowels++;
//			}
//			else if(s1.charAt(i)==' ' || s1.charAt(i)==':') {
//				continue;
//			}
//			else {
//				consonants++;
//			}			
//		}
//		System.out.println("vowels: " + vowels);
//		System.out.println("consonants: " + consonants);	
//	}
//}




//constructors
//package Welcome;
//public class datatype {
//	int x=5;
//	public static void main(String[] args) {
//		datatypes myObj = new datatypes();
//		datatypes myObj1 = new datatypes();
//		System.out.println(myObj.x);
//	}
//}




//random class pair of dies is rolled, the sum of numbers should be 7 
//package Welcome;
//import java.util.*;
//public class datatype {
//	public static void main(String[] args) {
//		Random in = new Random();
//		int tries =0;
//		int sum = 0;
//		while(sum!=7) {
//			int r1 = in.nextInt(6)+1;
//			int r2 = in.nextInt(6)+1;
//			sum = r1+r2;
//			System.out.println(r1+"+"+r2+"="+sum);
//			tries++;
//		}
//		System.out.println("you won after " + tries + " tries");
//		
//	}
//}




//stimulate tossing a coin 100 times and print no. of times heads and tails
//package Welcome;
//import java.util.*;
//public class datatype {
//	public static void main(String[] args) {
//		Random in = new Random();
//		int head = 0;
//		int tail = 0;
//		for(int i=0 ; i<100 ; i++) {
//			int r = in.nextInt(2);
//			if (r==0) {
//				head++;
//			}
//			else if(r==1) {
//				tail++;
//			}
//		}
//		System.out.println("no. of heads is: " + head);
//		System.out.println("no. of tails is: " + tail);		
//	}
//}





//calculate angles of triangle
//package Welcome;
//import java.util.Scanner;
//import java.lang.Math;
//public class datatype {
//	public static void main(String[] args) {
//		Scanner at = new Scanner(System.in);
//		System.out.println("Enter x and y coordinates of triangle:");
//		double x1 = at.nextDouble();
//		double y1 = at.nextDouble();
//		double x2 = at.nextDouble();
//		double y2 = at.nextDouble();
//		double x3 = at.nextDouble();
//		double y3 = at.nextDouble();
//		System.out.println("Invoke calAngles() method.");
//		double[] Angle = calAngles(x1,x2,x3,y1,y2,y3);	
//		System.out.println("Print the angles of triangle.");
//		System.out.println("The three angle are " + Math.round(Angle[0]) + " " + Math.round(Angle[1]) + " " + Math.round(Angle[2]));
//		//System.out.println(Angle);
//		
//	}
//	public static double[] calAngles(double a1, double a2, double a3, double b1, double b2, double b3) {
//		double[] AA = new double[3];
//		
//		double a = Math.sqrt(Math.pow(a3-a2 , 2) + Math.pow(b3-b2 , 2));
//		double b = Math.sqrt(Math.pow(a1-a3 , 2) + Math.pow(b1-b3 , 2));
//		double c = Math.sqrt(Math.pow(a2-a1 , 2) + Math.pow(b2-b1 , 2));
//		
//		double A = Math.toDegrees(Math.acos((a*a-b*b-c*c)/(-2*b*c)));
//		double B = Math.toDegrees(Math.acos((b*b-a*a-c*c)/(-2*a*c)));
//		double C = Math.toDegrees(Math.acos((c*c-b*b-a*a)/(-2*b*a)));
//		
//		AA[0] = A;
//		AA[1] = B;
//		AA[2] = C;
//		
//		return AA;	
//	}
//}




//DATE CLASS
//package Welcome;
//import java.util.Date;
//public class datatype {
//	public static void main(String[] args) {
//		Date d = new Date();
//		System.out.println(d);
//	}
//}




//package Welcome;
//import java.util.Date;
//public class datatype {
//	public static void main(String[] args) {
//		Date d = new Date();
//		System.out.println(d);
//		long millis = System.currentTimeMillis();
//		System.out.println(millis);
//		long millis1 = 100000000L; 
//		Date d1 = new Date(millis);
//		System.out.println(d1);
//		Date d2 = new Date(millis1);
//		System.out.println(d2);		
//	}
//}




//package Welcome;
//import java.util.Date;
//import java.text.*;
//public class datatype {
//	public static void main(String[] args) {
//		Date dNow = new Date();
//		System.out.println(dNow);
//		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
//		System.out.println("current date: " + ft.format(dNow));		
//	}
//}




//package Welcome;
//import java.util.Date;
//import java.text.*;
//public class datatype {
//	public static void main(String[] args) {
//		Date dNow = new Date();
//		System.out.println(dNow);
//		SimpleDateFormat ft = new SimpleDateFormat("EEEE yyyy.MM.dd 'at' hh:mm:ss a z");
//		System.out.println("current date: " + ft.format(dNow));	
//	}
//}




//package Welcome;
//import java.util.Date;
//import java.text.*;
//public class datatype {
//	public static void main(String[] args) {
//		Date dNow = new Date();
//		System.out.println(dNow);
//		SimpleDateFormat ft = new SimpleDateFormat("EEEE yyyy.MM.dd 'at' hh:mm:ss a zzzz");
//		System.out.println("current date: " + ft.format(dNow));	
//	}
//}




//package Welcome;
//import java.util.Date;
//public class datatype {
//	public static void main(String[] args) {
//		Date d = new Date();
//		String str = String.format("current date/time: %tc" , d);
//		System.out.printf(str);	
//		System.out.println();
//		String str1 = String.format("current date/time: %tF" , d);
//		System.out.printf(str1);		
//	}
//}




//package Welcome;
//import java.util.Calendar;
//import java.util.Date;
//import java.util.GregorianCalendar;
//public class datatype {
//	public static void main(String[] args) {
//		Calendar cal = new GregorianCalendar();
//		cal.set(Calendar.YEAR,2009);
//		cal.set(Calendar.MONTH,11);
//		cal.set(Calendar.DAY_OF_MONTH,31);
//		cal.add(Calendar.DAY_OF_MONTH,1);
//		int getyear = cal.get(Calendar.YEAR);
//		int getday = cal.get(Calendar.DAY_OF_MONTH);
//		System.out.println(getyear);
//		System.out.println(getday);		
//	}
//}




//inheritance
//package Welcome;
//
//import java.util.*;
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
//public class datatype {
//	public static void main(String args[]) {
//		animal2 obj = new animal2();
//		obj.nextking();
//		obj.king();
//	}	
//}



//package Welcome;
//import java.util.*;
//class fruits {
//	void taste() {
//		System.out.println("sweet");
//	}
//	void colour() {
//		System.out.println("yellow in colour");
//	}
//	void shape() {
//		System.out.println("round");
//	}
//	
//}
//class mango extends fruits {
//	void season() {
//		System.out.println("summer");
//	}
//	
//}
//public class datatype {
//	public static void main(String[] args) {
//		mango obj = new mango();
//		obj.season();
//		obj.taste();
//		obj.colour();
//		obj.shape();		
//	}
//}




//package Welcome;
//import java.util.*;
//class fruits {
//	void taste() {
//		System.out.println("sweet");
//	}
//	void colour() {
//		System.out.println("yellow in colour");
//	}
//	void shape() {
//		System.out.println("round");
//	}
//	
//}
//public class datatype extends fruits {
//	void season() {
//		System.out.println("summer");
//	}
//	public static void main(String[] args) {
//		datatype obj = new datatype();
//		obj.season();
//		obj.taste();
//		obj.colour();
//		obj.shape();		
//	}
//	
//}




//package Welcome;
//import java.util.*;
//class fruits {
//	void taste(String s1) {
//		System.out.println(s1);
//	}
//	void colour() {
//		System.out.println("yellow in colour");
//	}
//	void shape() {
//		System.out.println("round");
//	}
//	
//}
//public class datatype extends fruits {
//	void season() {
//		System.out.println("summer");
//	}
//	public static void main(String[] args) {
//		datatype obj = new datatype();
//		obj.season();
//		obj.taste("sweet");
//		obj.colour();
//		obj.shape();		
//	}
//	
//}




//MULTI LEVEL INHERITANCE
//package Welcome;
//import java.util.*;
//class car {
//	void vehicalType() {
//		System.out.println("vehicle type: car");
//	}
//	car() {
//		System.out.println("class name: car");
//	}
//}
//class maruti extends car {
//	void brand() {
//		System.out.println("brand name: maruti");
//	}
//	void speed() {
//		System.out.println("maximum speed of maruti is 90kmph");
//	}
//	maruti() {
//		System.out.println("subclass name: maruti");
//	}
//}
//class baleno extends maruti {
//	void speed() {
//		System.out.println("maximum speed of baleno is: 120kmph");
//	}
//	baleno() {
//		System.out.println("model name: baleno");
//	
//	}
//}
//public class datatype{
//	public static void main (String[] args) {
//		baleno obj = new baleno();
//		obj.vehicalType();
//		obj.brand();
//		obj.speed(); //speed of child class will be print not the parent class this is called method overriding
//		
//	}
//}



//static blocks
//package Welcome;
//class datatype{
//	static int a = 23;
//	static int b;
//	static int max;
//	
//	static {
//		System.out.println("first static block");
//		b=a*4;
//	}
//	static {
//		System.out.println("second static block");
//		max=30;
//	}
//	static void display() {
//		System.out.println("a=" + a);
//		System.out.println("b=" + b);
//		System.out.println("max=" + max);
//	}	
//	public static void main(String[] args) {
//			display();
//	}
//}



//abstract class
//package Welcome;
//abstract class shape {
//	abstract void draw ();
//}
//class rectangle extends shape {
//	void draw() {
//		System.out.println("drawing rectangle");
//	}
//}
//class circle1 extends shape {
//	void draw() {
//		System.out.println("drawing circle");
//	}
//}
//class datatype {
//	public static void main(String args[]) {
//		//circle1 s = new circle1();
//		shape s = new circle1(); //upcasting
//		s.draw();
//	}
//}




//handling exceptions
//package Welcome;
//import java.util.*;
//public class datatype {
//	public static void main(String[] args) {
//		try {
//			int data = 50/0;
//		}
//		catch(Exception e) {
//			System.out.println("cant divide by zero");
//		}
//	}
//}




//package Welcome;
//public class datatype{
//	public static void main(String[] args) {
//		int i=50;
//		int j=0;
//		int data;
//		try {
//			data=i/j;
//		}
//		catch(Exception e) {
//			System.out.println(i/(j+2));
//		}
//	}
//	
//}




//shows error
//package Welcome;
//public class datatype{
//	static void validateMarks(int marks) {
//		if (marks < 80) {
//			throw new ArithmeticException("not oracle certified");
//		}
//		else {
//			System.out.println("oracle certified");
//		}
//	}
//	public static void main(String[] args) {
//		validateMarks(78);
//		System.out.println("welcome...");
//	}
//}




//handling the error in the above program
//package Welcome;
//public class datatype{
//	static void validateMarks(int marks) {
//		if (marks < 80) {
//			throw new ArithmeticException("not oracle certified");
//		}
//		else {
//			System.out.println("oracle certified");
//		}
//	}
//	public static void main(String[] args) {
//		try {
//			validateMarks(78);
//		}
//		catch(Exception e) {
//			System.out.println(e);
//			System.out.println("welcome...");			
//		}
//	}
//}





//file handling
//package Welcome;
//import java.io.*; //this has FileOutputStream class
//public class datatype{
//	public static void main(String[] args) throws IOException { //in file handling IOExceotion should be threw
//		try {
//			FileOutputStream fout = new FileOutputStream("D:\\file1.txt"); //create a text file in some location and copy its path and paste it as an arguement and add one more backslash
//            fout.write(65);
//            fout.write(67);
//            System.out.println();
//            String s = "\nWelcome to JAVA";
//            byte b[] = s.getBytes();
//            fout.write(b);
//            fout.close();
//		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} 		
//	}
//}




//to read first byte in the text file
//package Welcome;
//import java.io.*; //this has FileInputStream class
//public class datatype{
//	public static void main(String[] args) throws IOException { //in file handling IOExceotion should be threw
//		try {
//			FileInputStream fout = new FileInputStream("D:\\file1.txt"); //create a text file in some location and copy its path and paste it as an arguement and add one more backslash
//            int i = fout.read();
//            System.out.println((char)i);
//            fout.close();
//		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} 		
//	}
//}




//to read entire content in the text file
//package Welcome;
//import java.io.*; //this has FileInputStream class
//public class datatype{
//	public static void main(String[] args) throws IOException { //in file handling IOExceotion should be threw
//		try {
//			FileInputStream fout = new FileInputStream("D:\\file1.txt"); //create a text file in some location and copy its path and paste it as an arguement and add one more backslash
//            int i;
//            while((i=fout.read()) !=-1) {
//            	System.out.print((char)i);          	
//            }
//            fout.close();
//		} 
//		catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} 		
//	}
//}










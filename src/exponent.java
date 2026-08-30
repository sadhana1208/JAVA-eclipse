//exponent of a number
import java.util.Scanner;
public class exponent {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("enter the base number B:");
		int B = in.nextInt();
		System.out.println("enter the exponent number E:");
		int E = in.nextInt();
		int prod = 1;
		int i = 1;
		while(i<=E) {
			prod*=B;
			i++;
		}
		System.out.println("base to power of exponent is:" + prod);
	}

}

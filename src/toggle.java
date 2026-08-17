import java.util.*;
public class toggle {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		boolean b[] = new boolean[n+1];
		int c=0;
		int o = 0;
		for(int i=1; i<=n; i++) {
			for(int j=i; i*j<=n; j++) {
				if(b[j]==false) {
					b[j]=true;
				}
				else {
					b[j]=false;
				}
			}
		}
		for(int i=1; i<=n; i++) {
			if(b[i]==true) {
				c++;
			}
			else {
				o++;
			}
		}
		System.out.println("closed doors are: " + c);
		System.out.println("open doors are: " + o);
	}
}

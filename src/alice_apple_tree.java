import java.util.*;
public class alice_apple_tree {	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int apple = in.nextInt();
		int level = 0;
		int sum =  0;
		while(sum<apple) {
			level++;
			sum += 12*level*level;
		}
		System.out.println(8*level);
	}
}

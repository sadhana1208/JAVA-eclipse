//to print inverted triangle of stars
public class pattern_of_stars {
	public static void main(String[] args) {
		for(int i=0 ; i<=3 ; i++) {
			for(int j=i ; j>=1 ; j--) {
				System.out.print(" ");
			}
			for(int k=i ; k<4 ; k++) {
				System.out.print("*");
			}
			for(int l=i ; l<3 ; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

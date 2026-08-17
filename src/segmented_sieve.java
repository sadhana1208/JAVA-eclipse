public class segmented_sieve {
	public static void segsieve(int l, int h) {
		boolean prime[] = new boolean[h+1];
		for(int i=2; i*i<=h; i++) {
			int sm = (l/i)*i;
			if(sm<l) {
				sm=sm+i;
			}
			for(int j=sm; j<=h; j+=i) {
				prime[j] = true;
			}
		}
		
		for(int k=l; k<=h; k++) {
			if(prime[k]==false) {
			System.out.println(k );
			}
		}
	}
	public static void main(String[] args) {
		segsieve(10,30);
	}
}

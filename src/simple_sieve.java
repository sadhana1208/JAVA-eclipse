public class simple_sieve {
	public static void simplesieve(int limit) {
		boolean[] prime = new boolean[limit+1];
		for(int i=2; i<=limit; i++) {
			prime[i] = true;
		}
		for(int p=2; p<=limit; p++) {
			if (prime[p]==true){
				for(int i=p*p; i<=limit; i+=p) {
					prime[i]=false;
				}
			}
		}
		for(int p=2; p<=limit; p++) {
			if (prime[p]==true) {
				System.out.print(p+" ");
			}
		}	
	}
	public static void main (String[] args) {
		simplesieve(50);
	}
}

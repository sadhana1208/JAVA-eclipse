//example input L1=[1,7,5] L2=[6,7,1,2] where 571+2176=2747 output=[7,4,7,2]
import java.util.*;
public class add_2_lists {
	 public static int[] rev(int[] L){
	        int left = 0;
	        int right = L.length - 1;
	        while(left<right){
	            int x = L[left];
	            L[left] = L[right];
	            L[right] = x;
	            left++;
	            right--;
	        }
	        return L;
	    }
	    public static int number(int[] N){
	        int result = 0;
	        for(int n:N){
	            result = (result*10)+n;
	        }
	        return result;
	    }
	    public static int[] array(int num){
	    	int len = String.valueOf(num).length();
	        int[] a = new int[len];
	        for(int i=0; i<len; i++){
	            a[i] = num % 10;
	            num = num/10;
	        }
	        return a;
	    } 
	    public static void main (String[] args) {
	        Scanner in = new Scanner(System.in);
	        System.out.println("enter size of list1");
	        int s1 = in.nextInt();
	        System.out.println("enter size of list2");
	        int s2 = in.nextInt();
	        int[] L1 = new int[s1];
	        int[] L2 = new int[s2];
	        System.out.println("enter elements of list1");
	        for(int i=0; i<L1.length; i++){
	            L1[i] = in.nextInt();
	        }
	        System.out.println("enter elements of list23");
	        for(int j=0; j<L2.length; j++){
	            L2[j] = in.nextInt();
	        }
	        rev(L1);
	        int N1 = number(L1);
	        rev(L2);
	        int N2 = number(L2);
	        int sum = N1+N2;
	        int[] out = array(sum);
	        List<Integer> listOut = new ArrayList<>();
	        for(int i:out) {
	        	listOut.add(i);
	        }
	       System.out.println(listOut);
	    }
}

package basic;

public class Prime {
 public static void main(String[] args) {
	int div=2;
	int n=2;
	boolean flag=true;
	while(div<n) {
		int divisor=div;
		
		if(n%div==0) {
			flag=false;
		}
		div=div+1;
		
		
	}
	System.out.println(flag);
}
}

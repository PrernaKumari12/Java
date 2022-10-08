package basic;

import java.util.Scanner;

public class Reverse {
	static Scanner scn= new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("enter no, : " );
		sum();
		System.out.println("Enter value of n");
		int n=scn.nextInt();
		
		System.out.println(n);
		
		int num=n;
		int ans=0;
		while(num!=0) {
			int rem=num%10;
			 ans=ans*10+rem;
			
		}
		System.out.println(ans);
	}
	public static void sum() {
		int no=scn.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++) {
			sum=sum+i;
			
		}
		System.out.println(sum);
	}

}

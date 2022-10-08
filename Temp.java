package basic;

public class Temp {
	public static void main(String[] args) {
		int fmin=0;
		int fmax=300;
		int fstep=20;
		int fcurrent=0;
		while(fcurrent<fmax) {
			int c=(int)((5.0/9)*(fcurrent-32));
			System.out.println(fcurrent+"\t"+c);
			fcurrent=fcurrent+fstep;
		}
//		int a=10;
//		
//		System.out.println(++a +" "+ ++a + " ");
	}

}

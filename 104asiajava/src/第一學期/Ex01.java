package �Ĥ@�Ǵ�;

import java.util.Scanner;

public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		long n = scn.nextLong();
		long sum =0;
		while(n>0){
			sum=sum+n%10;
			n=n/10;
			
		}System.out.println(sum);
	}

}

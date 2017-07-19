package hunder;

import java.util.Scanner;

public class Pro17 {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int sum=n;
		while(n!=0){
			int rem=n%10;
			n=n/10;
			sum*=rem;
		}
		System.out.println(sum);
	}

}

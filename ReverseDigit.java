package player;

import java.util.Scanner;

public class ReverseDigit {
	public static void main(String[]args){
		Scanner read=new Scanner (System.in);
		int num=read.nextInt();
		int sum=0;
		while(num!=0){
			int rem=num%10;
			num=num/10;
			sum*=10+rem;
			System.out.println(sum);
		}
		System.out.println(sum);
	}

}

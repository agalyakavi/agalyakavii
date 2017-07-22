package beginner;

import java.util.Scanner;

public class Big1 {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		
		int sum=0;
		while(n!=0){
		int rem=n%10;
		n=n/10;
		sum=sum*10+rem;
		}
		
		while(sum!=0){
			int rem=sum%10;
		sum=sum/10;
			switch(rem){
		case 1:
			System.out.print("One"+" ");
			break;
		case 2:
			System.out.print("Two"+" ");
			break;
		case 3:
			System.out.print("Three"+" ");
			break;
		case 4:
			System.out.print("Four"+" ");
			break;
		case 5:
			System.out.print("Five"+" ");
			break;
		case 6:
			System.out.print("Six"+" ");
			break;
		case 7:
			System.out.print("Seven"+" ");
			break;
		case 8:
			System.out.print("Eight"+" ");
			break;
		case 9:
			System.out.print("Nine"+" ");
			break;
		case 0:
			System.out.print("Zero"+" ");
		}

		}
	}

}

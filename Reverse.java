package set3;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
	Scanner read=new Scanner(System.in);
	int a=read.nextInt();
	int rem;
	int rev=0;
	
	while(a!=0){
		rem=a%10;
		a=a/10;
		rev=(rev*10)+rem;
		
	}
	System.out.println(rev);

	}

}

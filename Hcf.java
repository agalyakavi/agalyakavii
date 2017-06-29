package set3;

import java.util.Scanner;

public class Hcf {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int a=read.nextInt();
		int b=read.nextInt();
		int t=a;
		int t1=b;
		int gcd;
		while(true){
			if(a>b){
				if(a%b==0){
					gcd=b;
					break;
				}
				else
				{
					a=a%b;
				}
			}
			else{
				if(a<b){
					if(b%a==0){
						gcd=a;
						break;
					}
					else
					{
						b=b%a;
					}
				
			}
		}
	}
System.out.println(gcd);
}
}
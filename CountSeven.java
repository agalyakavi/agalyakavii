package player;

import java.util.Scanner;

public class CountSeven {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int count=0;
		if(n>0){
		int rem=n%10;
		n=n/10;
		
		
			if(rem==7){
				count++;
			
			}
		}
		 if(n>0){
			int rem1=n%10;
			n=n/10;
			if(rem1==7){
			count++;
		
		}
		 }
		 if(n>=1){
			 
			 int rem2=n%10;
			 n=n/10;
			 if(rem2==7){
			
			 count++;
			 }
		 }
			 System.out.println(count);
	
		
		
	}

}

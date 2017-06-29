package set3;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
Scanner read=new Scanner(System.in);
int a=read.nextInt();
int b=read.nextInt();
int lcm = 0;
if(a<b){
	for(int i=2;i<=a;i++){
         if((a%i==0)&&(b%i==0)){
        	 lcm=i;
       
         
         System.out.println(lcm);
         break;
	}
         }
	if(b<a){
		for(int i=2;i<=b;i++){
	         if((a%i==0)&&(b%i==0)){
	        	 lcm=i;
	       
	         
	         System.out.println(lcm);
	         break;
		}
		
	}
}

	}

}
}
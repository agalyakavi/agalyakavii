package player;

import java.util.Scanner;

public class Factplay {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++){
			 
			fact*=i;
		}
			System.out.println(fact);
	}

}


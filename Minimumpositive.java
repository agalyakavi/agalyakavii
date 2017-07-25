package player;

import java.util.Scanner;

public class Minimumpositive {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int num=read.nextInt();
		int j=0;
		do{
			j++;
		}
		while(!(num%j==1));{
			System.out.println("The minimum positive to be divided to make odd number is"+j);
		}
	}
	}



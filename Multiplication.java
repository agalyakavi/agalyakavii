package beginner;

import java.util.Scanner;

public class Multiplication {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		for(int i=1;i<=10;i++){
			System.out.println(i+" X "+n+"="+i*n);
		}
	}

}

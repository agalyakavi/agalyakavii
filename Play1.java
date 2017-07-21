package player;

import java.util.Scanner;

public class Play1 {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.next();
		StringBuffer str1=new StringBuffer(str).reverse();
		System.out.println(str1);
		
	}

}

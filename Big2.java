package beginner;

import java.util.Scanner;

public class Big2 {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		char ch=str.charAt(0);
		if(ch>=48&&ch<=57){
			System.out.println("true");
			
		}
		else
		{
			System.out.println("false");
		}
	}

}

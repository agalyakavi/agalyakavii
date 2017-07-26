package player;

import java.util.Scanner;

public class Strcontains {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str1=read.nextLine();
		String str2=read.nextLine();
		int n=str2.length();
		if(str1.contains(str2)){
			System.out.println("String contains a word");
		}
		else
		{
			System.out.println("The String not contain the word");
		}
	}

}

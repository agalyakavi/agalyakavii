package player;

import java.util.Scanner;

public class RecursionString {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		String str1[]=str.split("\\s");
		for(int i=str1.length-1;i>=0;i--){
			String str2=str1[i];
		
			System.out.print(str2+" ");
		}
	}

}

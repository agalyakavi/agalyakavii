package player;

import java.util.Scanner;

public class UppercasetoLower {
	public static void main(String[]args){
	Scanner read=new Scanner(System.in);
	String str=read.nextLine();
	String str1="";
	for(int i=0;i<str.length();i++){
		char ch=str.charAt(i);
		if(ch>='a'&&ch<='z'){
			str1+=Character.toString(ch).toUpperCase();
		}
		else
		{
			str1+=Character.toString(ch).toLowerCase();
		}
	}
	System.out.println(str1);

}
}

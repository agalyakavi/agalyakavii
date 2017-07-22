package player;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		
   String str1=str.replaceAll("a","");
   String str2=str1.replaceAll("e","");
  String str3=str2.replaceAll("i","");
  String str4=str3.replaceAll("o","");
   String str5=str4.replaceAll("u","");
   StringBuffer str6=new StringBuffer(str5).reverse();
   System.out.println(str6);
	}

}

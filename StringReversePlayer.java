package player;

import java.util.Scanner;

public class StringReversePlayer {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		String str1[]=str.split("\\s");
		StringBuffer a=new StringBuffer();
		for(int i=str1.length-1;i>=0;i--){
	
			a.append(str1[i]+" ");
			String b=new String(a);
			b.trim();
			System.out.println(b);
			
		}
		
		
		
	}

}

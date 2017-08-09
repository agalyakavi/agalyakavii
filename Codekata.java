package pro;

import java.util.Scanner;

public class Codekata {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str1=read.nextLine();
		String str2=read.nextLine();
		int d;
		int e;
		String s="";
		String t="";
		for(int i=0;i<str1.length();i++){
			char c=str1.charAt(i);
			if(c>='a'&&c<='z'){
			  d=(int)c-'a'+1;
			  e=d+10;
			  if(e>26){
				  e=e-26;
			  }
			  e=e+96;
			  s+=Character.toString((char)e);
			}
			
			}
			System.out.print(s+" ");
			char a=str2.charAt(0);
			t+=Character.toString(a);
			
		for(int j=1;j<str2.length()-1;j++){
			char b=str2.charAt(j);
			if(b>='a'&&b<='z'){
				  d=(int)b-'a'+1;
				  e=d+10;
				  if(e>26){
					  e=e-26;
				  }
				  e=e+96;
				  t+=Character.toString((char)e);
			
		}
		}
			char w=str2.charAt(str2.length()-1);
			t+=Character.toString(w);
			
		
		System.out.print(t);
	}
}

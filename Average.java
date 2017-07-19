package set12;

import java.util.Scanner;

public class Average {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		int sum=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			int c=(int)ch;
			sum+=c;
		}
		int avg=sum/str.length();
		char ch1=(char)avg;
		System.out.println(ch1);
	}

}

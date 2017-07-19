package set12;

import java.util.Scanner;

public class Reverseword {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		int i=0;
		String str1[]=str.split("\\s");
		for(i=0;i<str1.length;i++){
			if(i%2==0)
			{
				StringBuffer str2=new StringBuffer(str1[i]).reverse();
				System.out.print(str2+" ");
			}
			else
				System.out.print(str1[i]+" ");
		}
	}

}

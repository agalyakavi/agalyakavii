package player;

import java.util.Scanner;

public class RepeatedString {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		String str1[]=str.split("\\s");
		int count=0;
		int maxi=0;
		String ans="";
		for(int i=0;i<str1.length;i++){
		
			for(int j=1;j<str1.length;j++){
				for(int k=0;k<str1[i].length();k++){
					count=0;
					if(str1[i].charAt(j)==str1[i].charAt(k)){
					count++;
					}
				}
				if(count>maxi){
					ans=str1[i];
					maxi=count;
				}
			}
		}
					System.out.println(ans);
				
	
			
		}
	}



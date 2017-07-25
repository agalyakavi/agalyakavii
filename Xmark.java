package player;

import java.util.Scanner;

public class Xmark {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		int n=Integer.parseInt(str);
		System.out.println(n);
		int count=0;
		while(n!=0){
			int rem=n%10;
			n=n/10;
			count++;
		}
		for(int i=0;i<=count;i++){
			for(int j=1;j<=count;j++){
			if (j==1+i||j==count-i){
				System.out.print(j);
			}
				else {
					System.out.print(" ");
				}
			
			}
			System.out.println();
			}
	}
		}
	

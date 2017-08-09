package pro;

import java.util.Scanner;

public class Alex {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int k=read.nextInt();
		String a=read.next();
		int b[]=new int[k];
		int c=0;
		for(int i=0;i<k;i++){
			b[i]=read.nextInt();
			if(a.charAt(b[i]-1)=='0'){
				c=1;
			}
		}
		if(c==0){
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
		
	}

}

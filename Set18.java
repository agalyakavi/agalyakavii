package hunder;

import java.util.Scanner;

public class Set18 {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				for(int k=2;k<n;k++){
					if(a[i]+a[j]==a[k]){
						System.out.print(a[i]+" "+ a[j]+" "+a[k]);
						System.out.println();
					}
					else
						continue;
				}
			}
		}
	}

}

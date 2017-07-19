package hunder;

import java.util.Scanner;

public class Set16 {
	public static void main(String []args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
		if(a[i]==a[j]){
			System.out.println(a[i]);
			break;
		}

			}
	}
	}
}

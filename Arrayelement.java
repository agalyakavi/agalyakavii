package player;

import java.util.Scanner;

public class Arrayelement {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int [n];
		int count=0;
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
			
		}
		for(int i=0;i<n;i++){
			count=0;
			for(int j=0;j<n;j++){
				if(i!=j){
				if(a[i]==a[j]){
					count=1;
				}
				}
			}
			if(count==0){
				System.out.println(a[i]);
			}
		}
	}

}

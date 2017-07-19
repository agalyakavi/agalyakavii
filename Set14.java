package hunder;

import java.util.Scanner;

public class Set14 {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int[n];
		int count=0;
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
			
		}
		for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				if(a[i]==a[j]){
				a[j]='a';
				count++;}
				else{
				continue;
			}
			}
			if(count>0){
				a[i]='a';
			
			}
		}
		for(int i=0;i<=n;i++){
			if(a[i]=='a'){
				continue;
			}else{
				System.out.println(a[i]);
				break;
			}
		}
	}

}

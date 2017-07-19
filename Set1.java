package hunder;

import java.util.Arrays;
import java.util.Scanner;

public class Set1 {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int[5];
		//int temp=0;
		//int count=0;
		//int sum=0;
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
			
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			/*temp=a[i+1];
			count=0;
			while(temp!=0){
				count=temp/10;
				count++;
			}
			sum*=Math.pow(10,count)+a[i+1];
		}
		System.out.println(sum);
	}*/
			 if(a[i]==a[(i+1)%n])
                 System.out.println(a[i]);
     }
				
		}
}

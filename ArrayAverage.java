package player;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayAverage {
	public static void main(String[]args){
		Scanner read=new Scanner (System.in);
		int n=read.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
		}
		Arrays.sort(a);
		float sum=0;
	float avg=0;
		for(int j=0;j<n;j++){
			sum+=a[j];
			
		}
		avg=sum/n;
		System.out.println(avg);
		
	}

}

package beginner;


import java.util.Scanner;

public class Heighestarray {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
		}
		int sum=0;
		int avg=0;
		for(int i=0;i<n;i++){
			sum+=a[i];
		}
		avg=sum/n;
		System.out.println(avg);
	}

}

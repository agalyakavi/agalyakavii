package beginner;

import java.util.Arrays;
import java.util.Scanner;

public class Heighestarray {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[0]);
		System.out.println(a[n-1]);
	}

}

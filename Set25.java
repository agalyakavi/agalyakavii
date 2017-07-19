package hunder;

import java.util.Arrays;
import java.util.Scanner;

public class Set25 {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int k=25;
		int a[]=new int[50];
		for(int i=0;i<50;i++){
			a[i]=read.nextInt();
		}
		Arrays.sort(a);
			System.out.println(a[4]);
			System.out.println(a[k]);
		
	}

}

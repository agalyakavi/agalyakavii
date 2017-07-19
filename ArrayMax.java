package set12;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMax {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				
				a[i]=read.nextInt();
			}
		}
		Arrays.sort(a);
		System.out.println(a.length-1);
	}

}

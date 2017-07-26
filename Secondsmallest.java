package player;

import java.util.Arrays;
import java.util.Scanner;

public class Secondsmallest {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
		}
		Arrays.sort(a);
		System.out.println(a[1]);
	}

}

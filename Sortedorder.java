package player;

import java.util.Arrays;
import java.util.Scanner;

public class Sortedorder {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		int n=read.nextInt();
		int a[]=new int[n];
		int count=0;
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=read.nextInt();
			arr[i]=a[i];
		}
	Arrays.sort(a);

	for( int i = 0 ; i<n ; i++ ) {
		if( a[i] == arr[i] ) {
			count++;
		}
	}
	if( n == count ) {
		System.out.println( "The array is sorted." );
	}
	else {
		System.out.println("The Array is an sorted");
	}
	}
}

package player;

import java.util.Scanner;

public class Digitcount {
	
	public static void main(String[] args) {
		System.out.println("Enter a Value:");
		Scanner in=new Scanner(System.in);
		String str=in.nextLine();
		in.close();
		char a[]=str.toCharArray();
		int sum=0;
		for(int i=0;i<a.length;i++){
			if((int)a[i]%2==0){
				continue;
			}
			else{
				sum=sum+(int)a[i];	
				}
			}
		if(sum%2==0){
			System.out.println(-1);
		}
		else{
			System.out.println(1);
		}
		

	}

}


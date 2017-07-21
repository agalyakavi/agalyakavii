package player;

import java.util.Scanner;

public class Holiday {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		String str=read.nextLine();
		if(str!="sunday"){
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}

}

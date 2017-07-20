package beginner;

import java.util.Scanner;

public class Set3 {
	public static void main(String[]args){
		Scanner read=new Scanner(System.in);
		System.out.println("Enter the Number from range 1 to 9");
		int num=read.nextInt();
		if(num>=1&&num<=9){
			System.out.println(num);
		}
		else
			System.out.println("you entered number not in range");
	}

}

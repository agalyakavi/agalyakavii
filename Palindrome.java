package pro;

import java.util.Scanner;

public class Palindrome {

		
		String r;
		static int l=0;
		
		void isPalindrome(String re)
		{
			String rev=new StringBuffer(re).reverse().toString();
			if(re.equals(rev))
			{
				if(re.length()>l)
				{
					r=re;
					l=re.length();
				}
			}
		}
		
		public static void main(String[] arg)
		{
		Palindrome obj=new Palindrome();
			Scanner read = new Scanner(System.in);
			String s=read.nextLine();
			read.close();
			
			for(int i=0;i<s.length();i++)
			{
				boolean condition=true;
				int id=0;
				char t=s.charAt(i);
				int j=1;
				while(condition)
				{
					id=s.indexOf(t,i+j);
					if(id==-1)
						condition=false;
					else{obj.isPalindrome(s.substring(i, id+1));
					j+=(id+1);
				}
			}
		}
		System.out.println(obj.r);
	}
	
}



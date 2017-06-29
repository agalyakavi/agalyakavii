package set3;

public class Gcd1 {
	public static void main(String[]args){
		int a=8;
		int b=12;
		int gcd;
		while(true){
			if(a>b){
				if(a%b==0){
					gcd=b;
					break;
				}
				else
				{
					a=a%b;
				}
			}
			else{
				if(a<b){
					if(b%a==0){
						gcd=a;
						break;
					}
					else
					{
						b=b%a;
					}
				
			}
		}
	}
System.out.println(gcd);
}

}

package set3;

public class SumandAdd {

	public static void main(String[] args) {
		int a=1;
		int b=15;
		int c=15;
		int d=45;
		int sum=0;
		int sum1=0;
		for(a=1;a<15;a++){
			sum+=a;
			
		}
		for(c=15;c<45;c++){
			if(c%2==1){
				sum1+=c;
			}
		}
System.out.println(sum);
System.out.println(sum1);
	}

}

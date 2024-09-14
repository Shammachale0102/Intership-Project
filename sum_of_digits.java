package logicalpor;

public class sum_of_digits {
	//sum of digits given no=123[1+2+3=6]
	public static void main(String []args) {
		int a=123,mod,sum=0;

		while(a>0) {
			mod=a%10;
			sum=sum+mod;
			a=a/10;
		}
		
		System.out.println(sum);
		
	}


}

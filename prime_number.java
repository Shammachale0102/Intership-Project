package logicalpor;

public class prime_number {

	public static void main(String[]args) {
	int a=12,count=0;
	for (int i=1;i<=a;i++) {
		if (a%i==0) {
			count++;
		}
	}
	if (count==2)
		System.out.println("it is even");
	else
		System.out.println("it is not even");
	}


}

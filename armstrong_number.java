package logicalpor;

public class armstrong_number {

	//find armstrong number eg.153=(1*1*1 + 5*5*5 + 3*3*3)=153
	public static void main(String []args) {
	int a=1634,rem,add=0;
	int d=a;
	while(a>0) {
		rem=a%10;
		add=add+rem*rem*rem*rem;
		a=a/10;
	}
	if(add==d)
	System.out.println("it is armstrong number ");
	else 
		System.out.println("it is not armstrong number");
	
	

	}

}

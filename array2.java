package Arry_program;
import java.util.Scanner;
//Find the maximum & minimum number in an array of integers. 
public class array2 {
	public static void main(String[]args) {
	int g;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter array size");
	g=sc.nextInt();
	int ar[]=new int[g];
	System.out.println("enter array element");
	for(int i=0;i<g;i++) {
		ar[i]=sc.nextInt();
	}
	int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
	
	
	for(int i=0;i<ar.length;i++) {
		if (ar[i]<min) {
			min=ar[i];
			
		}
		if(ar[i]>max) {
			max=ar[i];
		}
	}
	
	System.out.println("max"+max);
	System.out.println("min value is "+ min);
		
	}
}
	

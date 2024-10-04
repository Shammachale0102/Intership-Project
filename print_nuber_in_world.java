package logicalpor;

import java.util.Scanner;

public class print_nuber_in_world {
	private static String numberss(int g) {
		String s="";
		String sc[]= {"one","two","three","four","five","six","seven"
				,"eight","nine","ten","eleven","twelve","thriteen","fourteen",
				"fifteen","sisteen","seventeen","eighteen","ninteen"};
		String ss[]= {"ten","twenty","thirty","fourty","fifty",
				 "sixty","seventy","einhty","ninty"};
		
		if(g==0) {
			System.out.println("zero");
			return "zero";
		}
		if(g<0) {
			String number=""+g;
			number=number.substring(g);
			return "minus"+numberss(Integer.parseInt(number));
					}
		if ((g/1000000)>0) {
			s=s+numberss(g/1000000)+"million";
			g=g%1000000;
			
		}
		if((g/1000)>0) {
			s=s+numberss(g/1000)+"thousand";
			g=g%1000;
		}
		if ((g/100)>100) {
			s=s+numberss(g/100)+"hundred";
		}
		if(g<20) {
			s=s+sc[g];
		}
		else {
			s=s+sc[g/10];
			if((g%10)>0) {
				s=s+"-"+sc[g%10];
			}
		}
		return s;
	}
	
	
public static void main(String []args) {
		
		
		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a==0) {
			System.out.println("zero");
		}
		
		else {
			System.out.println("number in word"+numberss(a));
		}
		
	}
}


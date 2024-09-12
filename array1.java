package Arry_program;

import java.util.Scanner;

public class array1 {
	
		//Take an array of names as input from the user and print them on the screen.

			public static void main(String args[]) {
				int s;
				Scanner sc=new Scanner(System.in);
				System.out.println("enter array size");
				s=sc.nextInt();
				int []gh=new int [s];
				System.out.println("enter array elements");
				for(int a=0;a<s;a++) {
					gh[a]=sc.nextInt();
				}
				System.out.println("it is a arry ");

				for (int i=0;i<s;i++) {
					System.out.println(gh[i]);
				}
			}
		}


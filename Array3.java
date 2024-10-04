package Arry_program;

import java.util.ArrayList;
import java.util.Arrays;

public class Array3 {
	//Take an array of numbers as input and check if it is an array sorted in ascending order.
	//Eg : { 1, 2, 4, 7 } is sorted in ascending order.
	 //      {3, 4, 6, 2} is not sorted in ascending order.

	public static void main(String []args) {
	int arr[] = { 3,5,2,5,4,2,0,122345};
	int tem;
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j]>arr[j+1]) {
				tem=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=tem;
			}
		}
		
	}
	System.out.println("givn array ascending order");
	for(int i=0;i<8;i++) {
		
		System.out.println(arr[i]);
	}
	
	}
}




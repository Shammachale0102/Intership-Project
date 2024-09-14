package Arry_program;
import java.util.Arrays;
public class array4 {
	
//change two number 
	
		public static void main(String args[]) {
			int arr[]= {4,6,4,3,44};
			int index1=0,index2=4;
			
			
	        	
	        
			
	        for (int i = 0; i <arr.length; i++) {
	            if (i==index1){
	                int temp=arr[index1];
	                arr[index1]=arr[index2];
	                arr[index2]=temp;
	            }
	        }
	        System.out.println(Arrays.toString(arr));
	        }
	}




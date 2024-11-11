package assignment;

import java.util.Arrays;
import java.util.Scanner;


public class Question_1 {
	
	
	
	public static int linearSearch(int arr[],int key) {
		
		
		
		
		for(int i=arr.length-1;i>0;i--) {
			
			if(key==arr[i]) {
				
				return i;
				}
			
			}
		return -1;
	}
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {7,89,6,45,32,1,65,99,6};
		System.out.println("array "+Arrays.toString(arr));
		
		System.out.println("enter key to search :");
		int v=sc.nextInt();
		int index=linearSearch(arr,v);
		System.out.println("array index : "+index);
		// TODO Auto-generated method stub

	}

}

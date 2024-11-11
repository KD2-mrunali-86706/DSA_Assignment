package assignment;

import java.util.Arrays;
import java.util.Scanner;

public class question_5 {

	public static int LinearSearchOccurence(int arr[],int key,int occurencenumber) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count++;
				if(count==occurencenumber)
				return i;
			}
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {4,5,4,9,4,6,4,3};
		System.out.println("arrays : "+Arrays.toString(arr));
		System.out.println("Enter key : ");
		int k=sc.nextInt();
		int ono=4;
		int index=LinearSearchOccurence(arr,k,ono);
		System.out.println("key "+k+" is at index "+index);
		
		

	}

}

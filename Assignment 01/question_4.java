package assignment;

import java.util.Scanner;

public class question_4 {
	public static int binarySearch(int arr[],int key) {
		
		int left=0,right=arr.length-1,mid;
		while(left<=right) {
			mid=(left+right)/2;
			if(key==arr[mid])
				return mid;
			else if(key<arr[mid]) {
				left=mid+1;	
			}
				else 
					right=mid-1;
					
					
			}
		
		
		
		
		
		
		
		return -1;
	}
	
	

	public static void main(String[] args) {
		
int arr[] = {69,45,35,2};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter key to be searched : ");
		int key = sc.nextInt();
		
		int index = binarySearch(arr, key);
		if(index == -1)
			System.out.println("Key is not found");
		else
			System.out.println("Key is found at index : " + index);
		sc.close();
		

	}

}

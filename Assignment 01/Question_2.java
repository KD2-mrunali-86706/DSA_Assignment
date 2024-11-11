package assignment;

import java.util.Scanner;

public class Question_2 {

	public static int binarySearchDe(int arr[],int key)
	{
		int left=0,right=arr.length-1,mid;
		int comp=0;
		while(left<=right)
		{
			comp++;
			mid=(left+right)/2;
			if(key==arr[mid])
				
				return mid;
			else if(key<arr[mid])
				
				right=mid-1;
			else
				
				left=mid+1;
			System.out.println("Comparation " +comp);
		}
		return -1;
	}
	
	
	
		public static int linearSearch(int arr[],int key,int j)
		{
			int countoccurance=0;
			for(int i=0;i<arr.length;i++)
			{
				if(key==arr[i])
					countoccurance++;
				if(countoccurance==j)
					return i;
			}
			
			return -1;
		}
	
	
	
	
	
	
	public static void main(String[] args) {
		int arr[]= {11,22,33,44,55,66};
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter key to search ");
		int key=sc.nextInt();
		System.out.println("-----------binary search--------------");
		int index=binarySearchDe(arr,key);
		if(index==-1)
			System.out.println("key not found ");
		else
			System.out.println("key is found "+index);
		
		
		
		
		System.out.println("-----------------linear search--------------------");
		int array[]= {55,33,22,11,66,55,55};
		
		
		System.out.print("enter key to search ");
		int keys=sc.nextInt();
		System.out.print("enter index to find ");
		int i=sc.nextInt();
		
		int indexx=linearSearch(array,keys,i);
		if(indexx==-1)
			System.out.println("key not found ");
		else
			System.out.println("key found "+indexx);
		
		
		
		
		
	}

}

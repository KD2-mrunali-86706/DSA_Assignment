package com.sunbeam;

import java.util.Arrays;

public class Question_1 {
	public static void insertionSort(int arr[],int n)
	{
		for(int i=1;i<n;i++)
		{
			int temp=arr[i];
			int j;
			for(j=i-1;j>=0 && arr[j]<temp;j--) //insertion sort reverse order we need to arr[j]<temp operator 
				
			{
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
			
		}
	}
	public static void main(String args[])
	{
		int arr[]= {55,22,44,88,11,100};
		System.out.println("before sort "+Arrays.toString(arr));
		insertionSort(arr,arr.length);
		System.out.println("after sort array "+Arrays.toString(arr));
	}
}

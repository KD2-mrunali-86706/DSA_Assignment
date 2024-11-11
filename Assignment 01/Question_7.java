package assignment;



import java.util.Scanner;

public class Question_7 {
	
	public static int rankOfElement(int arr[],int element) {
		int rank=0;
		for(int i=0;i<arr.length-1;i++) {
			int minIndex=i,j;
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex])
				   minIndex=j;
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;			
		} 
		int k;
		for(k=0;k<arr.length;k++) {  
			
			if(arr[k]>element)
				break;
			else if(arr[k]==element && k==arr.length-1)
				return rank;
			rank++; 
		}
		if(k==arr.length)
			return -1;
		return rank;
	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= { 10, 20, 15, 3, 4, 4, 1 };
		System.out.println("Enter element want to search: ");
		int element=sc.nextInt();
		int rank=rankOfElement(arr,element);
		
		if(rank!=-1)
		    System.out.println("Rank of "+element+" is "+rank);
		else
			System.out.println("Element no found");
		
		sc.close();
	}
}

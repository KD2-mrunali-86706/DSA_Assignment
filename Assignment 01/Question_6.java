package assignment;



public class Question_6{
	
	public static int firstNonRepeating(int arr[]) {
		int flag,j;
		for(int i=0;i<arr.length;i++) {
			flag=0;
			int value=arr[i];
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]==value) {
					flag=1;
					break;
				}
					
			}
			if(flag==0)
				return value;
			
		}
		return -2;
	}

	public static void main(String[] args) {
		int arr[]= {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
		int element=firstNonRepeating(arr);
		System.out.println("First non repeating element is "+element);
	}

}


	
package com.practiceARRAY;

public class Shift_Zeros {
	
/*	public static void main (String[] args)
	{
		int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
		//int n = arr.length;
		//pushZerosToEnd(arr, n);
		 int count = 0;
	        for (int i = 0; i < arr.length; i++)
	            if (arr[i] != 0)
	                arr[count++] = arr[i];
	        while (count < arr.length)
	            arr[count++] = 0;
		System.out.println("Array after pushing zeros to the back: ");
		for (int i=0; i<arr.length; i++)
			System.out.print(arr[i]+" ");
	}

}
*/
	
	public static void main(String[] args) {
		
		int a[] = { 1,2,3,0,0,2,3,4,5,0,0,8,7};
		
		int temp = 0;
	
		for(int i =0; i<a.length; i++) {

			for(int j =i+1; j<a.length;j++) {
				
				if(a[i] == 0) {
					
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
					
				}
			}
		}
		for (int i : a) {
			System.out.print(" " + i);
			
		}
	} }

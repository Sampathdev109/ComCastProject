package com.practiceSTRINGS;

public class String_Length_Min {

public static void main(String[] args) {
		
		String arr[] = {"Hi", "bye", "P", "mangoo", "tyss", "qwerty", "a"};
		
		String min = arr[0];
		for(int i= 1; i<arr.length; i++)
		{

			if(min.length() > arr[i].length())
				{
		min=arr[i];
			}
		}
				for(int i = 0; i<arr.length; i++) {
					if(min.length()== arr[i].length())
					{
						System.out.println(arr[i]);
					}
					
				}
			}
}

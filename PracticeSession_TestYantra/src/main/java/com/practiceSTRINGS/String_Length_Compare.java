package com.practiceSTRINGS;

public class String_Length_Compare {
public static void main(String[] args) {
		
		String arr[] = {"Hi", "bye", "P", "mangoo", "tyss", "qwerty"};
		
		String max = arr[0];
		for(int i= 1; i<arr.length; i++)
		{

			if(max.length() < arr[i].length())
				{
		max=arr[i];
			}
		}
				for(int i = 0; i<arr.length; i++) {
					if(max.length()== arr[i].length())
					{
						System.out.println(arr[i]);
					}
					
				}
			}


}

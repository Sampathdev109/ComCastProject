package com.practiceARRAY;

public class Add_Different_Array {
	public static void main(String[] args) {
		int a[] = {20,30,40};
		int b[] = {100,200,300,400,500};
		int count = 0;
		
		if(a.length<b.length)
		{
			count = b.length;
		}
		System.out.println("Max. available length from compared strings " + count);
		for(int i=0; i<count; i++) {
			try {
			System.out.println(a[i] + b[i]);
			}
			catch (Exception e) 
			{ 
				if(a.length > b.length)
				{
					System.out.println(a[i]);
				}
				else
				{
					System.out.println(b[i]);
				}
			}

	
}}}
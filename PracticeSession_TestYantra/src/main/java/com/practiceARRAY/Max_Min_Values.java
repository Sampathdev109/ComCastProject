package com.practiceARRAY;

import org.apache.commons.math3.analysis.function.Max;

public class Max_Min_Values {
	public static void main(String[] args) {
		
		int a[] = {1111,65,223,111,24,7999,7890,35,67,0,8};
		
		int temp = 0;
		int sum = 0;
		for(int i= 0; i<a.length; i++)
		{
			for(int j =0; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
			System.out.println("First Max. Value :" + a[0]);
			System.out.println("Second Max. Value :" + a[1]);
			System.out.println("Third Max. Value :" + a[2]);
			
	}
	}
	

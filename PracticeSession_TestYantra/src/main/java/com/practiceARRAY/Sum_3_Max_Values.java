package com.practiceARRAY;

public class Sum_3_Max_Values {
	
public static void main(String[] args) {
		
		int a[] = {11,65,22,78,56};
		
	
		int sum = 0;
		for(int i= 0; i<a.length; i++)
		{
			for(int j =i+1; j<a.length; j++)
			{
				if(a[i] < a[j])
				{
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
			System.out.println("First Max. Value :" + a[0]);
			System.out.println("Second Max. Value :" + a[1]);
			System.out.println("Third Max. Value :" + a[2]);
			for(int i = 0 ; i<3; i++) {
				sum = sum + a[i];
			}
				System.out.println("sum of first 3 max. values : " + sum);
			}

}

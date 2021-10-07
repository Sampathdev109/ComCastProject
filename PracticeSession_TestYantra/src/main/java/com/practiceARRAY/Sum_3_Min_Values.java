package com.practiceARRAY;

public class Sum_3_Min_Values {
public static void main(String[] args) {
		
		int a[] = {1111,65,223,111,24,7999,7890,35,67,0,8};
		
		int temp = 0;
		int sum = 0;
		for(int i= 0; i<a.length; i++)
		{
			for(int j =i+1; j<a.length; j++)
			{
				if(a[i] > a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
			System.out.println("First Min. Value :" + a[0]);
			System.out.println("Second Min. Value :" + a[1]);
			System.out.println("Third Min. Value :" + a[2]);
			for(int i = 0 ; i<3; i++) {
				sum = sum + a[i];
			}
				System.out.println("sum of first 3 min. values : "+ sum);
			}

}

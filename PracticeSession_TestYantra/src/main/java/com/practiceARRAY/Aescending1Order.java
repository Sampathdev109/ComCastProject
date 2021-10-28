package com.practiceARRAY;

public class Aescending1Order {

	public static void main(String[] args) {
		int a[] = {9,8,78,90,11,00,35,87,93,22,33,67,99};
		
		int temp = 0;
		
		for(int i = 0; i<a.length; i++) {
			for(int j = i+1; j<a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j] ;
					a[j] = temp;
				}
				
			}
		}
		
		//for(int i = 0; i<a.length; i++) {
		for (int i : a)
			System.out.print(" " + i);
		}

}

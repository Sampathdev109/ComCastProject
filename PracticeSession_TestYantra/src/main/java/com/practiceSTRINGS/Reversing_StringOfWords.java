package com.practiceSTRINGS;

public class Reversing_StringOfWords {

	/*
	 * Reversing a sentence
	 */
	public static void main(String[] args) {
		
			// Given String
		String name = "Welcome King Sampathdev Welcome Sampathdev to his own King dom";
		// convert string to string array.
		String str [] = name.split(" ");
		System.out.println("String before reversing : ");
		//int x = str.length;
		for (int i=0; i<str.length; i++) {
			
			System.out.print(str[i] + " ");
		}
		System.out.println("\nString after reversing : ");
		for (int i = str.length-1; i>=0; i--) {
			
			System.out.print(str[i] + " ");
		}
		}

		
	}


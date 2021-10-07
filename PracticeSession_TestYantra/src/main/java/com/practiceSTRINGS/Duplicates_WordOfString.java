package com.practiceSTRINGS;

import java.util.LinkedHashSet;

public class Duplicates_WordOfString {
	/*
	 * Print Duplicates words of a String
	 */
	public static void main(String[] args) {
		// Given String
	String name = "Welcome King Sampathdev Welcome Sampathdev to his own King dom";
	name = name.toLowerCase();
	// convert string to string array.
	String str [] = name.split(" ");
	
	// Create a HashSet
	LinkedHashSet<String> lhs = new LinkedHashSet<String>();
	
	System.out.println("Given String is : " + name);
	
	// Add all the characters to the HashSet.
	for(int i=0; i<str.length; i++) {
		lhs.add(str[i]);
	}
	// Fetch all the characters
	System.out.print("Printing only the Duplicate words : ");
	for(String word : lhs) {
	int count =0;
	
	for(int j=0; j<str.length; j++) {
		// compare all the characters with the HashSet
		if(word.equals(str[j])) {
			// Increment the count if the character matches, else regret
			count++;
		}
	}
	if(count > 1)
	//System.out.println("Occurance of " + word + " is " + count );
		System.out.print(" " + word);
	}
	}

}

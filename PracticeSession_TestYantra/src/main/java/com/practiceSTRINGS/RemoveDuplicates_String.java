package com.practiceSTRINGS;

import java.util.LinkedHashSet;

public class RemoveDuplicates_String {


	public static void main(String[] args) {
		// Given String
	String name = "Sampathdev";
	name = name.toLowerCase();
	
	// Create a HashSet
	LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
	
	System.out.println("Given String is : " + name);
	
	// Add all the characters to the HashSet.
	for(int i=0; i<name.length(); i++) {
		hs.add(name.charAt(i));

	}

	// Fetch all the characters
	System.out.print("Removing the Duplicates : ");
	for(char ch : hs) {
	int count =0;
	
	for(int j=0; j<name.length(); j++) {
		// compare all the characters with the HashSet
		if(ch == name.charAt(j)) {
			// Increment the count if the character matches, else regret
			count++;
		
		}
	}
	// To remove the duplicate characters (Occurance of Duplicates)
	if(count == 1) {
	System.out.print(ch);
	}
	}
}}
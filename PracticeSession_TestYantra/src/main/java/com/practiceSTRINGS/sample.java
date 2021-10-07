package com.practiceSTRINGS;

import java.util.HashSet;

public class sample {

	public static void main(String[] args) {
		
		String s = "Sampathdev";
		
		HashSet<Character> hs = new HashSet<Character>();
		for(int i = 0; i<s.length(); i++)
		{
			hs.add(s.charAt(i));
		}
		for (char ch : hs) {
			int count = 0;
			
			for(int j = 0; j<s.length(); j++) {
			 if(ch==s.charAt(j)) {
				 count ++;
			 }
			 
			}
			System.out.println("occurance of " + ch + " is "+ count);
		}
	
	}
}

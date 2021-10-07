package com.practiceSTRINGS;

import java.util.LinkedHashSet;

public class demo {
	
	public static void main(String[] args) {
		
		String s = "RanaPratabSingha";
		
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for (int i = 0; i<s.length(); i++) {
			lhs.add(s.charAt(i));
	}
		for (char c : lhs) {
			int count = 0;
			
			for(int j=0; j<s.length(); j++) {
				if(c == s.charAt(j)) {
					count++;
					
				}
			}
			if(count>1)
			{
			System.out.println(count);
		}
		
			
		}}

		
}

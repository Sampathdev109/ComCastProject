package com.practiceSTRINGS;

public class Reverse_String {
	public static void main(String[] args) {
		String s = "RamJiRau";
		String rev = "";
		s = s.toLowerCase();
		System.out.println("Given String is :" + s);
		for(int i=s.length()-1; i>=0; i--) {
			char c = s.charAt(i);
			rev = rev + c;
			
		}
		
		System.out.println("Reversed String is :" + rev);
		
	}

}

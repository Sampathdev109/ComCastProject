package com.practiceSTRINGS;

public class Reverse_String_Concatewith_SameString {

	
	public static void main(String[] args) {
		
		String name = "Sampathdev";
		for(int i=name.length()-1; i>=0; i--) {
			char c = name.charAt(i);
			System.out.print(c);
		}
	}
	}

package com.practiceSTRINGS;

public class Reverse_String_StringBuilder {
	
	/* public static void main(String[] args) {
		String s = "Sampathdev";
		s=s.toLowerCase();
		System.out.println("Given String is :" + s );
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		System.out.println("Reversed String is : " + sb);
		
	}
*/
	public static void main(String[] args) {
		
		String name = "Sampathdev";
		String rev = "";
		int count = 0;
		char c [] = name.toCharArray();
		
		for(char i : c) {
			count++;
			}
		System.out.println("Given String is : " + name );
		System.out.println("Total no: of Charcters present in Given String is: " + count);
		
		for(int i=count-1; i>=0; i--) {
			rev = rev + name.charAt(i);
			count--;
		}
		
		System.out.println("Reversed String is : " + rev);
	}
	
	
}

package com.practiceSTRINGS;

public class India_Pattern {
	
	public static void main(String[] args) {
		/*
		String s = "INDIA";
		String Initial = "";
		
		for(int i = 0; i<=s.length()-1; i++) {
			Initial = Initial + s.charAt(i);
			
			
			System.out.println(Initial);
		}
	}
	*/
		String s = "INDIA";
		for(int i=0; i<=s.length()-1; i++) { 
		String a = s.substring(0,i+1);
			System.out.print(a);
		}
		

}}


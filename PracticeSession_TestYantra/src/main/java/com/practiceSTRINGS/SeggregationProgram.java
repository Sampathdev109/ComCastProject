package com.practiceSTRINGS;

public class SeggregationProgram {
	
	/*
	 * Seggregation Program based on the data types and characters.
	 */

	public static void main(String[] args) {
	
		String s = "sampath@#$%sreekumar109@gmail.com";
		String Alpha = " ";
		String Num = " ";
		String Special = " ";
		
		for (int i =0; i<s.length(); i++) {
			
			if((s.charAt(i)>='a') && (s.charAt(i)<='z') || (s.charAt(i)>='A') && (s.charAt(i)<='Z'))
{
	 Alpha = Alpha + s.charAt(i);
}
			else if ((s.charAt(i)>='0') && (s.charAt(i)>='9')) {
				Num = Num + s.charAt(i);
			}
			
			else {
				
				Special = Special + s.charAt(i);
			
			}
		}
	
		System.out.println(Alpha);
		System.out.println(Num);
		System.out.println(Special);
		
	}
}

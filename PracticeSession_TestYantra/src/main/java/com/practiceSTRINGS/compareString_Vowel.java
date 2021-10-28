package com.practiceSTRINGS;

public class compareString_Vowel {

	public static void main(String[] args) {

		String s="12456#!a#e33aeiouut345.uUuio";
		char name [] = s.toCharArray();
		//String vowel = "aeiou";
		char mod[]  = {};
		
		for(int i=0; i<s.length(); i++) {
			
		if((s.charAt(i)>='a') && (s.charAt(i)>='e') && (s.charAt(i)>='o') && (s.charAt(i)>='u')) {
			mod = mod + name[i];
		}
		}
		
	}}
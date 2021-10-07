package com.practiceSTRINGS;

public class SwapLastWord {
	public static void main(String[] args) {
		
		String name = "Welcome King Sampathdev Welcome Sampathdev to his own Kingdom";
		// convert string to string array.
		String str [] = name.split(" ");
		System.out.println("String before reversing : " + name);
		String temp = str [0];
		str[0] = str [str.length-1];
		str[str.length-1] = temp;
		System.out.println("After Swapping : ");
		for (int i=0; i<str.length; i++) {
			System.out.print(str[i] + " ");
		}
			
	}

}

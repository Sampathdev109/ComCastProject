package com.practiceSTRINGS;

public class Compare_String_alpha {
	
	public static void main(String[] args)
    {
		
		 String names[]
		            = { "Sampathdev", "Sampath", "Rajdeep", "Radha", "Roma", "Bhingo" };
        
        String temp;
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                
                // to compare one string with other strings
                if (names[i].compareTo(names[j]) > 0) {
                    // swapping
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
            System.out.println(names[i]);
        }
        
      
    }

}

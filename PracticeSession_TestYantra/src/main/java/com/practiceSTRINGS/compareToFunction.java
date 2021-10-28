package com.practiceSTRINGS;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class compareToFunction {
	public static void main(String[] args) {

	String s1= "abc";
	String s2= "abc";
	

		System.out.println(s1.compareTo(s2));
		System.out.println(s1==s2);
			
	
	HashMap hm = new HashMap();
	hm.put(1, "abc");
	hm.put(2, "bcd");
	
	Collection col = hm.values();
	
	ArrayList al = new ArrayList(col);
	
	System.out.println(al);
	System.out.println(hm);
	System.out.println(col);
	
	int a[] = {5,2,7,15,25,30};
	
	for(int i=0; i<=a.length-1; i++)
	{
		int dig = a[i]%10;
		if(dig==5)
		{
			System.out.println(a[i]);
		}
	}
	
	
}

}
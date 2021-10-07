package com.practiceJAVAcollection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(10);
		hs.add(20);
		hs.add(20);
		hs.add("dom");
		hs.add("dom");
		hs.add("ram");
		hs.add("sita");
		hs.add('a');
		hs.add(hs);
		hs.add(null);
		hs.add(null);
		hs.add(true);
		
		
		System.out.println(hs);
		
		
	}
}

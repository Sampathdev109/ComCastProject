package com.practiceJAVAcollection;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		
		ArrayList List = new ArrayList();
		
		List.add(10);
		List.add(20);
		List.add(20);
		List.add("dom");
		List.add("dom");
		List.add("ram");
		List.add("sita");
		List.add(List);
		List.add(null);
		List.add(null);
		List.add(true);
		
		System.out.println(List);
		
		
		
	}
}

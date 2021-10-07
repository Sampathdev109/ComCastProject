package com.practiceJAVAmap;

import java.util.HashMap;

public class HashMap1 {
public static void main(String[] args) {
		
		HashMap hm = new HashMap();
		hm.put(10,100);
		hm.put(20,200);
		hm.put(20,300);
		hm.put(45,200);
		hm.put("dom", 400);
		hm.put("dom",500);
		hm.put("ram",600);
		hm.put("sita",700);
		hm.put(hm,900);
		hm.put(100,100);
		//hm.put(hm,800);
		hm.put('a',800);
		hm.put(null,1000);
		hm.put(null,1100);
		hm.put(true,1100);
		
		
		System.out.println(hm);
		

}}

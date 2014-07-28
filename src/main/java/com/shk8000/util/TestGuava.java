package com.shk8000.util;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class TestGuava {
	
	public static void main(String[] args){
		Multimap<String, String> pb = ArrayListMultimap.create();
		pb.put("a", "123");
		pb.put("a", "987");
		System.out.println(pb.get("a"));
	}

}

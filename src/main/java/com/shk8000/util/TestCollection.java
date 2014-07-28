package com.shk8000.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class TestCollection {
	
	public static void main(String[] args){
		List<String> list = new ArrayList<String>();
		for (int i=0; i<20; i++){
			list.add("test"+i);
		}
		for (String s : list){
			System.out.println(s);
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		Collections.shuffle(list);
		for (String s : list){
			System.out.println(s);
		}
		
		int[] tl = new int[]{1,2,3,4};
		tl=Arrays.copyOf(tl, 10);
		tl[6]=12;
		System.out.println(tl[6]+"   "+tl[3]+"  "+tl[8]);
		
		stu[] astu = new stu[3];
		astu[0]=new stu(1,"aa");
		astu[1]=new stu(2,"bb");
		astu[2]=new stu(3,"cc");
		
		stu[] bstu=Arrays.copyOf(astu, 3);
		stu[] cstu=new stu[3];
		System.arraycopy(astu, 0, cstu, 0, 3);
		bstu[1].name = "test";
		System.out.println(astu[1].name+"   "+bstu[1].name+"     "+cstu[1].name);
		
		SortedSet set1 = null;
		
		SortedMap<stu,String> map = new TreeMap<stu,String>();
		
		Set<stu> set = new TreeSet<stu>();
		set.add(new stu(23,"aa"));
		set.add(new stu(25,"bb"));
		
		for (stu s : set){
			System.out.println(s.name);
		}
		
		map.put(new stu(26,"aa"), "test1");
		map.put(new stu(25,"bb"), "test2");
//		map.firstKey().age=42;
		Set<stu> setr = map.keySet();
		for (stu s : setr){
			System.out.println(map.get(s)+"   "+s.age);
		}
		map.put(new stu(2,"bb"), "test3");
		for (stu s : setr){
			System.out.println(map.get(s)+"   "+s.age);
		}
	}

}

class stu implements Comparable<stu>{
	public int age;
	public String name;
	
	public stu(int age, String name){
		this.age=age;
		this.name=name;
	}
	
	public int compareTo(stu s){
		return age-s.age;
	}
}

package com.shk8000.util;

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;

public class testJoda {
	
	public static void main(String[] args){
		MutableDateTime dt = new MutableDateTime();
		dt.addDays(2);
		System.out.println(dt.toString());
		
		DateTime dt1 = new DateTime();
		System.out.println(dt1.plusDays(6).dayOfWeek().get());
	}

}

package com.shk8000.util;

import java.text.DecimalFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;



public class TestJson {
	
	public static void main(String[] args){
		
		String result = "[{\"ngroups\":5,\"groups\":[{\"group\":[{\"name\":\"test\",\"age\":1}]},{\"group\":[{\"name\":\"test1\",\"age\":11}]}]}]";
//		JSONObject jo = JSONObject.fromObject(result);
//		System.out.println(jo.get("groups"));
//		JSONArray ja = (JSONArray)jo.get("groups");
//		System.out.println(ja.get(0));
//		JSONObject joo = (JSONObject)ja.get(1);
//		System.out.println(joo.get("age"));
		
		List lis = new LinkedList();
		
		JSONArray ja = JSONArray.fromObject(result);
		JSONObject jo = (JSONObject)ja.get(0);
		JSONArray jaa = (JSONArray)jo.get("groups");
		List<Map> list = JSONArray.toList(jaa, Map.class);
		System.out.println(ja.get(0));
		for (Map map : list){
//			JSONArray jj = (JSONArray)map.get("group");
			System.out.println(map.get("group"));
		}
		for (int i=0; i<jaa.size(); i++){
			System.out.println(jaa.get(i));
		}
		
		System.out.println(Math.pow(2, 31));
		
		Object t = 5.00;
//		Float d = (Float) t;
		DecimalFormat df = new DecimalFormat("#0.00");
		System.out.println(df.format(t));
		
		int tt = 5;
		System.out.println((double)tt);
	}

}


class MObject{
	String ngroups;
	
}
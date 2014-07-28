package com.shk8000.util;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class TestWeiZhang {
	
	public static void main(String[] args) throws Exception{
		
		StringBuilder sb = new StringBuilder();
		sb.append("http://weizhang.pahaoche.com/violationdrivecar/query.w");
//		http://weizhang.pahaoche.com/weizhang.w
		String requester = "3";
		String user = "wangyi";
		String pwd = "4f557664fdcdc9b915433999564c4747";
		String shopSign = "粤AE307L";
		String voitureNo = "316760";
		String engineNo = "5763";
		String carType = "01";
		String province = "广东省";
		String cityName = "广州市";
		
		try {
			sb.append("?requester=").append(requester).append("&user=").append(user).append("&pwd=").append(pwd)
			.append("&shopSign=").append(URLEncoder.encode(shopSign, "UTF-8"))
			.append("&province=").append(URLEncoder.encode(province, "UTF-8"))
			.append("&cityName=").append(URLEncoder.encode(cityName, "UTF-8"))
//			.append("&shopSign=").append(URLEncoder.encode(URLEncoder.encode(shopSign, "UTF-8"), "UTF-8"))
//			.append("&province=").append(URLEncoder.encode(URLEncoder.encode(province, "UTF-8"), "UTF-8"))
//			.append("&cityName=").append(URLEncoder.encode(URLEncoder.encode(cityName, "UTF-8"), "UTF-8"))
			.append("&voitureNo=").append(voitureNo).append("&engineNo=").append(engineNo).append("&carType=").append(carType);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(sb.toString());
		
		DefaultHttpClient httpclient = new DefaultHttpClient();
		
		
		HttpGet httpGet = new HttpGet(sb.toString());
        HttpResponse responseT;
		try {
			responseT = httpclient.execute(httpGet);
			HttpEntity entity = responseT.getEntity();
	        String json = EntityUtils.toString(entity, "UTF-8");
	        System.out.println(json);
	        
//	        JSONObject jo = JSON.parseObject(json);
//	        JSONArray regulations = (JSONArray)jo.get("regulations");
//	        for (int i=0; i<regulations.size(); i++){
////	        	System.out.println(regulations.get(i));
//	        	JSONObject joo = JSON.parseObject(JSON.toJSONString(regulations.get(i)));
//	        	System.out.println(joo.get("regulationName")+"     "+joo.get("violationTime"));
//	        }
	        
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
	}

}

package com.shk8000.util;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.lang.StringEscapeUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.CoreProtocolPNames;
import org.apache.http.util.EntityUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shk8000.controller.TestBean;

public class Test {
	
	static int c=0;
	
	private final Map map = new LinkedHashMap();
	
	private AtomicInteger seed = new AtomicInteger(6);
	
	public static void main(String[] args) throws Exception{
		System.out.println("GGGGGGGGGGGG");
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-all.xml");
		TestBean tb = (TestBean)context.getBean("testBean");
//		System.out.println(tb.getName());
//		tb.setName("RRRR");
//		tb.add(5, 2);
//		System.out.println(tb.getName());
//		
//		Test test = new Test();
//		test.seed.set(5);
//		System.out.println(test.seed.get());
		String aa$ = "ffffff";
		System.out.println(aa$);
		
		Object v = "tttt";
		if(v instanceof Object[]){
			System.out.println("GGGG");
		}else{
			System.out.println("GGGG444");
		}

		
		Map<String, String> map = new TreeMap<String, String>();
		List list = new ArrayList();
		map.put("aaa", "123");
		map.put("bbb", "1234");
		map.put("ccc", "1236");
//		for(Map.Entry<String, String> entry:map.entrySet()){  
//            if(entry.getKey().equals("bbb")){  
//                map.remove("bbb");  
//                System.out.println("find tom");  
//            }  
//            else{  
//                System.out.println(entry.getValue());  
//            }  
//        }  
		
//		Set<String> set=map.keySet();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		Iterator ite = list.iterator();
//		while (ite.hasNext()){
//			ite.next();
//		}
//		String s = "abcd";
//		System.out.println(s.substring(4)+"@@  ");
//		printAllArray(s);
		
//		StringBuilder sb = new StringBuilder();
//		sb.append("http://weizhang2.pahaoche.com/violationdrivecar/query.w?");
////		sb.append("shopSign=").append("沪A668A9").append("&voitureNo=&engineNo=&carType=&province=&cityName=&requester=&user=&pwd=");
//		String shopSign = URLEncoder.encode(URLEncoder.encode("京P7V892", "UTF-8"), "UTF-8");
//		String voitureNo = "";
//		String engineNo = "ATK192574";
//		String carType = "01";
//		String province = URLEncoder.encode(URLEncoder.encode("北京市", "UTF-8"), "UTF-8");
//		String cityName = URLEncoder.encode(URLEncoder.encode("北京市", "UTF-8"), "UTF-8");
//		String requester = "3";
//		String user = "wangyi";
//		String pwd = "4f557664fdcdc9b915433999564c4747";
//		sb.append("shopSign=").append(shopSign).append("&voitureNo=").append(voitureNo).append("&engineNo=").append(engineNo).append("&carType=")
//		.append(carType).append("&province=").append(province).append("&cityName=").append(cityName).append("&requester=").append(requester)
//		.append("&user=").append(user).append("&pwd=").append(pwd);
//		System.out.println(sb.toString());
//		//		String urlT = "http://wwwtest.pahaoche.com/violationdrivecar/query.w?shopSign=&voitureNo=&engineNo=&carType=&province=&cityName=&requester=&user=&pwd=";
//		String urlT = sb.toString();
//		DefaultHttpClient httpclient = new DefaultHttpClient();
//		HttpGet httpGet = new HttpGet(urlT);
//        HttpResponse responseT = httpclient.execute(httpGet);
//        HttpEntity entity = responseT.getEntity();
//        String json = EntityUtils.toString(entity, "UTF-8");
//        System.out.println(json);
		
//		if (map instanceof Object){
//			System.out.println("FFFFFFFFFF");
//		}
//		
//		int[] CARTYPE_KEY = { 0x100, 0x80, 0x40, 0x20, 0x10, 0x8, 0x4, 0x2, 0x1 };
//		int c = 0xc0;
//		for (int i = 0; i < 9; i++) {
//			if ((CARTYPE_KEY[i] & c) > 0) {
//				System.out.println(c+"     "+CARTYPE_KEY[i]+"   "+i);
//			}
//		}
		
		
////		String extend2Json = "{太阳镜指数描述=白天能见度差不需要佩戴太阳镜, 旅游指数描述=有降雪感觉稍凉，出行请注意携带雨具。, 舒适度指数描述=, 交通指数=一般, 逛街指数=较不宜, 美发指数描述=天冷头皮干燥，注意使用滋润型护发品。, isToday=true, 交通指数描述=有降雪且路面潮湿，注意保持车距。, 防晒指数描述=涂抹8-12SPF防晒护肤品。, 感冒指数=极易发, 晾晒指数=不宜, 穿衣指数=冷, 紫外线指数描述=辐射弱，涂擦SPF8-12防晒护肤品。, 晾晒指数描述=有降雪，建议在室内晾晒。, 晨练指数描述=有降水，请尽量避免户外晨练。, 路况指数描述=路面湿滑，车辆易打滑，减慢车速。, 路况指数=湿滑, 穿衣指数描述=建议着棉衣加羊毛衫等冬季服装。, 约会指数描述=建议尽量不要去室外约会。, 雨伞指数=带伞, 晨练指数=不宜, 洗车指数=不宜, 紫外线指数=最弱, 划船指数=不适宜, 旅游指数=适宜, 美发指数=一般, 运动指数=较不宜, 防晒指数=弱, 约会指数=较不适宜, 钓鱼指数描述=天气不好，不适合垂钓。, 钓鱼指数=不宜, 感冒指数描述=强降温，天气寒冷，湿度大，极易感冒。, 洗车指数描述=有雨，雨水和泥水会弄脏爱车。, 划船指数描述=天气不好，建议选择别的娱乐方式。, 太阳镜指数=不需要, 舒适度指数=, 运动指数描述=有降雪，请您在室内进行低强度运动。, 化妆指数描述=请选用保湿型霜类化妆品。, 化妆指数=保湿, 逛街指数描述=有降雪，出行记得带雨具和防寒保暖。, 雨伞指数描述=有降雪，带雨伞，避免弄湿衣物着凉。}";
//		String extend2Json = "{太阳镜指数描述=白天能见度差不需要佩戴太阳镜, 旅游指数描述=有降雪感觉稍凉，出行请注意携带雨具。, 舒适度指数描述=test, 交通指数=一般, 逛街指数=较不宜, 美发指数描述=天冷头皮干燥，注意使用滋润型护发品。, isToday=true, 交通指数描述=有降雪且路面潮湿，注意保持车距。, 防晒指数描述=涂抹8-12SPF防晒护肤品。, 感冒指数=极易发, 晾晒指数=不宜, 穿衣指数=冷, 紫外线指数描述=辐射弱，涂擦SPF8-12防晒护肤品。, 晾晒指数描述=有降雪，建议在室内晾晒。, 晨练指数描述=有降水，请尽量避免户外晨练。, 路况指数描述=路面湿滑，车辆易打滑，减慢车速。, 路况指数=湿滑, 穿衣指数描述=建议着棉衣加羊毛衫等冬季服装。, 约会指数描述=建议尽量不要去室外约会。, 雨伞指数=带伞, 晨练指数=不宜, 洗车指数=不宜, 紫外线指数=最弱, 划船指数=不适宜, 旅游指数=适宜, 美发指数=一般, 运动指数=较不宜, 防晒指数=弱, 约会指数=较不适宜, 钓鱼指数描述=天气不好，不适合垂钓。, 钓鱼指数=不宜, 感冒指数描述=强降温，天气寒冷，湿度大，极易感冒。, 洗车指数描述=有雨，雨水和泥水会弄脏爱车。, 划船指数描述=天气不好，建议选择别的娱乐方式。, 太阳镜指数=不需要, 舒适度指数=sdf, 运动指数描述=有降雪，请您在室内进行低强度运动。, 化妆指数描述=请选用保湿型霜类化妆品。, 化妆指数=保湿, 逛街指数描述=有降雪，出行记得带雨具和防寒保暖。, 雨伞指数描述=有降雪，带雨伞，避免弄湿衣物着凉。}";
////		String extend2Json = "{紫外线指数=中等, 划船指数=适宜, 交通指数=良好, 旅游指数=较适宜, 美发指数=一般, 运动指数=适宜, 逛街指数=较不宜, 空气污染扩散指数=中, 约会指数=较不适宜, isToday=true, 钓鱼指数=不宜, 感冒指数=少发, 晾晒指数=适宜, 穿衣指数=炎热, 路况指数=干燥, 舒适度指数=很不舒适, 过敏指数=极不易发, 雨伞指数=不带伞, 晨练指数=较适宜, 化妆指数=防脱水, 洗车指数=适宜}";
////		String extend2Json = "{旅游指数描述=有降水较热，但风较大能缓解湿热感觉。, 交通指数=较好, 舒适度指数描述=天气较热，有雨，暑意未消。, 逛街指数=较不宜, 美发指数描述=注意头发清洁，选用防晒型护发品。, isToday=true, 交通指数描述=有降水且路面潮湿，不宜高速行驶。, 感冒指数=少发, 晾晒指数=不太适宜, 紫外线指数描述=涂擦SPF大于15、PA+防晒护肤品。, 穿衣指数=炎热, 晾晒指数描述=降水可能会淋湿衣物，不适宜晾晒。, 晨练指数描述=室外锻炼请携带雨具。, 路况指数描述=有降水，路面潮湿，请小心驾驶。, 路况指数=潮湿, 穿衣指数描述=建议穿短衫、短裤等清凉夏季服装。, 约会指数描述=建议尽量不要去室外约会。, 雨伞指数=带伞, 晨练指数=较不宜, 洗车指数=不宜, 紫外线指数=中等, 空气污染扩散指数描述=气象条件有利于空气污染物扩散。, 划船指数=不适宜, 旅游指数=较适宜, 美发指数=一般, 运动指数=较不宜, 空气污染扩散指数=良, 约会指数=较不适宜, 钓鱼指数描述=天气太热，不适合垂钓。, 钓鱼指数=不宜, 感冒指数描述=感冒机率较低，避免长期处于空调屋中。, 洗车指数描述=今天有雨，雨水和泥水会弄脏爱车。, 划船指数描述=天气不好，建议选择别的娱乐方式。, 过敏指数描述=应减少外出，外出需采取防护措施。, 舒适度指数=较不舒适, 运动指数描述=有降水，推荐您在室内进行休闲运动。, 过敏指数=易发, 化妆指数描述=请选用防脱水化妆品。, 化妆指数=防脱水, 逛街指数描述=有降水大风，出门注意带雨具并防风。, 雨伞指数描述=有降水，短时间出行不必带伞。}";
//		JSONObject jo = new JSONObject(extend2Json);
//		System.out.println(jo);
//		Iterator itr = jo.keys();
//        while (itr.hasNext()) {
//            String key = (String) itr.next();
//            System.out.println(key+"      "+);
//        }
		
//		String[] arr = {"aa", "price:[100.0 TO 200.9]", "cartype:suv OR cartye:哈哈"};
		String arr = "morecartype:SUV";
//		System.out.println(arr.toString().subSequence(0, arr.toString().length()-2));
		
//		String[] att = arr.split(".");
//		System.out.println(att.length+"    "+att[0]);
		
		String sr = "??CLM119";
		System.out.println(new String(sr.getBytes("utf-8")));
		
		System.out.println(StringEscapeUtils.unescapeHtml("<a>sdfa</a>"));
		
		
		
		
		 String provinceKey = "190";
		 String host = "http://weizhang.pahaoche.com/ajaxCityList.w";
		    StringBuffer sb = new StringBuffer();
//		    sb.append("http://weizhang.pahaoche.com/ajaxCityList.w");
		    if (!StringUtils.isEmpty(provinceKey)) {
		      sb.append("?provinceKey=").append(provinceKey);
		      sb.append("&tokenValue=").append("b0ade902-8237-4796-8470-a1131e96aecf");
		    }

//		    URL url = new URL(sb.toString());
//		    System.out.println(url.getProtocol()+"    "+url.getHost()+"    "+"  "+url.getPath()+"   "+url.getQuery());
//			URI uri = new URI(url.getProtocol(), url.getHost(), url.getPath(), url.getQuery(), null);
//			HttpClient client    = new DefaultHttpClient();
//			HttpGet httpget = new HttpGet(uri);
		    
		    DefaultHttpClient httpclient = new DefaultHttpClient();
		    System.out.println(URLEncoder.encode(sb.toString()));
		    HttpPost httpGet = new HttpPost(host);
		    List<NameValuePair> nvps=new ArrayList<NameValuePair>();
	        nvps.add(new BasicNameValuePair("provinceKey","190"));
	        nvps.add(new BasicNameValuePair("tokenValue","b0ade902-8237-4796-8470-a1131e96aecf"));
	        
	        httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows; U; Windows NT 5.1; zh-CN; rv:1.9.1.2)");
	        httpGet.setHeader("Referer", host);
	          httpGet.getParams().setBooleanParameter(CoreProtocolPNames.USE_EXPECT_CONTINUE, false);
	        httpGet.setEntity(new UrlEncodedFormEntity(nvps, "utf-8"));
		    HttpResponse responseT;
		    String json = "";
		    try {
		      responseT = httpclient.execute(httpGet);
		      
		      HttpEntity entity = responseT.getEntity();
		      json = EntityUtils.toString(entity, "UTF-8");
		    } catch (ClientProtocolException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    } catch (IOException e) {
		      // TODO Auto-generated catch block
		      e.printStackTrace();
		    }
		    
		    System.out.println(json);
	}
	
	private static void printAllArray(String s) {  
        printAllArray(s, "");  
        LinkedHashMap lm = new LinkedHashMap(); 
        String[] sarr = {"aa", "bb", "cc", "dd"};
        Arrays.sort(sarr);
    }  
  
    private static void printAllArray(String s, String n) {  
        if (s.length() == 0) {  
            System.out.println(n + "  ---  " + ++c);  
        } else {  
            for (int i = 0; i < s.length(); ++i) {  
                printAllArray(s.substring(1), n + s.charAt(0));  
                s = s.substring(1) + s.charAt(0);  
            }  
        }  
    }

}

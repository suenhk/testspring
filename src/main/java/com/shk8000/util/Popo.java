package com.shk8000.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.commons.lang.StringUtils;

public class Popo {

	private static final String CORP_POPO_URL = "http://220.181.29.178:5820/popo";

	private static String[] users = new String[] { "bjhksun@corp.netease.com" };

	public static void send(String message) {
		send(users, message);
	}

	public static void send(String[] users, String message) {

		if (StringUtils.isNotEmpty(message)) {
            message = message.replace("【", "[");
            message = message.replace("】", "]");
            message = message.replace("。", ".");
            message = message.replace("，", ",");
            message = message.replace("‘", "'");
            message = message.replace("’", "'");
		}

		if (users != null) {
			for (int i = 0, n = users.length; i < n; i++) {
				if (users[i] != null && !users[i].equals("")) {
					sendPopoToCorp(users[i], message);
				}
			}
		}
	}

    /**
     * 给泡泡发消息 post方式提交.
     * 
     * @param to
     *            String 接收人
     * @param msg
     *            String 信息内容
     * @return int 返回值
     */
	public static int sendPopoToCorp(String to, String msg) {
		if (StringUtils.isBlank(to) || StringUtils.isBlank(msg)) {
			return -1;
		}

		try {
			URL postURL = new URL(CORP_POPO_URL);
			HttpURLConnection conn = (HttpURLConnection)postURL.openConnection();
			// Set properties for the HTTP connection
			conn.setUseCaches(false); // do not use cache
			conn.setDoOutput(true); // use for output
			conn.setDoInput(true); // use for Input
			conn.setRequestMethod("POST");

			OutputStream os = conn.getOutputStream();

			StringBuilder sb = new StringBuilder();
			sb.append("account=").append(to);
			sb.append("&msg=").append(msg);
			os.write(sb.toString().getBytes("GBK"));
			os.close();

			BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine = "";
			String resultsPage = "";

			while ((inputLine = in.readLine()) != null) {
				resultsPage += inputLine;
			}
			in.close();
			conn.disconnect();
			if (resultsPage == null || resultsPage.equals("")) {
				return 0;
			} else {
				return Integer.parseInt(resultsPage);
			}

		} catch (Exception e) {
			e.printStackTrace();
			return -2;
		}
	}

	public static void main(String args[]) {
		 Popo.send(new String[] { "bjhksun@corp.netease.com" }, "test");

	}
}


package com.wangmin.java.weatherapp.net;

import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.wangmin.java.weatherapp.model.WeatherInfo;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * 项目名称：WeatherAPP
 * 类描述：
 * 创建人：王珉
 * 创建时间：2019-06-19 15:52
 * 修改人：王珉
 * 修改时间：2019-06-19 15:52
 * 修改备注：
 */
public class NetUtils {
    private static final String APPKEY = "3fa5749078d300a1c8069497695ffd8e";
    private static final String DEF_CHATSET = "UTF-8";
    private static final int DEFAILT_CONN_TIMEOUT = 30000;
    private static final int DEF_READ_TIMEOUT = 30000;
    private static final String userAgent = "Mozilla/5.0 (Windows NT 6.1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/29.0.1547.66 Safari/537.36";
    
    
    public static void requestWetherInfo(final String cityName, final IRequstInfo iRequstInfo) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                Map<String, String> params = new HashMap<>();
                params.put("cityname", cityName);
                params.put("key", APPKEY);
                params.put("dtype", "json");
                String result = null;
                try {
                    result = request(URL_Constant.WEATHER_URL, params, "GET");
                    Gson gson = new GsonBuilder().create();
                    Log.i("infoStr", result);
                    JSONObject jsonObject = new JSONObject(result);
                    WeatherInfo info = null;
                    if (jsonObject.getInt("error_code") == 0) {
                        info = gson.fromJson(result, WeatherInfo.class);
                    }
                    if (iRequstInfo != null) {
                        iRequstInfo.getInfo(info);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
        
        
    }
    
    /**
     * 格式化参数数据
     *
     * @param data
     * @return
     */
    private static String urlEncode(Map<String, String> data) {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry i : data.entrySet()) {
            try {
                sb.append(i.getKey()).append("=").append(URLEncoder.encode(i.getValue() + "", "UTF-8")).append("&");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return sb.toString();
    }
    
    
    private static String request(String urlStr, Map params, String method) {
        HttpURLConnection conn = null;
        BufferedReader reader = null;
        String rs = null;
        try {
            StringBuilder sb = new StringBuilder();
            if (method == null || method.equals("GET")) {
                urlStr = urlStr + "?" + urlEncode(params);
            }
            URL url = new URL(urlStr);
            conn = (HttpURLConnection) url.openConnection();
            if (method == null || method.equals("GET")) {
                conn.setRequestMethod("GET");
            } else {
                conn.setRequestMethod("POST");
                conn.setDoInput(true);
            }
            conn.setRequestProperty("User-agent", userAgent);
            conn.setUseCaches(false);
            conn.setConnectTimeout(DEFAILT_CONN_TIMEOUT);
            conn.setReadTimeout(DEF_READ_TIMEOUT);
            conn.setInstanceFollowRedirects(false);
            
            if (method == null || method.equals("POST")) {
                try {
                    DataOutputStream out = new DataOutputStream(conn.getOutputStream());
                    out.writeBytes(urlEncode(params));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            
            InputStream is = conn.getInputStream();
            reader = new BufferedReader(new InputStreamReader(is, DEF_CHATSET));
            String strRead = null;
            while ((strRead = reader.readLine()) != null) {
                sb.append(strRead);
            }
            rs = sb.toString();
            
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                conn.disconnect();
            }
        }
        return rs;
    }
    
    
    public interface IRequstInfo<T> {
        void getInfo(T info);
    }
}

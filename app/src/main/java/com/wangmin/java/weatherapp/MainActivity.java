package com.wangmin.java.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.wangmin.java.weatherapp.model.WeatherInfo;
import com.wangmin.java.weatherapp.net.NetUtils;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    
    private EditText et_city;
    private TextView tv_weatherInfo;
    private final String WEATHERINFO_FORMAT = "城市：%s\n PM2.5指数：%s\n 空气质量指标：%s\n 空气质量：%s\n pm10:%s\n curPm:%s\n pm25:%s\n 更新时间：%s ";
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_city = findViewById(R.id.et_city);
        findViewById(R.id.btQuery).setOnClickListener(this);
        tv_weatherInfo = findViewById(R.id.weatherInfo);
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btQuery:
                String city = et_city.getText().toString();
                if (TextUtils.isEmpty(city)) {
                    showInfo("请输入您要查询的城市");
                    return;
                }
                
                
                NetUtils.requestWetherInfo(city, new NetUtils.IRequstInfo<WeatherInfo>() {
                    @Override
                    public void getInfo(final WeatherInfo info) {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                if (info != null) {
                                    //一次查询的全部数据：
                                    WeatherInfo.ResultBean.DataBean weatherDataBean = info.getResult().getData();
                                    //实时数据：城市代码，城市名称，当前日前：time date, week,moon, weather(),wind
                                    WeatherInfo.ResultBean.DataBean.RealtimeBean realTime = weatherDataBean.getRealtime();
                                    
                                    //城市
                                    String cityName = realTime.getCity_name();
                                    
                                    //更新时间
                                    String updateTime = realTime.getDate() + "_" + realTime.getTime();
                                    
                                    
                                    WeatherInfo.ResultBean.DataBean.Pm25BeanX.Pm25Bean pm25Bean = weatherDataBean.getPm25().getPm25();
                                    int pm25Level = pm25Bean.getLevel();
                                    String airQuality = pm25Bean.getQuality();
                                    String airQualityDes = pm25Bean.getDes();
                                    String pm10 = pm25Bean.getPm10();
                                    String curPm = pm25Bean.getCurPm();
                                    String pm25 = pm25Bean.getPm25();
                                    
                                    
                                    tv_weatherInfo.setText(String.format(WEATHERINFO_FORMAT,
                                        cityName, pm25Level, airQuality, airQualityDes, pm10, curPm, pm25, updateTime));
                                    
                                } else {
                                    showInfo("查询失败");
                                }
                            }
                        });
                        
                    }
                });
        }
    }
    
    
    private void showInfo(String errorInfo) {
        Toast.makeText(this, errorInfo, Toast.LENGTH_SHORT).show();
    }
}

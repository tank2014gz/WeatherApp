package com.wangmin.java.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * 项目名称：WeatherAPP
 * 类描述：
 * 创建人：王珉
 * 创建时间：2019-06-19 12:31
 * 修改人：王珉
 * 修改时间：2019-06-19 12:31
 * 修改备注：
 */
public class SplashActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_layout);
        
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                SplashActivity.this.startActivity(intent);
                finish();
            }
        }, 3000);
    }
}

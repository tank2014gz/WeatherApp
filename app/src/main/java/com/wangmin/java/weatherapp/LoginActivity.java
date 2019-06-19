package com.wangmin.java.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.wangmin.java.weatherapp.db.DBManager;
import com.wangmin.java.weatherapp.model.UserInfo;
import com.wangmin.java.weatherapp.utils.SoftKeyboardUtil;

import org.simple.eventbus.EventBus;
import org.simple.eventbus.Subscriber;


/**
 * 项目名称：WeatherAPP
 * 类描述：
 * 创建人：王珉
 * 创建时间：2019-06-19 11:59
 * 修改人：王珉
 * 修改时间：2019-06-19 11:59
 * 修改备注：
 */
public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
    
    private EditText et_input_username, et_input_password;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layout);
        et_input_username = findViewById(R.id.et_input_name);
        et_input_password = findViewById(R.id.et_input_password);
        findViewById(R.id.btLogin).setOnClickListener(this);
        findViewById(R.id.btRegister).setOnClickListener(this);
        
        EventBus.getDefault().register(this);
    }
    
    @Override
    protected void onResume() {
        super.onResume();
        if (et_input_username != null) {
            et_input_username.requestFocus();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    SoftKeyboardUtil.showSoftKeyboard(et_input_username);
                }
            }, 300);
            
            
        }
    }
    
    @Override
    protected void onPause() {
        super.onPause();
        if (et_input_username != null) {
            et_input_username.clearFocus();
            SoftKeyboardUtil.hideSoftKeyboard(et_input_username);
        }
    }
    
    @Override
    public void onClick(View v) {
        
        switch (v.getId()) {
            case R.id.btLogin:
                String name = et_input_username.getText().toString();
                String pwd = et_input_password.getText().toString();
                
                if (TextUtils.isEmpty(name)) {
                    showInfo("用户名不能为空");
                    return;
                }
                if (TextUtils.isEmpty(pwd)) {
                    showInfo("密码不能为空");
                    return;
                }
                
                UserInfo userInfo = DBManager.getDbManager(this.getApplication()).queryUser(name);
                if (userInfo == null) {
                    showInfo("当前用户没有注册，请注册后登录");
                    return;
                }
                UserInfo inputUser = new UserInfo(name, pwd);
                if (!inputUser.equals(userInfo)) {
                    showInfo("输入用户名或密码有误，请重新输入");
                    return;
                }
                
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btRegister:
                
                intent = new Intent(this, ReigisterActivity.class);
                startActivity(intent);
                break;
        }
        
    }
    
    
    private void showInfo(String errorInfo) {
        Toast.makeText(this, errorInfo, Toast.LENGTH_SHORT).show();
    }
    
    @Override
    protected void onDestroy() {
        super.onDestroy();
        EventBus.getDefault().unregister(this);
    }
    
    @Subscriber(tag = "register")
    public void registerSuccess(int state) {
        finish();
    }
}

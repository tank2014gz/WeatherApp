package com.wangmin.java.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.wangmin.java.weatherapp.db.DBManager;
import com.wangmin.java.weatherapp.model.UserInfo;
import com.wangmin.java.weatherapp.utils.SoftKeyboardUtil;

import org.simple.eventbus.EventBus;

/**
 * 项目名称：WeatherAPP
 * 类描述：
 * 创建人：王珉
 * 创建时间：2019-06-19 11:59
 * 修改人：王珉
 * 修改时间：2019-06-19 11:59
 * 修改备注：
 */
public class ReigisterActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText et_input_username, et_input_password, et_input_password_again;
    
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        et_input_username = findViewById(R.id.et_input_name);
        et_input_password = findViewById(R.id.et_input_password);
        et_input_password_again = findViewById(R.id.et_input_password_again);
        
        findViewById(R.id.btRegister).setOnClickListener(this);
        findViewById(R.id.btBack).setOnClickListener(this);
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
            case R.id.btRegister:
                String name = et_input_username.getText().toString();
                String pwd = et_input_password.getText().toString();
                String pwdAgain = et_input_password_again.getText().toString();
                if (TextUtils.isEmpty(name)) {
                    showInfo("用户名不能为空");
                    return;
                }
                if (TextUtils.isEmpty(pwd)) {
                    showInfo("密码不能为空");
                    return;
                }
                if (!TextUtils.equals(pwd, pwdAgain)) {
                    showInfo("两次密码不一致，请重新输入");
                    return;
                }
                
                UserInfo info = DBManager.getDbManager(this.getApplication()).queryUser(name);
                
                if (info != null) {
                    showInfo("该用户已经被注册");
                    return;
                }
                
                int state = DBManager.getDbManager(this.getApplication()).userRegister(name, pwd);
                if (state == -1) {
                    showInfo("注册失败");
                    return;
                }
                EventBus.getDefault().post(1,"register");
                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);
                finish();
                break;
            case R.id.btBack:
                finish();
                break;
        }
    }
    
    private void showInfo(String errorInfo) {
        Toast.makeText(this, errorInfo, Toast.LENGTH_SHORT).show();
    }
    
   
}

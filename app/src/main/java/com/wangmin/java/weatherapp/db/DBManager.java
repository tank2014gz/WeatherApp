package com.wangmin.java.weatherapp.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import android.util.Log;

import com.wangmin.java.weatherapp.model.UserInfo;

/**
 * 项目名称：WeatherAPP
 * 类描述：
 * 创建人：王珉
 * 创建时间：2019-06-19 13:37
 * 修改人：王珉
 * 修改时间：2019-06-19 13:37
 * 修改备注：
 */
public class DBManager {
    
    private static DBManager dbManager;
    private DBHelper mHelper;
    private SQLiteDatabase mDatabase;
    
    private DBManager(Context context) {
        mHelper = new DBHelper(context);
        mDatabase = mHelper.getWritableDatabase();
    }
    
    /**
     * @param context--- Application类型的Context
     * @return
     */
    public static DBManager getDbManager(Context context) {
        if (dbManager == null) {
            synchronized (DBManager.class) {
                if (dbManager == null) {
                    dbManager = new DBManager(context);
                }
            }
        }
        return dbManager;
    }
    
    
    /**
     * 用户注册
     *
     * @param name
     * @param password
     */
    public int userRegister(String name, String password) {
        try {
            ContentValues values = new ContentValues();
            values.put(DBHelper.NAME, name);
            values.put(DBHelper.PASSWORD, password);
            mDatabase.insert(DBHelper.TABLE_NAME, null, values);
            return 1;
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        
    }
    
    
    /**
     * 根据用户名删除数据
     *
     * @param userName
     */
    public void deleteUserInfo(String userName) {
        try {
            int count = mDatabase.delete(DBHelper.TABLE_NAME, DBHelper.NAME + " = ?", new String[]{userName});
            Log.d("delete", "删除成功" + count);
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * 修改用户名
     *
     * @param userName
     * @param newName
     */
    public void updateData(String userName, String newName) {
        try {
            ContentValues values = new ContentValues();
            values.put(DBHelper.NAME, newName);
            int count = mDatabase
                .update(DBHelper.TABLE_NAME, values, DBHelper.NAME + " = ?", new String[]{userName});
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    /**
     * 查询用户信息
     */
    
    public UserInfo queryUser(String userName) {
        UserInfo userInfo = null;
        
        if (TextUtils.isEmpty(userName)) {
            return null;
        }
        String selection=DBHelper.NAME + "= ?";
        
        try (Cursor cursor = mDatabase.query(DBHelper.TABLE_NAME,
            new String[]{DBHelper.NAME,DBHelper.PASSWORD},selection ,new String[]{userName}, null, null, null)) {
            // 注意空格！
            
            int nameIndex = cursor.getColumnIndex(DBHelper.NAME);
            int pwdIndex = cursor.getColumnIndex(DBHelper.PASSWORD);
            if (cursor.getCount() > 0) {
                while (cursor.moveToNext()) {
                    String name = cursor.getString(nameIndex);
                    String pwd = cursor.getString(pwdIndex);
                    userInfo = new UserInfo(userName, pwd);
                    Log.d("query", "name: " + name + ", pwd: " + pwd);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return userInfo;
        }
        
    }
    
}

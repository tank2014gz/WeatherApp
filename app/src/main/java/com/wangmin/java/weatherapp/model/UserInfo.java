package com.wangmin.java.weatherapp.model;

/**
 * 项目名称：WeatherAPP
 * 类描述：
 * 创建人：王珉
 * 创建时间：2019-06-19 13:57
 * 修改人：王珉
 * 修改时间：2019-06-19 13:57
 * 修改备注：
 */
public class UserInfo {
    private String userName;
    private String userPwd;
    
    public UserInfo(String userName, String userPwd) {
        this.userName = userName;
        this.userPwd = userPwd;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getUserPwd() {
        return userPwd;
    }
    
    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }
    
    @Override
    public String toString() {
        return "UserInfo{" +
            "userName='" + userName + '\'' +
            ", userPwd='" + userPwd + '\'' +
            '}';
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        
        UserInfo userInfo = (UserInfo) o;
        
        if (!userName.equals(userInfo.userName)) {
            return false;
        }
        return userPwd.equals(userInfo.userPwd);
    }
    
    @Override
    public int hashCode() {
        int result = userName.hashCode();
        result = 31 * result + userPwd.hashCode();
        return result;
    }
}

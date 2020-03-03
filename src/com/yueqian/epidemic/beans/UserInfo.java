package com.yueqian.epidemic.beans;

public class UserInfo {
    private Integer userId;
    private String account;
    private String password;
    private String userName;

    public Integer getUserId() {
        return userId;
    }

    public String getAccount() {
        return account;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserInfo() {
    }

    public UserInfo(Integer userId, String account, String password, String userName) {
        this.userId = userId;
        this.account = account;
        this.password = password;
        this.userName = userName;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}

package com.data;

public class UserLogin {

    private String loginName;
    private String password;
    private String nameUser;
    private String tel;

    public UserLogin(String loginName, String password, String nameUser, String tel){
        this.loginName = loginName;
        this.password = password;
        this.nameUser = nameUser;
        this.tel = tel;
    }
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

}

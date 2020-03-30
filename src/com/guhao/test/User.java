package com.guhao.test;

import java.util.List;

/**
 * @Author guhao
 * @DateTime 2019-11-18 13:55
 * @Description
 **/
public class User {

    @ExcelColumn(name = "姓名",order=1,types = { ExcelType.TSP_MULTI_SUPPORT })
    private String username;
    @ExcelColumn(name = "密码",order=2,types = { ExcelType.TSP_TECH_MANAGER })
    private String password;
    private List<UserDetail> userDetails;
    private int test;

    public int getTest() {
        return test;
    }

    public void setTest(int test) {
        this.test = test;
    }

    public List<UserDetail> getUserDetails() {
        return userDetails;
    }

    public void setUserDetails(List<UserDetail> userDetails) {
        this.userDetails = userDetails;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

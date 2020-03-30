package com.guhao.test;

/**
 * @Author guhao
 * @DateTime 2019-11-18 13:55
 * @Description
 **/
public class UserDetail {
    @ExcelColumn(name = "年龄",order=3,types = { ExcelType.TSP_MULTI_SUPPORT,ExcelType.TSP_TECH_MANAGER })
    private String age;
    @ExcelColumn(name = "生日",order=4,types = { ExcelType.TSP_MULTI_SUPPORT,ExcelType.TSP_TECH_MANAGER } )
    private String birthday;
    @ExcelColumn(name = "性别",order=5,types = { ExcelType.TSP_MULTI_SUPPORT,ExcelType.TSP_TECH_MANAGER })
    private String sex;

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

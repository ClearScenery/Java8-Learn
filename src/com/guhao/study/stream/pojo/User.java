package com.guhao.study.stream.pojo;

/**
 * @Author guhao
 * @DateTime 2019-10-22 9:58
 * @Description
 **/
public class User {
    private Integer age;
    private boolean male;
    private String name;

    public User() {
    }

    public User(Integer age, boolean male, String name) {
        this.age = age;
        this.male = male;
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", male=" + male +
                ", name='" + name + '\'' +
                '}';
    }
}

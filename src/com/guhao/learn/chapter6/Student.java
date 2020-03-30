package com.guhao.learn.chapter6;

/**
 * @Author guhao
 * @DateTime 2019-12-06 8:54
 * @Description
 **/
public class Student {
    private String name;
    private Integer age;
    private String sex;
    private Double score;
    private Boolean status;

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Student(String name, Integer age, String sex, Double score, Boolean status) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.score = score;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                ", status=" + status +
                '}';
    }
}

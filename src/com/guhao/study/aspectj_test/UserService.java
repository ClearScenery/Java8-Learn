package com.guhao.study.aspectj_test;

/**
 * @Author guhao
 * @DateTime 2019-10-25 14:50
 * @Description
 **/
public class UserService {

    public static void main(String[] args) {
        User user = new User();
        user.setUserName("test");
        UserService userService = new UserService();
        userService.getUser(user);
    }

    public User getUser(User user){
        return user;
    }
}

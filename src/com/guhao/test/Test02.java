package com.guhao.test;

import java.io.File;
import java.lang.reflect.Field;
import java.util.*;

/**
 * @Author guhao
 * @DateTime 2019-11-21 9:02
 * @Description
 **/
public class Test02 {

    private Class clazz;

    public static void main(String[] args) {

        Test02 test02 = new Test02();
        test02.setClazz(User.class);

        List<UserDetail> userDetails = new ArrayList<>();

        UserDetail ud1 = new UserDetail();
        ud1.setSex("male");
        ud1.setBirthday("2018-01-01");
        ud1.setAge("18");
        userDetails.add(ud1);

        UserDetail ud2 = new UserDetail();
        ud2.setSex("male");
        ud2.setBirthday("2018-01-02");
        ud2.setAge("19");
        userDetails.add(ud2);

        UserDetail ud3 = new UserDetail();
        ud3.setSex("male");
        ud3.setBirthday("2018-01-03");
        ud3.setAge("20");
        userDetails.add(ud3);

        User u1 = new User("zhangsan","123");
        u1.setUserDetails(userDetails);
        User u2 = new User("lisi","123");
        u2.setUserDetails(userDetails);
        User u3 = new User("wangwu","123");
        u3.setUserDetails(userDetails);

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);

        test02.export(users,ExcelType.TSP_MULTI_SUPPORT);
    }

    public  Map<Integer,String> export(List<User> list,ExcelType excelType){
        Field[] declaredFields = this.clazz.getDeclaredFields();
        for (Field field:declaredFields){
//            System.out.println(field);
//            ExcelColumn annotation = field.getAnnotation(ExcelColumn.class);
//            if(annotation!=null){
//                System.out.println(Arrays.asList(annotation.types()).contains(excelType));
//            }
            if(field.getType().getSimpleName().equals("List")){
                System.out.println(field.getGenericType().toString().replaceAll("(java.util.List)|<|>",""));

            }

//            System.out.println(field.getType());
//            System.out.println(field.getType().getSimpleName());
        }
        return null;
    }

    public Class getClazz() {
        return clazz;
    }

    public void setClazz(Class clazz) {
        this.clazz = clazz;
    }
}

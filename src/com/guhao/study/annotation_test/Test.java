package com.guhao.study.annotation_test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author guhao
 * @DateTime 2019-10-24 18:02
 * @Description
 **/
public class Test {
    public static void main(String[] args) {
        UserService userService = (UserService)TestProxy.getProxyObj(new UserServiceImpl());
        userService.testTimeCount();
        try {
            userService.testErrorLog();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Pojo po = (Pojo)TestAutoValue.get(Pojo.class);
        System.out.println(po);

    }
}

class TestProxy{
    public static <T> Object getProxyObj(T t) {
        Class clazz = t.getClass();

        return (T) Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(),(proxy,method,args) -> {

            Method subMethod = clazz.getDeclaredMethod(method.getName(), method.getParameterTypes());

            Object o = clazz.newInstance();

            if(subMethod.isAnnotationPresent(ErrorLog.class)){
                try{
                    method.invoke(o,args);
                }catch (Exception e){
                    System.out.println("检查到异常!");
                }
            }

            if(subMethod.isAnnotationPresent(TimeCount.class)){
                long start = System.currentTimeMillis();
                method.invoke(o,args);
                long end = System.currentTimeMillis();
                System.out.println("用时："+(end - start));
            }

            return o;
        });
    }
}



class TestAutoValue{
    public static <T> Object get(Class clazz){
        Object o = null;
        try {
            o = clazz.newInstance();
            Field[] fields = clazz.getDeclaredFields();
            for(Field field : fields){
                field.setAccessible(true);
                if(field.isAnnotationPresent(AutoValue.class)){
                    AutoValue annotation = field.getAnnotation(AutoValue.class);
                    field.set(o,annotation.value());
                }
            }

        }catch (Exception e){}
        return o;
    }
}

class Pojo{
    @AutoValue(value="name")
    private String name;

    @AutoValue
    private String nickName;

    @Override
    public String toString() {
        return "Pojo{" +
                "name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

class UserServiceImpl implements UserService{

    //暂时没想明白
    private Pojo pojo;

    @TimeCount
    public void testTimeCount(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @ErrorLog
    public void testErrorLog() throws Exception  {
        throw new Exception();
    }
}

interface UserService{
    void testTimeCount();
    void testErrorLog() throws Exception;
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface TimeCount {
}


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ErrorLog {
}


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@interface AutoValue {
    String value() default "default name";
}
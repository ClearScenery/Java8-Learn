package com.guhao.test;

import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author guhao
 * @DateTime 2019-11-18 14:10
 * @Description
 **/
public class ExcelUtils {

    private Class clazz;

    public static ExcelUtils getInstance(Class clazz) {
        return new ExcelUtils(clazz);
    }

    private ExcelUtils(Class clazz) {
        super();
        this.clazz = clazz;
    }

    public void generate(){
//        Field[] fields = clazz.getDeclaredFields();
//        Map<String, String> fieldInfos = new LinkedHashMap<String, String>();
//        for (Field field : fields) {
//            String fieldName = field.getName();
//            ExcelColumn excelField = field.getAnnotation(ExcelColumn.class);
//            if (excelField != null) {
//                fieldInfos.put(fieldName, excelField.name());
//            }
//        }
    }
}

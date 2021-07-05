package com.xiao.demo.AnnotationDemo;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/*
反射调用注解
 */
public class AnnotationDemo02 {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        System.out.println("111 = " + 111);
        Class aClass = Class.forName("com.xiao.demo.AnnotationDemo.tableXiao");
        //反射获得注解
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("annotation = " + annotation);
        }
        // 获取value
        Table annotation = (Table)aClass.getAnnotation(Table.class);
        String value = annotation.value();
        System.out.println("value = " + value);

        // 获取字段
        Field id = aClass.getDeclaredField("id");
        column annotation1 = id.getAnnotation(column.class);
        String value1 = annotation1.value();
        System.out.println("value1 = " + value1);
        // 或者
        String s = annotation1.ColumnName();
        System.out.println("s = " + s);


    }


}

/*
注解
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Table{
  String value();
}
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface column{
    String ColumnName();
    String value();
}

/*
对应实现
 */
@Table("student")
class tableXiao{
    @column(value = "213",ColumnName = "id")
    private int id;

    public tableXiao(int id) {
        this.id = id;
    }

    public tableXiao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

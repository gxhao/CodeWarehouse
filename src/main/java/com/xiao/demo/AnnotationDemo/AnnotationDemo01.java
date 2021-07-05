package com.xiao.demo.AnnotationDemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;


/*
注解的基本概念
 */
public class AnnotationDemo01 {
    @MyAnnotation(name = "yangGuo")
    public  void  test(){

    }
    @MyAnnotation02("213 ")
    public  void test02(){

    }


}


/*
定义注解
*/
//@Target  注解的使用范围
//@Retention 注解的生命周期  source<class<runtime
//@Document 该注解将被包含在javadoc中
//@Inherited 子类可以继承父类的该注解
@Target(value = ElementType.METHOD)
@interface MyAnnotation{
    // default 表示默认值
    String name() default "";
}
/*
value 可省略前面的key
 */
@Target(ElementType.METHOD)
@interface MyAnnotation02{
    String value();
}
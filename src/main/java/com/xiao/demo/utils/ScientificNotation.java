package com.xiao.demo.utils;

import java.math.BigDecimal;

/**
 * @Author gxhao
 * @Date 2021/7/16 18:21
 * @Description 科学计数法
 * @Param
 * @Return
 * @Since version-1.0
 */
public class ScientificNotation {

    public static void main(String[] args) {
        double num = 1.99714E13;
        System.out.println("num = " + num);
        // 1。String方法
        String result = String .format("%.2f",num);
        System.out.println("result = " + result);
        //2.bigDecimal
        java.text.DecimalFormat   df   =new   java.text.DecimalFormat("#.00");
        String format = df.format(num);
        System.out.println("f1 = " + format);
    }
}

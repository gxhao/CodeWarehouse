package com.xiao.demo.utils.Encryption;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Locale;

public class MD5ForString {

    public static void main(String[] args) {
        String s1 = DigestUtils.md5Hex("**9f038fdf-4206-4d38-85d3-f61323854f4f##");
        // 转换为大写
        String s2 = s1.toUpperCase(Locale.ENGLISH);
        System.out.println("md5 = " + s2);
    }


}

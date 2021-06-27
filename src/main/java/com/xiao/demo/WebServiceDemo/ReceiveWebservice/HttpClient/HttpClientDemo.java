package com.xiao.demo.WebServiceDemo.ReceiveWebservice.HttpClient;


import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;

import java.io.FileInputStream;

public class HttpClientDemo {

    public static void main(String[] args) throws Exception {
        post("13212553644","");
    }

    /**HttpClient访问网络的实现步骤：
     *  1. 准备一个请求客户端:浏览器
     *  2. 准备请求方式： GET 、POST
     *  3. 设置要传递的参数
     *  4.执行请求
     *  5. 获取结果
     */
    //2.Post请求 ：通过Http-Client 框架来模拟实现 Http请求
    public static void post(String mobileCode ,String userID) throws Exception{

        HttpClient client = new HttpClient();
        PostMethod postMethod=new PostMethod("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx/getMobileCodeInfo");
        //3.设置请求参数
        postMethod.setParameter("mobileCode", mobileCode);
        postMethod.setParameter("userID", userID);
        //4.执行请求 ,结果码
        int code=client.executeMethod(postMethod);
        //5. 获取结果
        String result=postMethod.getResponseBodyAsString();
        System.out.println("Post请求的结果："+result);
    }


    //2.Post请求 ：通过Http-Client 框架来模拟实现 Http请求
    public void soap() throws Exception{
        HttpClient client = new HttpClient();
        PostMethod postMethod=new PostMethod("http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx");
        //3.设置请求参数
        postMethod.setRequestBody(new FileInputStream("c:/soap.xml"));
        //修改请求的头部
        postMethod.setRequestHeader("Content-Type", "text/xml; charset=utf-8");
        //4.执行请求 ,结果码
        int code=client.executeMethod(postMethod);
        System.out.println("结果码:"+code);
        //5. 获取结果
        String result=postMethod.getResponseBodyAsString();
        System.out.println("Post请求的结果："+result);
    }

}

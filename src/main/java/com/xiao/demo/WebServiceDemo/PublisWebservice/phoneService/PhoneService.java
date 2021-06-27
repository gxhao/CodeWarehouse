package com.xiao.demo.WebServiceDemo.PublisWebservice.phoneService;

import com.xiao.demo.WebServiceDemo.PublisWebservice.domain.Phone;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

/*
 *手机的业务类，该业务类通过webservice 对外提供服务
 * 1. 声明： @webservice
 * 2. 发布 EndPoint
 */
@WebService(serviceName = "PhoneManager",//修改服务名
        targetNamespace = "http://dd.ws.it.cn") //修改命名空间 ，默认包名，取反
public class PhoneService {


    /**
     * @WebMethod(operationName="getMObileInfo"): 修改方法名
     * @WebResult(name="phone")：修改返回参数名
     * @WebParam(name="osName")：修改输入参数名
     */
    @WebMethod(operationName = "getMObileInfo")
    public @WebResult(name = "phone")
    Phone getPhoneInfo(@WebParam(name = "osName") String osName) {
        Phone phone = new Phone();
        if (osName.endsWith("android")) {
            phone.setName("android");
            phone.setOwner("google");
            phone.setTotal(80);
        }
        else if (osName.endsWith("ios")) {
            phone.setName("ios");
            phone.setOwner("apple");
            phone.setTotal(15);
        }
        else {
            phone.setName("windows phone");
            phone.setOwner("microsoft");
            phone.setTotal(5);
        }
        return phone;
    }

    @WebMethod(exclude = true)//把该方法排除在外
    public void sayHello(String city) {
        System.out.println("你好：" + city);
    }

    private void sayLuck(String city) {
        System.out.println("好友：" + city);
    }

    void sayGoodBye(String city) {
        System.out.println("拜拜:" + city);
    }

    protected void saySayalala(String city) {
        System.out.println("再见！" + city);
    }

    /**
     * 发布webservice服务
     * 1.address：服务的地址
     * 2：implementor 服务的实现对象
     */
    public static void main(String[] args) {
        String address1 = "http://127.0.0.1:8888/ws/phoneService";
        //        String address2="http://127.0.0.1:8888/ws/phoneManager";


        Endpoint.publish(address1, new PhoneService());
//        Endpoint.publish(address2, new PhoneService());
        System.out.println("wsdl地址 :" + address1 + "?WSDL");
    }

}

package com.xiao.demo.WebServiceDemo.ReceiveWebservice.Winsinport;


/**
 * @Author gxhao
 * @Date 2021-06-27 22:32
 * wsimport是Java自带的一个命令，我们想要使用该命令，就必须配置环境变量，并且jdk的版本最好是1.7或以上
 * @Param
 * @Return
 * @Since version-1.0
 */
public class WsimportDemo {
    //使用wsimport -s D:\InstallFile -p com.test.webservice.client -keep http://ws.webxml.com.cn/WebServices/MobileCodeWS.asmx?WSDL
    //-          wsdl_uri:wsdl 的统一资源标识符
    //-          d  ：指定要输出的文件的位置
    //-          s  ：表示要解析java的源码 ，默认解析出的是class字节码
    //-          p  ： 指定输出的包名
    public static void main(String[] args) {
        /*MobileCodeWS webservice4SZJS = new MobileCodeWS();
        MobileCodeWSSoap webservice4SZJSSoap = webservice4SZJS.getMobileCodeWSSoap();
        String todayCDInfo = webservice4SZJSSoap.getMobileCodeInfo("13255446655", "");
        System.out.println(todayCDInfo);*/
    }
}

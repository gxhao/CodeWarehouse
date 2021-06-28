package com.xiao.demo.utils;

import com.xiao.demo.domain.Case;
import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONObject;
import net.sf.json.util.JSONUtils;

/**
 * @Author gxhao
 * @Date 2021-06-28 8:50
 * @Description // 实体类含有date格式，json中为string
 * @Param
 * @Return
 * @Since version-1.0
 */

public class JsonToObject {
    public static void main(String[] args) {
        String json="{\"appDate\":\"2018-09-06 15:03:48\",\"caseId\":0,\"caseName\":\"案件\",\"createDate\":\"2018-09-06 15:03:48\"}";
        //日期转化格式
        String[] dateFormats = new String[] {"yyyy-MM-dd HH:mm:ss"};
        JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(dateFormats));
        JSONObject obj = new JSONObject().fromObject(json);
        Case case1=(Case)JSONObject.toBean(obj , Case.class);
        System.out.println("case1 = " + case1);
    }
}

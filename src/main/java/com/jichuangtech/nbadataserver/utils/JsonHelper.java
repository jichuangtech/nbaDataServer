package com.jichuangtech.nbadataserver.utils;


import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

import java.util.List;
import java.util.Map;

/**
 * Created by Bingo on 16/7/21.
 */
public class JsonHelper {
    //从普通的Bean转换为字符串
    public static String getJson(Object o) {
        JSONObject jo = JSONObject.fromObject(o);
        return jo.toString();
    }

    //从Java的列表转换为字符串
    public static String getJson(List list) {
        JSONArray ja = JSONArray.fromObject(list);
        return ja.toString();
    }

    //从Java对象数组转换为字符串
    public static String getJson(Object[] arry) {
        JSONArray ja = JSONArray.fromObject(arry);
        return ja.toString();
    }

    //从json格式的字符串转换为Map对象
    public static Map getObject(String s) {
        return JSONObject.fromObject(s);
    }

    //从json格式的字符串转换为List数组
    public static List getArray(String s) {
        return JSONArray.fromObject(s);
    }

    //从json格式的字符串转换为某个Bean
    public static Object getObject(String s, Class cls) {
        JSONObject jo = JSONObject.fromObject(s);
        return JSONObject.toBean(jo, cls);
    }

    //从json格式的字符串转换为某类对象的数组
    public static Object getArray(String s, Class cls) {
        JSONArray ja = JSONArray.fromObject(s);
        return JSONArray.toArray(ja, cls);
    }
}

package com.chianing.util;

import com.alibaba.fastjson.JSONObject;

public class LogUtil {

    public static void printBeforeLog(Object data) {
        System.out.println("-------------------");
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.printf("methodName: %s() before,\nparams: %s\n", methodName, JSONObject.toJSONString(data));
    }

    public static void printAfterLog(Object data) {
        String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
        System.out.printf("methodName: %s() done,\nresult: %s\n", methodName, JSONObject.toJSONString(data));
        System.out.println("-------------------");
    }

}

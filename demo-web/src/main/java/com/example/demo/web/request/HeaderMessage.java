package com.example.demo.web.request;


import java.util.HashMap;
import java.util.Map;

/**
 */
public interface HeaderMessage {

    //身份token
    String Authorization = "Authorization";
    //数据加密标识
    String DATA_TYPE = "data-type";
    //签名
    String SIGNATURE = "signature";

    //数据类型标识
    enum Data implements HeaderMessage {
        NONE, //无加密
        ENCRYPT //加密
    }

    default Map<String, String> encoderHeader(String namespace) {
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put(Authorization, namespace);
        headerMap.put(DATA_TYPE, Data.ENCRYPT.name());
        return headerMap;
    }

    default Map<String, String> header(String namespace) {
        Map<String, String> headerMap = new HashMap<>();
        headerMap.put(Authorization, namespace);
        headerMap.put(DATA_TYPE, Data.NONE.name());
        return headerMap;
    }


}

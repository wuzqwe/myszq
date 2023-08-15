package com.szq.myszq.common;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class R<T>{

    private Integer code;  //0失败，1成功

    private T data;//数据

    private String msg; //错误信息

    private Map map=new HashMap(); //添加动态数据

    public static<T> R<T> success(T object){
        R<T> r = new R<>();
        r.code=1;
        r.data=object;
        return r;
    }

    public static R error(String msg){
        R r = new R<>();
        r.code=0;
        r.msg=msg;
        return r;
    }

    public R<T> add(String key, Object value){
        this.map.put(key,value);
        return this;
    }
}

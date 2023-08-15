package com.szq.myszq;

import com.szq.myszq.common.R;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
public class TestR {

    @Test
    void testR() {
        R<String> sda = R.success("sda");
        System.out.println(sda.getCode());
        System.out.println(sda.getMap());
        System.out.println(sda.getData());

        System.out.println(R.success("Nhao"));
        System.out.println(R.error("错误信息"));
        R<Object> r = new R<>();
        r.add("你好",1);
        System.out.println();

        List list=new ArrayList();
        list.add(1);
        list.add(2);

        R<List> success = R.success(list);
        System.out.println(success.getData());

        Map map=new HashMap();
        map.put(1,"23");
        map.put(2,"33");
        R<Map> success1 = R.success(map);
        System.out.println(success1);

    }
}

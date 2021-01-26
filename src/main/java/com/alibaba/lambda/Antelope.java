package com.alibaba.lambda;

import com.google.common.collect.Lists;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @Author Romeo
 * @Date 2021/1/24 23:52
 * @Version 1.0
 */
public class Antelope {

    public static void main(String[] args) {
        ArrayList<String> list = Lists.newArrayList("CPU", "RAM", "ROM", "Hard Disk", "monitor", "chip");
        String strip = StringUtils.strip(String.valueOf(list), "[]");
        System.out.println(list);
        System.out.println(strip);
        List<String> list1 = Collections.singletonList(strip);
        System.out.println(list1);
    }
}

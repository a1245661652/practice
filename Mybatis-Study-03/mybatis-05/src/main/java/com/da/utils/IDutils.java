package com.da.utils;

import org.junit.Test;

import java.util.UUID;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/9
 */
public class IDutils {
    public static String getId(){
      return UUID.randomUUID().toString().replaceAll("-","");

    }
    @Test
    public void test(){
        System.out.println(IDutils.getId());

    }
}

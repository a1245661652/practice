package com.da.pojo;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/12
 */
public class Hello {
    private  String str;
    public String getStr(){
        return str;
    }
    public  void  setStr(String str){
        this.str=str;
    }
    @Override
    public  String toString(){
        return "Hello{"+"str='"+str+"\'"+'}';
    }
}

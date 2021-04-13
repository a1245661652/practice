package com.da.pojo;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/13
 */
public class User {
    private String name;

    public User(String name){
        this.name=name;
    }
    public String getname(){
        return  name ;
    }
    public void setName(String name){
        this.name = name;
    }
    public  void show(){
        System.out.println("name=" + name);
    }
}

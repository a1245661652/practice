package com.da.pojo;

/**
 * @author wu
 * @version 1.0
 * @date 2021/3/31
 */
public class User {
    private int id;
    private String name;
    private String pwd;
    public User(){

    }
    public User(int id,String name,String pwd){
        this.id=id;
        this.name=name;
        this.pwd=pwd;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }
    public String getPwd(){
        return pwd;
    }
    public void setPwd(){
        this.pwd=pwd;
    }
    @Override
    public String toString(){
        return "User{"+"id="+id+",name="+name+'\''+",pwd="+pwd+'\''+"}";
    }
}

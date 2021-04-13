package com.da.pojo;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/13
 */
public class Address {
    private  String address;
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}

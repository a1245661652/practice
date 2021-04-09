package com.da.pojo;

import lombok.Data;

import java.util.List;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/8
 */
@Data
public class Teacher {
    private int id;
    private String name;
    private List<Student> students;
}

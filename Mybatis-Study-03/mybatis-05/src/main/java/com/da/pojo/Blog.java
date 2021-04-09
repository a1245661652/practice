package com.da.pojo;
import lombok.Data;

import java.util.Date;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/9
 */
@Data
public class Blog {
    private String id;
    private String title;
    private String author;
    private Date createTime;
    private int views;
}

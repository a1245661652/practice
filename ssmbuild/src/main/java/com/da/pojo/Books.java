package com.da.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    private  int bookID;
    private String bookName;
    private int bookCounts;
    private String detail;
}

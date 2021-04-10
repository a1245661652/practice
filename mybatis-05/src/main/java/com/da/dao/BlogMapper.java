package com.da.dao;

import com.da.pojo.Blog;

import java.util.List;
import java.util.Map;

/**
 * @author wu
 * @version 1.0
 * @date 2021/4/9
 */
public interface BlogMapper {
    int addBook(Blog blog);

    List<Blog> queryBlogIF(Map map);

    List<Blog> queryBlogChoose(Map map);

    int updateBlog(Map map);

    List<Blog> queryBlogForeach(Map map);
}

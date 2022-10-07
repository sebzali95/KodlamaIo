package org.example.dataAccess;

import org.example.entity.Category;

public class JdbcCategoryDao implements CategoryDao{
    @Override
    public void add(Category category) {
        System.out.println("Category is added by using JDBC : "+ category.getName());
    }

    @Override
    public void update(Category category) {
        System.out.println("Category is update by using JDBC : "+ category.getName());
    }

    @Override
    public void delete(Category category) {
        System.out.println("Category is delete by using JDBC : "+ category.getName());
    }
}

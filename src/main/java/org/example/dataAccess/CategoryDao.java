package org.example.dataAccess;

import org.example.entity.Category;
import org.example.entity.Instructor;

public interface CategoryDao {
    void add(Category category);

    void update(Category category);

    void delete(Category category);
}

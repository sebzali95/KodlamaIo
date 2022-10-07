package org.example.dataAccess;

import org.example.entity.Category;
import org.example.entity.Course;

public interface CourseDao {

    void add(Course course);

    void update(Course course);

    void delete(Course course);
}

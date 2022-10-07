package org.example;

import org.example.business.CategoryManager;
import org.example.business.CourseManager;
import org.example.business.InstructorManager;
import org.example.dataAccess.*;
import org.example.entity.Category;
import org.example.entity.Course;
import org.example.entity.Instructor;
import org.example.logger.DatabaseLogger;
import org.example.logger.EmailLogger;
import org.example.logger.FileLogger;
import org.example.logger.Logger;

public class Main {
    public static void main(String[] args) throws Exception {


        Logger[] loggers = {new DatabaseLogger(), new EmailLogger(), new FileLogger()};


        Instructor instructor = new Instructor(1, "Engin", "Demirog");
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(), loggers);
        instructorManager.add(instructor);

        System.out.println("--------------------------");

        Category category = new Category("Java Backend Development");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(category);


        System.out.println("--------------------------");


        Category category1 = new Category("C# Development");
        CategoryManager categoryManager1 = new CategoryManager(new HibernateCategoryDao(), loggers);
        categoryManager.add(category1);


        System.out.println("--------------------------");


        Category category2 = new Category("Frontend Development");
        CategoryManager categoryManager2 = new CategoryManager(new JdbcCategoryDao(), loggers);
        categoryManager.add(category2);

        System.out.println("--------------------------");


        Course course = new Course(1, "Java Kamp", 20);
        CourseManager courseManager = new CourseManager(new HibernateCourseDao(), loggers);
        courseManager.courseName(course);
    }
}
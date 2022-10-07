package org.example.business;

import org.example.dataAccess.CourseDao;
import org.example.entity.Category;
import org.example.entity.Course;
import org.example.logger.Logger;

import java.util.List;

public class CourseManager {

    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;

        this.loggers = loggers;
    }


    public void courseName(Course course) throws Exception {
        if (course.getPrice() < 10) {
            throw new Exception("The price of a course cannot be less than 10");
        }
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log(course.getName());

        }

    }

    public void add(Course course) {
        this.courseDao.add(course);

        for (Logger logger : loggers) {

            logger.log(course.getName());
        }
    }

    public void update(Course course) {
        this.courseDao.update(course);
    }

    public void delete(Course course) {
        this.courseDao.delete(course);
    }


}

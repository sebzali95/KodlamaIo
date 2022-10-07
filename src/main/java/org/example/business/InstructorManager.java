package org.example.business;

import org.example.dataAccess.InstructorDao;
import org.example.entity.Instructor;
import org.example.logger.Logger;

public class InstructorManager {


    private InstructorDao instructorDao;
    private Logger[] loggers;


    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void add(Instructor instructor) {
        this.instructorDao.add(instructor);

        for (Logger logger : loggers) {
            logger.log(instructor.getFirstName() + " " + instructor.getLastName());
        }

    }

    public void update(Instructor instructor) {
        this.instructorDao.update(instructor);

    }

    public void delete(Instructor instructor) {
        this.instructorDao.delete(instructor);

    }
}

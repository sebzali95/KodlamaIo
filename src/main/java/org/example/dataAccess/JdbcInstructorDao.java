package org.example.dataAccess;

import org.example.entity.Instructor;

public class JdbcInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("Instructor is added by using JDBC : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Instructor is update by using JDBC : " + instructor.getFirstName() + " " + instructor.getLastName());
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Instructor is delete by using JDBC : " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}

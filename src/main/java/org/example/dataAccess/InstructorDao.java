package org.example.dataAccess;

import org.example.entity.Instructor;

public interface InstructorDao {

    void add(Instructor instructor);

    void update(Instructor instructor);

    void delete(Instructor instructor);
}

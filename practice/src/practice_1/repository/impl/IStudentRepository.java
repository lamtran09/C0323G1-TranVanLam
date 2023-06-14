package practice_1.repository.impl;

import practice_1.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> displayStudent();
    void addStudent(Student student);
    void removeStudent(Student student);
    Student getById(String idPerson);
}

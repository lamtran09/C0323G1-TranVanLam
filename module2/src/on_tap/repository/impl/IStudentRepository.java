package on_tap.repository.impl;

import on_tap.model.Student;
import on_tap.model.Teacher;

import java.util.List;

public interface IStudentRepository {
    List<Student> displayStudent();
    void addStudent(Student student);
    void removeStudent(Student student);
    Student getById(String idPerSon);
}

package extra_exercises.extra_exercises_1.repository.impl;

import extra_exercises.extra_exercises_1.model.Student;
import extra_exercises.extra_exercises_1.model.Teacher;

import java.util.List;

public interface IStudentRepository {
    List<Student> displayStudent();
    void addStudent(Student student);
    void removeStudent(Teacher teacher);
    Student getById(String idPerson);
}

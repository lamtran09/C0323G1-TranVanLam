package practice_1.repository.impl;

import practice_1.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> displayTeacher();
    void addTeacher(Teacher teacher);
    void removeTeacher(Teacher teacher);
    Teacher getByID(String idPerson);
}

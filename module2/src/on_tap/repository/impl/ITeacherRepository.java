package on_tap.repository.impl;

import on_tap.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> displayTeacher();
    void addTeacher(Teacher teacher);
    void removeTeacher(Teacher teacher);
    Teacher getById(String idPerson);
}

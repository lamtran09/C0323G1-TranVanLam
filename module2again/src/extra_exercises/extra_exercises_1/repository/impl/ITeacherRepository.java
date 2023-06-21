package extra_exercises.extra_exercises_1.repository.impl;

import extra_exercises.extra_exercises_1.model.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> displayTeacher();
    void addTeacher(Teacher teacher);
    void removeTeacher(Teacher teacher);
    Teacher getById(String idPerson);
}

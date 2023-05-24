package extra_lessons.extra_lesson_1.repository.impl;

import extra_lessons.extra_lesson_1.model.impl.Students;
import extra_lessons.extra_lesson_1.model.impl.Teacher;

import java.util.List;

public interface ITeacherRepository {
    List<Teacher> displayTeacher();
    void addTeacher(Teacher teacher);
    void removeTeacher(Teacher teacher);

}

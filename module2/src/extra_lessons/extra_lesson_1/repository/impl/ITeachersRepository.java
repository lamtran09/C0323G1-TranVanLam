package extra_lessons.extra_lesson_1.repository.impl;

import extra_lessons.extra_lesson_1.model.small.Students;
import extra_lessons.extra_lesson_1.model.small.Teachers;

import java.util.List;

public interface ITeachersRepository {
    List<Teachers> displayTeachers();
    void addTeacher(Teachers teachers);
    void removesTeacher(Teachers teachers);

    Teachers getByCode(String code);
}

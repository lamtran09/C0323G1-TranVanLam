package extra_lessons.extra_lesson_1.repository.impl;

import extra_lessons.extra_lesson_1.model.small.Students;

import java.util.List;

public interface IStudentsRepository {
    List<Students> displayStudent();
    void addStudents(Students students);
    void removes(Students students);
    Students getByCode(String code);
}

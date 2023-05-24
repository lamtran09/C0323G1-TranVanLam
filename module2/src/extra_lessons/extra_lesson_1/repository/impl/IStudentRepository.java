package extra_lessons.extra_lesson_1.repository.impl;

import extra_lessons.extra_lesson_1.model.impl.Students;
import extra_lessons.extra_lesson_1.model.impl.Teacher;

import java.util.List;

public interface IStudentRepository {
    List<Students> displayStudent();
    void addStudent(Students students);

    void removeStudent(Students students);

}

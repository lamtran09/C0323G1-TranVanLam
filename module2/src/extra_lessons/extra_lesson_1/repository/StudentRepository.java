package extra_lessons.extra_lesson_1.repository;

import extra_lessons.extra_lesson_1.model.impl.Students;
import extra_lessons.extra_lesson_1.repository.impl.IStudentRepository;
import extra_lessons.extra_lesson_1.text.ReadWriteFileStudent;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private List<Students> studentsList = new ArrayList<>();

    @Override
    public List<Students> displayStudent() {
        List<Students> studentsList = ReadWriteFileStudent.readToFile("src/extra_lessons/extra_lesson_1/untils/dataStudent.csv");
        return studentsList;
    }

    public void addStudent(Students students) {
        List<Students> studentsList = ReadWriteFileStudent.readToFile("src/extra_lessons/extra_lesson_1/untils/dataStudent.csv");
        studentsList.add(students);
        ReadWriteFileStudent.writeToFile("src/extra_lessons/extra_lesson_1/untils/dataStudent.csv",studentsList);
    }

    @Override
    public void removeStudent(Students students) {
        studentsList.remove(students);
        ReadWriteFileStudent.writeToFile("src/extra_lessons/extra_lesson_1/untils/dataStudent.csv",studentsList);
    }


}

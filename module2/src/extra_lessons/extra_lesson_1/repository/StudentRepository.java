package extra_lessons.extra_lesson_1.repository;

import extra_lessons.extra_lesson_1.model.impl.Students;
import extra_lessons.extra_lesson_1.repository.impl.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static List<Students> studentsList = new ArrayList<>();
    static {

        Students students1 = new Students("1","hoàng","2002","nam","C0323G1",7.0F);
        Students students2 = new Students("2","lâm","1998","nam","C0323G1",7.0F);
        Students students3 = new Students("3","minh","1999","nam","C0323G1",9.0F);
        studentsList.add(students1);
        studentsList.add(students2);
        studentsList.add(students3);
    }

    @Override
    public List<Students> displayStudent() {
        return studentsList;
    }

    public void addStudent(Students students) {
        studentsList.add(students);
    }

    @Override
    public void removeStudent(Students students) {
        studentsList.remove(students);
    }


}

package extra_exercises.extra_exercises_1.service.classes;

import extra_exercises.extra_exercises_1.model.Teacher;
import extra_exercises.extra_exercises_1.repository.classes.TeacherRepository;
import extra_exercises.extra_exercises_1.repository.impl.ITeacherRepository;
import extra_exercises.extra_exercises_1.service.impl.ITeacherService;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static final ITeacherRepository teacherRepository  = new TeacherRepository();
    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void display() {
        List<Teacher> teacherList = teacherRepository.displayTeacher();
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void delete() {

    }

    @Override
    public void add() {

    }
}

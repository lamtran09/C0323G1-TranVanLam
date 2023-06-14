package practice_1.service.classes;

import practice_1.model.Teacher;
import practice_1.repository.classes.TeacherRepository;
import practice_1.service.impl.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static Scanner scanner = new Scanner(System.in);
    private static final TeacherRepository teacherRepository = new TeacherRepository();
    @Override
    public void addTeacher() {

    }

    @Override
    public void removeTeacher() {

    }

    @Override
    public void displayTeacherList() {
        List<Teacher> teacherList = teacherRepository.displayTeacher();
        for (Teacher teacher: teacherList) {
            System.out.println(teacher);
        }
    }
}

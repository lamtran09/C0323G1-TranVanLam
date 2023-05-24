package extra_lessons.extra_lesson_1.service;

import extra_lessons.extra_lesson_1.model.impl.Students;
import extra_lessons.extra_lesson_1.model.impl.Teacher;
import extra_lessons.extra_lesson_1.repository.TeacherRepository;
import extra_lessons.extra_lesson_1.service.impl.ITeacherService;

import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private Scanner scanner = new Scanner(System.in);
    private TeacherRepository teacherRepository = new TeacherRepository();
    @Override
    public void displayTeacher() {
        List<Teacher> teacherList = teacherRepository.displayTeacher();
        for (Teacher teacher:teacherList) {
            System.out.println(teacher);
        }
    }

    @Override
    public void addTeacher() {
//        String id, String name, string dayOfBirth, String gender, String specialize
        System.out.print("Nhập mã giảng viên: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên giảng viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập năm sinh giảng viên: ");
        String dayOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập trình độ: ");
        String specialize = scanner.nextLine();
        Teacher teacher = new Teacher(id,name,dayOfBirth,gender,specialize);
        teacherRepository.addTeacher(teacher);
    }

    @Override
    public void removeTeacher() {
        System.out.print("Nhập id bạn muốn xóa: ");
        String id = scanner.nextLine();
        List<Teacher> teacherList = teacherRepository.displayTeacher();
        teacherList.removeIf(p -> p.getId().equals(id));

    }
}

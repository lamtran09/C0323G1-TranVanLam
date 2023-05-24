package extra_lessons.extra_lesson_1.service;

import extra_lessons.extra_lesson_1.model.impl.Students;
import extra_lessons.extra_lesson_1.repository.StudentRepository;
import extra_lessons.extra_lesson_1.service.impl.IStudentService;

import java.util.List;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private Scanner scanner = new Scanner(System.in);
    private StudentRepository studentRepository = new StudentRepository();

    @Override
    public void display() {
        List<Students> studentsList = studentRepository.displayStudent();
        for (Students student : studentsList) {
            System.out.println(student);
        }
    }

    @Override
    public void addStudent() {
//        String id, String name, int dayOfBirth, String gender, String classes, float score
        System.out.print("Nhập mã học viên: ");
        String id = scanner.nextLine();
        System.out.print("Nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập năm sinh học viên: ");
        String dayOfBirth = scanner.nextLine();
        System.out.print("Nhập giới tính học sinh: ");
        String gender = scanner.nextLine();
        System.out.print("Nhập lớp của học viên: ");
        String classes = scanner.nextLine();
        System.out.print("Nhập điểm của học viên: ");
        float score = Float.parseFloat(scanner.nextLine());
        Students students = new Students(id, name, dayOfBirth, gender, classes, score);
        studentRepository.addStudent(students);
    }

    @Override
    public void removeStudent() {
        System.out.print("Nhập id giảng viên bạn muốn xóa: ");
        String id = scanner.nextLine();
        List<Students> studentsList = studentRepository.displayStudent();
        for (Students b : studentsList) {
            if (b.getId().equals(id)) {
                studentRepository.removeStudent(b);
            }
        }
    }
}

package extra_lessons.extra_lesson_1.service.classes;

import extra_lessons.extra_lesson_1.comon.ValidateClass;
import extra_lessons.extra_lesson_1.model.small.Students;
import extra_lessons.extra_lesson_1.repository.classes.StudentsRepository;
import extra_lessons.extra_lesson_1.service.impl.IStudentsService;
import ss18_string_regex.bai_tap.validate_class_name.Validate;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentsService implements IStudentsService {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentsRepository studentsRepository = new StudentsRepository();

    @Override
    public void displayStudents() {
        List<Students> studentsList = studentsRepository.displayStudent();
        for (Students s : studentsList) {
            System.out.println(s);
        }
    }

    @Override
    public void addStudents() {
        //String idPerson, String namePerson, String dateOfBirth, String gender, String classes, float score
        System.out.print("Nhập mã học viên: ");
        String idPerson = scanner.nextLine();
        System.out.print("Nhập tên học viên: ");
        String namePerson = scanner.nextLine();
        System.out.print("Nhập ngày sinh học viên: ");
        String dateOfBirth = scanner.nextLine();
        String gender;
        do {
            System.out.println("-----Chọn giới tính học viên-----\n" +
                    "1.Nam\n" +
                    "2.Nữ");
            gender = scanner.nextLine();
            if (gender.equals("1")) {
                gender = "Nam";
                break;
            } else if (gender.equals("2")) {
                gender = "Nữ";
                break;
            } else {
                System.out.println("Nhập sai nhập lại");
            }

        } while (!gender.equals("1") || !gender.equals("2"));
        String classes;
        do {
            System.out.println("Nhập lớp của học viên theo định dạng sau, nếu nập sai vui lòng nhập lại\n" +
                    "Cxx-23G1(x là số)");
            System.out.print("Nhập tên lớp học: ");
            classes = scanner.nextLine();
        } while (!ValidateClass.validateCheckClassName(classes));
        System.out.println("Bạn đã thêm lớp thành công!!!");
        System.out.print("Nhập điểm của học viên: ");
        float score;
        do {
            try {
                score = Float.parseFloat(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Nhập sai định dạng");
            }
        } while (true);
        Students students = new Students(idPerson, namePerson, dateOfBirth, gender, classes, score);
        studentsRepository.addStudents(students);
        System.out.println("Thêm mới thành công!!!!!!!");
    }

    @Override
    public void removeStudents() {
        System.out.print("Bạn muốn xóa học viên nào. Vui lòng nhập mã học viên: ");
        String idPerson = scanner.nextLine();
        Students students = studentsRepository.getByCode(idPerson);
        if (students == null) {
            System.out.println("Không tìm thấy học viên");
        } else {
            System.out.println("Bạn có muốn xóa học viên: " + students.getNamePerson());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                studentsRepository.removes(students);
                System.out.println("------Xóa thành công------");
            }
        }
    }
}


package extra_lessons.extra_lesson_1.service.classes;

import extra_lessons.extra_lesson_1.model.small.Students;
import extra_lessons.extra_lesson_1.model.small.Teachers;
import extra_lessons.extra_lesson_1.repository.classes.StudentsRepository;
import extra_lessons.extra_lesson_1.repository.classes.TeachersRepository;
import extra_lessons.extra_lesson_1.service.impl.ITeachersService;

import java.util.List;
import java.util.Scanner;

public class TeachersService implements ITeachersService {
    private static Scanner scanner = new Scanner(System.in);
    private static TeachersRepository teachersRepository = new TeachersRepository();
    @Override
    public void displayTeachers() {
        List<Teachers> teachersList = teachersRepository.displayTeachers();
        for (Teachers s : teachersList) {
            System.out.println(s);
        }
    }

    @Override
    public void addTeacher() {
        System.out.print("Nhập mã giảng viên: ");
        String idPerson = scanner.nextLine();
        System.out.print("Nhập tên giảng viên: ");
        String namePerson = scanner.nextLine();
        System.out.print("Nhập ngày sinh giảng viên: ");
        String dateOfBirth = scanner.nextLine();
        String gender;
        do {
            System.out.println("-----Chọn giới tính giảng viên-----\n" +
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
        System.out.print("Nhập trình độ của giảng viên: ");
        String specialize = scanner.nextLine();
        Teachers teachers = new Teachers(idPerson,namePerson,dateOfBirth,gender,specialize);
        teachersRepository.addTeacher(teachers);
        System.out.println("Thêm mới thành công");
    }

    @Override
    public void removeTeacher() {
        System.out.print("Bạn muốn xóa giảng viên nào. Vui lòng nhập mã giảng viên: ");
        String idPerson = scanner.nextLine();
        Teachers teachers = teachersRepository.getByCode(idPerson);
        if (teachers == null) {
            System.out.println("Không tìm thấy giảng viên");
        } else {
            System.out.println("Bạn có muốn xóa giảng viên: " + teachers.getNamePerson());
            System.out.println("1. Xóa");
            System.out.println("2. Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                teachersRepository.removesTeacher(teachers);
                System.out.println("------Xóa thành công------");
            }
        }
    }
}

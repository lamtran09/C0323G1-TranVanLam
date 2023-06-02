package case_study.service.person;

import case_study.common.Regex;
import case_study.common.WageException;
import case_study.model.person.Employee;
import case_study.repository.person.EmployeeRepository;
import extra_lessons.extra_lesson_1.model.small.Students;
import ss12_java_collection_framework.bai_tap.model.Product;

import java.util.List;
import java.util.Scanner;

public class EmployeeService implements IEmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeRepository employeeRepository = new EmployeeRepository();

    @Override
    public void displayEmployee() {
        List<Employee> employeeList = employeeRepository.displayEmployee();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

    @Override
    public void addEmployee() {
        ////String idPerSon, String namePerson, String dateOfBirth, boolean gender, int identityCard, int phoneNumber, String email, String level, String location, float wage
        String idPerson;
        do {
            System.out.print("Nhập id của nhân viên(Theo định dạng (NV-YYYY, với YYYY là các số từ 0-9)): ");
            idPerson = scanner.nextLine();
        } while (!Regex.validateIdPerson(idPerson));
        String namePerson;
        do {
            System.out.print("Nhập tên của nhân viên(Chữ đầu viết Hoa): ");
            namePerson = scanner.nextLine();
        } while (!Regex.validateNamePerson(namePerson));
        String dateOfBirth;
        do {
            System.out.print("Nhập ngày sinh của nhân viên(theo định dạng dd/mm/yyyy): ");
           dateOfBirth = scanner.nextLine();
        }while (!Regex.validateDateOfBirth(dateOfBirth));

        String gender;
        boolean flag;
        do {
           flag = true;
            System.out.println("Chọn giới tính của nhân viên\n" +
                    "1.Boy\n" +
                    "2.Girl");
            System.out.print("Choice: ");
            gender = scanner.nextLine();
            switch (gender) {
                case "1":
                    gender = "Nam";
                    break;
                case "2":
                    gender = "Nữ";
                    break;
                default:
                    flag = false;
                    System.out.println("Chọn sai chọn lại");
                    break;
            }

        } while (!flag);
        String identityCard;
        do {
            System.out.print("Nhập số chứng minh của nhân viên (CMND 9 số - 12 số):");
            identityCard = scanner.nextLine();
        } while (!Regex.validateIdentityCard(identityCard));
        String phoneNumber;
        do {
            System.out.print("Nhập số điện thoại(bắt đầu từ 0 và đủ 10 số): ");
            phoneNumber = scanner.nextLine();
        } while (!Regex.validatePhoneNumber(phoneNumber));
        String email;
        do {
            System.out.print("Nhập email nhân viên: ");
            email = scanner.nextLine();
        } while (!Regex.validateEmail(email));
        String level;
        boolean flagS2;
        do {
            flagS2 = true;
            //Trung cấp, Cao đẳng, Đại học và Sau đại học
            System.out.println("Chọn trình độ nhân viên\n" +
                    "1.Trung cấp\n" +
                    "2.Cao đẳng\n" +
                    "3.Đại học\n" +
                    "4.Sau đại học");
            System.out.print("Chọn: ");
            level = scanner.nextLine();
            switch (level) {
                case "1":
                    level = "Trung cấp";
                    break;
                case "2":
                    level = "Cao đẳng";
                    break;
                case "3":
                    level = "Đại học";
                    break;
                case "4":
                    level = "Sau đại học";
                    break;
                default:
                    flagS2 = false;
                    System.out.println("chọn sai chọn lại");
                    break;
            }

        } while (!flagS2);
        String location;
        boolean flagS3;
        do {
            flagS3  = true;
            //(lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc)
            System.out.println("Chọn vị trí nhân viên\n" +
                    "1.lễ tân\n" +
                    "2.phục vụ\n" +
                    "3.chuyên viên\n" +
                    "4.giám sát\n" +
                    "5.quản lý\n" +
                    "6.giám đốc");
            System.out.print("Chọn: ");
            location = scanner.nextLine();
            switch (location) {
                case "1":
                    location = "lễ tân";
                    break;
                case "2":
                    location = "phục vụ";
                    break;
                case "3":
                    location = "chuyên viên";
                    break;
                case "4":
                    location = "giám sát";
                    break;
                case "5":
                    location = "quản lý";
                    break;
                case "6":
                    location = "giám đốc";
                    break;
                default:
                    flagS3  = false;
                    System.out.println("Chọn sai chọn lại");
                    break;
            }
        } while (!flagS3);
        long wage;
        while (true) {
            System.out.println("Nhập lương nhân viên: ");
            try {
                wage = Long.parseLong(scanner.nextLine());
                if (wage <= 0) {
                    throw new WageException("Nhập sai nhập lại(Tiền lương >0)");
                }
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Sai Format");
            } catch (WageException e) {
                e.printStackTrace();
            }
        }
        Employee employee = new Employee(idPerson, namePerson, dateOfBirth, gender, identityCard, phoneNumber, email, level, location, wage);
        employeeRepository.addEmployee(employee);
        System.out.println("Thêm Thành Công");
    }

    @Override
    public void removeEmployee() {
        System.out.print("Nhập id nhân viên mà bạn muốn xóa: ");
        String idPerson = scanner.nextLine();
        Employee employee = employeeRepository.getIdPerson(idPerson);
        if(employee == null){
            System.out.println("Không có mã nhân viên");
        }else {
            System.out.println("Bạn có muốn xóa nhân viên "+employee.getNamePerson());
            System.out.println("1.Có\n" +
                    "2.Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if(choice == 1){
                employeeRepository.removeEmployee(employee);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void editEmployee() {

    }

    @Override
    public void searchEmployee() {
        System.out.print("Nhập tên nhân viên bạn muốn tìm: ");
        String name = scanner.nextLine();
        List<Employee> employees = employeeRepository.searchEmployee(name);
        if (employeeRepository.searchEmployee(name).size() == 0) {
            System.out.println("No");
        } else {
            for (Employee p : employees) {
                System.out.println(p);
            }
        }
    }
}

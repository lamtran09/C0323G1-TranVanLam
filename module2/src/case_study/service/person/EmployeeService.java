package case_study.service.person;

import case_study.common.Regex;
import case_study.common.WageException;
import case_study.model.person.Employee;
import case_study.repository.person.EmployeeRepository;

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
        System.out.print("Nhập ngày sinh của nhân viên: ");
        String dateOfBirth = scanner.nextLine();
        String gender;
        do {
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
                    System.out.println("Chọn sai chọn lại");
            }
            break;
        } while (true);
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
        do {
            System.out.print("Nhập trình độ nhân viên( Trung cấp, Cao đẳng, Đại học và Sau đại học): ");
            level = scanner.nextLine();
        } while (!Regex.validateLevel(level));
        String location;
        do {
            System.out.print("Nhập vị trí nhân viên (lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc):");
            location = scanner.nextLine();
        } while (!Regex.validateLocation(location));
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

    }
}

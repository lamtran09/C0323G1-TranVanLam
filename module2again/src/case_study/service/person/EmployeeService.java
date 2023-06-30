package case_study.service.person;

import case_study.model.person.Employee;
import case_study.repository.person.EmployeeRepository;
import case_study.repository.person.IPersonRepository;
import case_study.ultils.IdNotFoundException;
import case_study.ultils.UniqueIDException;
import case_study.ultils.Validate;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;


public class EmployeeService implements IPersonService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IPersonRepository<Employee> employeeIPersonRepository = new EmployeeRepository();
    private static final Validate validate = new Validate();

    public void create() {
        //-Mã nhân viên phải đúng định dạng: NV-YYYY, với YYYY là các số từ 0-9.
        //-Tên nhân viên phải viết hoa các ký tự đầu của mỗi từ.
        //-Phải đủ 18 tuổi (tính cả ngày + tháng)
        //-CMND phải đủ 9 hoặc 12 số.
        //-Số điện thoại phải bắt đầu từ 0 và đủ 10 số.
        //-Lương phải lớn hơn 0.
        String idEmployee;
        String nameEmployee;
        String dateOfBirth;
        String gender;
        String identityCard;
        String phoneNumber;
        String email;
        String level;
        String location;
        long wage;
        boolean flag = true;
        do {
            System.out.println("Mời bạn nhập mã nhân viên (Theo định dạng: NV-YYYY, với YYYY là các số từ 0-9)");
            idEmployee = scanner.nextLine();
            Employee employee;
            try {
                flag = false;
                employee = employeeIPersonRepository.getById(idEmployee);
                if (employee == null) {
                    continue;
                }
                throw new UniqueIDException("Trùng ID trong hệ thống");

            } catch (UniqueIDException e) {
                flag = true;
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("*****");
            }
        } while (!validate.validateIdEmployee(idEmployee) || flag);

        do {
            System.out.println("Mời bạn nhập họ tên (viết hoa các ký tự đầu của mỗi từ)");
            nameEmployee = scanner.nextLine();
        } while (!validate.validateNameCustomer(nameEmployee));

        System.out.println("Mời bạn nhập ngày sinh(Phải đủ 18 tuổi (tính cả ngày + tháng) theo định dạng YYYY/mm/dd)");
        dateOfBirth = scanner.nextLine();
        LocalDate localDate = LocalDate.now();
        LocalDate date = LocalDate.parse(dateOfBirth);
        System.out.println(localDate.isAfter(date));
        AC:
        while (true) {
            System.out.println("Mời bạn chọn giới tính ");
            System.out.println("1.Nam");
            System.out.println("2.Nữ");
            System.out.println("3.Khác");
            String upGender = scanner.nextLine();
            switch (upGender) {
                case "1":
                    gender = "Nam";
                    break AC;
                case "2":
                    gender = "Nữ";
                    break AC;
                case "3":
                    gender = "Khác";
                    break AC;
                default:
                    System.out.println("*****");
                    break;
            }
        }

        do {
            System.out.println("Mời bạn nhập số CMND (CMND phải đủ 9 hoặc 12 số)");
            identityCard = scanner.nextLine();
        } while (!validate.validateIdentityCard(identityCard));

        do {
            System.out.println("Mời bạn nhập số điện thoại (bắt đầu từ 0 và đủ 10 số)");
            phoneNumber = scanner.nextLine();
        } while (!validate.validatePhoneNumber(phoneNumber));

        do {
            System.out.println("Mời bạn nhập Email");
            email = scanner.nextLine();
        } while (!validate.validateEmail(email));

        AD:
        while (true) {
            System.out.println("Mời bạn chọn trình độ nhân viên");
            System.out.println("1.Sau đại học");
            System.out.println("2.Đại học");
            System.out.println("3.Cao đẳng");
            System.out.println("4.Trung cấp");
            System.out.println("Vui lòng chọn chức năng");
            String upLevel = scanner.nextLine();
            switch (upLevel) {
                case "1":
                    level = "Sau đại học";
                    break AD;
                case "2":
                    level = "Đại học";
                    break AD;
                case "3":
                    level = "Cao đẳng";
                    break AD;
                case "4":
                    level = "Trung cấp";
                    break AD;
                default:
                    System.out.println("****");
                    break;
            }
        }

        AD:
        while (true) {
            System.out.println("Mời bạn chọn vị trí nhân viên");
            System.out.println("1.Giám đốc");
            System.out.println("2.Quản lý");
            System.out.println("3.Giám sát");
            System.out.println("4.Chuyên viên");
            System.out.println("5.Phục vụ");
            System.out.println("6.Lễ tân");
            System.out.println("Vui lòng chọn chức năng");
            String upLevel = scanner.nextLine();
            switch (upLevel) {
                case "1":
                    location = "Giám đốc";
                    break AD;
                case "2":
                    location = "Quản lý";
                    break AD;
                case "3":
                    location = "Giám sát";
                    break AD;
                case "4":
                    location = "Chuyên viên";
                    break AD;
                case "5":
                    location = "Phục vụ";
                    break AD;
                case "6":
                    location = "Lễ tân";
                    break AD;
                default:
                    System.out.println("****");
                    break;
            }
        }

        System.out.println("Mời bạn hập vào lương của nhân viên");
        wage = Long.parseLong(scanner.nextLine());

        Employee employee = new Employee(idEmployee, nameEmployee, dateOfBirth, gender, identityCard, phoneNumber, email, level, location, wage);
        employeeIPersonRepository.add(employee);
        System.out.println("Thêm mới nhân viên thành công");
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập id nhân viên mà bạn muốn xóa khỏi danh sách");
        try {
            String idPerson = scanner.nextLine();
            Employee employee = employeeIPersonRepository.getById(idPerson);
            if (employee == null) {
                throw new IdNotFoundException("ID không tồn tại trong hệ thống");
            }
            System.out.println("Bạn có chắc chắn muốn xóa " + employee.getNamePerson() + " khỏi danh sách không?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Vui lòng chọn chức năng");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                employeeIPersonRepository.remove(employee);
                System.out.println("Xóa nhân viên thành công");
            }
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("****");
        }
    }

    @Override
    public void update() {
        System.out.println("Mời bạn nhập id nhân viên cần chỉnh sửa thông tin");
        String idEmployee = scanner.nextLine();
        try {
            Employee employee = employeeIPersonRepository.getById(idEmployee);
            if (employee == null) {
                throw new IdNotFoundException("ID không tồn tại");
            } else {
                final int CHOICE_ONCE = 1;
                final int CHOICE_TWICE = 2;
                final int CHOICE_THIRD = 3;
                final int CHOICE_FOUR = 4;
                final int CHOICE_FIVE = 5;
                final int CHOICE_SIX = 6;
                final int CHOICE_SEVEN = 7;
                final int CHOICE_EIGHT = 8;
                final int CHOICE_NINE = 9;
                final int CHOICE_ZERO = 0;
                int choice = 0;
                while (true) {
                    System.out.println("Chọn thông tin muốn chỉnh sửa");
                    System.out.println("1.Họ tên");
                    System.out.println("2.Ngày sinh");
                    System.out.println("3.Giới tính");
                    System.out.println("4.CMND");
                    System.out.println("5.Số đện thoại");
                    System.out.println("6.Email");
                    System.out.println("7.Trình độ");
                    System.out.println("8.Vị trí");
                    System.out.println("9.Lương");
                    System.out.println("0.Quay lại Menu");
                    while (true) {
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                            if (choice >= 0 && choice <= 9) {
                                break;
                            }
                        } catch (NumberFormatException numberFormatException) {
                            System.out.println("Lỗi Format");
                        } catch (Exception e) {
                            System.out.println("Lỗi định dạng");
                        }
                    }
                    String namePerson;
                    switch (choice) {
                        case CHOICE_ONCE:
                            do {
                                System.out.println("Mời bạn nhập tên mới(viết hoa các ký tự đầu của mỗi từ)");
                                namePerson = scanner.nextLine();
                            } while (!validate.validateNameCustomer(namePerson));
                            employee.setNamePerson(namePerson);
                            break;
                        case CHOICE_TWICE:
                            System.out.println("Mời bạn nhập ngày sinh mới");
                            String dayOfBirth = scanner.nextLine();
                            employee.setDateOfBirth(dayOfBirth);
                            break;
                        case CHOICE_THIRD:
                            System.out.println("Mời bạn chọn giới tính");
                            System.out.println("1.Nam");
                            System.out.println("2.Nữ");
                            System.out.println("3.Khác");
                            String gender = null;

                            AD:
                            while (true) {
                                String upGender = scanner.nextLine();
                                switch (upGender) {
                                    case "1":
                                        gender = "Nam";
                                        break AD;
                                    case "2":
                                        gender = "Nữ";
                                        break AD;
                                    case "3":
                                        gender = "Khác";
                                        break AD;
                                    default:
                                        System.out.println("*****");
                                        break;
                                }
                            }
                            employee.setGender(gender);
                            break;
                        case CHOICE_FOUR:
                            System.out.println("Mời bạn nhập số CMND mới");
                            String idCard = scanner.nextLine();
                            employee.setIdentityCard(idCard);
                            break;
                        case CHOICE_FIVE:
                            System.out.println("Mời bạn nhập số diện thoại mới");
                            String phoneNumber = scanner.nextLine();
                            employee.setPhoneNumber(phoneNumber);
                            break;
                        case CHOICE_SIX:
                            String email;
                            do {
                                System.out.println("Mời bạn nhập Email mới");
                                email = scanner.nextLine();
                            } while (!validate.validateEmail(email));
                            employee.setEmail(email);
                            break;
                        case CHOICE_SEVEN:
                            String level;
                            AD:
                            while (true) {
                                System.out.println("Mời bạn chọn trình độ nhân viên");
                                System.out.println("1.Sau đại học");
                                System.out.println("2.Đại học");
                                System.out.println("3.Cao đẳng");
                                System.out.println("4.Trung cấp");
                                System.out.println("Vui lòng chọn chức năng");
                                String upLevel = scanner.nextLine();
                                switch (upLevel) {
                                    case "1":
                                        level = "Sau đại học";
                                        break AD;
                                    case "2":
                                        level = "Đại học";
                                        break AD;
                                    case "3":
                                        level = "Cao đẳng";
                                        break AD;
                                    case "4":
                                        level = "Trung cấp";
                                        break AD;
                                    default:
                                        System.out.println("****");
                                        break;
                                }
                            }
                            employee.setLevel(level);
                            break;
                        case CHOICE_EIGHT:
                            String location;
                            AD:
                            while (true) {
                                System.out.println("Mời bạn chọn vị trí nhân viên");
                                System.out.println("1.Giám đốc");
                                System.out.println("2.Quản lý");
                                System.out.println("3.Giám sát");
                                System.out.println("4.Chuyên viên");
                                System.out.println("5.Phục vụ");
                                System.out.println("6.Lễ tân");
                                System.out.println("Vui lòng chọn chức năng");
                                String upLevel = scanner.nextLine();
                                switch (upLevel) {
                                    case "1":
                                        location = "Giám đốc";
                                        break AD;
                                    case "2":
                                        location = "Quản lý";
                                        break AD;
                                    case "3":
                                        location = "Giám sát";
                                        break AD;
                                    case "4":
                                        location = "Chuyên viên";
                                        break AD;
                                    case "5":
                                        location = "Phục vụ";
                                        break AD;
                                    case "6":
                                        location = "Lễ tân";
                                        break AD;
                                    default:
                                        System.out.println("****");
                                        break;
                                }
                            }
                            employee.setLocation(location);
                            break;
                        case CHOICE_NINE:
                            long wage;
                            System.out.println("Mời bạn hập vào lương của nhân viên");
                            wage = Long.parseLong(scanner.nextLine());
                            employee.setWage(wage);
                            break;
                        case CHOICE_ZERO:
                            employeeIPersonRepository.update(idEmployee, employee);
                            System.out.println("Cập nhật thành công");
                            return;
                        default:
                            System.out.println("******");
                            break;

                    }
                }
            }
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void display() {
        List<Employee> employeeList = employeeIPersonRepository.display();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }
}


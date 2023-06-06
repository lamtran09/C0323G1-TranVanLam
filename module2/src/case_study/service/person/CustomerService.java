package case_study.service.person;

import case_study.common.Regex;
import case_study.model.person.Customer;
import case_study.repository.person.CustomerRepository;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements ICustomerService {
    private static CustomerRepository customerRepository = new CustomerRepository();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void displayCustomer() {
        List<Customer> customers = customerRepository.displayCustomer();
        for (Customer c : customers) {
            System.out.println(c);
        }
    }

    @Override
    public void addCustomer() {
        //String idPerSon, String namePerson, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String typeCustomer, String address
        String idPerson;

        do {
            System.out.print("Nhập id của khách hàng( định dạng: KH-YYYY, với YYYY là các số từ 0-9): ");
            idPerson = scanner.nextLine();
        } while (!Regex.validateIdCustomer(idPerson));
        String namePerson;
        do {
            System.out.print("Nhập tên của khách hàng(Tên khách hàng phải viết hoa các ký tự đầu của mỗi từ): ");
            namePerson = scanner.nextLine();
        } while (!Regex.validateNamePerson(namePerson));
        String dateOfBirth;
        do {
            System.out.print("Nhập ngày sinh của khách hàng theo định dạng dd/mm/yyyy: ");
            dateOfBirth = scanner.nextLine();
        } while (!Regex.validateDateOfBirth(dateOfBirth));
        String gender = "";
        boolean flag;
        do {
            flag = true;
            System.out.println("Chọn giới tính của khách hàng: \n" +
                    "1.Nam\n" +
                    "2.Nữ");
            System.out.print("Chọn: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    gender = "Nam";
                    break;
                case "2":
                    gender = "Nữ";
                    break;
                default:
                    System.out.println("Chọn sai chọn lại");
                    flag = false;
                    break;
            }
        } while (!flag);
        String identityCard;
        do {
            System.out.print("Nhập số chứng minh của khách hàng (CMND 9 số - 12 số): ");
            identityCard = scanner.nextLine();
        } while (!Regex.validateIdentityCard(identityCard));
        String phoneNumber;
        do {
            System.out.print("Nhập số điện thoại(bắt đầu từ 0 và đủ 10 số): ");
            phoneNumber = scanner.nextLine();
        } while (!Regex.validatePhoneNumber(phoneNumber));
        String email;
        do {
            System.out.print("Nhập email của khách hàng: ");
            email = scanner.nextLine();
        } while (!Regex.validateEmail(email));
        String typeCustomer = "";
        boolean flagTwo;
        //Diamond, Platinum, Gold, Silver, Member
        do {
            flagTwo = true;
            System.out.println("Chọn mức độ thân thiết của khách hàng\n" +
                    "1.Member\n" +
                    "2.Silver\n" +
                    "3.Gold\n" +
                    "4.Platium\n" +
                    "5.Diamond");
            System.out.print("Chọn: ");
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    typeCustomer = "Member";
                    break;
                case "2":
                    typeCustomer = "Silver";
                    break;
                case "3":
                    typeCustomer = "Gold";
                    break;
                case "4":
                    typeCustomer = "Platium";
                    break;
                case "5":
                    typeCustomer = "Diamond";
                    break;
                default:
                    System.out.println("Chọn sai chọn lại");
                    flagTwo = false;
                    break;
            }
        } while (!flagTwo);
        String address;
        System.out.print("Nhập địa chỉ của khách hàng: ");
        address = scanner.nextLine();
        Customer customer = new Customer(idPerson, namePerson, dateOfBirth, gender, identityCard, phoneNumber, email, typeCustomer, address);
        customerRepository.addCustomer(customer);
        System.out.println("Thêm thành công!!!");
    }

    @Override
    public void removeCustomer() {
        System.out.print("Nhập id khách hàng mà bạn muốn xóa: ");
        String idPerson = scanner.nextLine();
        Customer customer = customerRepository.getCustomer(idPerson);
        if (customer == null) {
            System.out.println("Không có mã khách hàng");
        } else {
            System.out.println("Bạn có muốn xóa khách hàng " + customer.getNamePerson());
            System.out.println("1.Có\n" +
                    "2.Suy nghĩ lại");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice == 1) {
                customerRepository.removeEmployee(customer);
                System.out.println("Xóa thành công");
            }
        }
    }

    @Override
    public void editCustomer() {

    }

    @Override
    public void searchCustomer() {
        System.out.print("Nhập tên khách hàng bạn muốn tìm: ");
        String name = scanner.nextLine();
        List<Customer> customer = customerRepository.searchCustomer(name);
        if (customerRepository.searchCustomer(name).size() == 0) {
            System.out.println("No");
        } else {
            for (Customer p : customer) {
                System.out.println(p);
            }
        }
    }
}


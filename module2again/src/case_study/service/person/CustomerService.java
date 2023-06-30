package case_study.service.person;

import case_study.model.person.Customer;
import case_study.repository.person.CustomerRepository;
import case_study.repository.person.IPersonRepository;
import case_study.ultils.IdNotFoundException;
import case_study.ultils.UniqueIDException;
import case_study.ultils.Validate;

import java.util.List;
import java.util.Scanner;

public class CustomerService implements IPersonService {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IPersonRepository<Customer> customerRepository = new CustomerRepository();
    private static final Validate validate = new Validate();

    @Override
    public void create() {
        //-Mã khách hàng phải đúng định dạng: KH-YYYY, với YYYY là các số từ 0-9.
        //-Tên khách hàng phải viết hoa các ký tự đầu của mỗi từ.
        //-Phải đủ 18 tuổi (tính cả ngày + tháng)
        //-CMND phải đủ 9 hoặc 12 số.
        //-Số điện thoại phải bắt đầu từ 0 và đủ 10 số.
        String idPerSon = null;
        String namePerson;
        String dateOfBirth;
        String gender;
        String identityCard;
        String phoneNumber;
        String email;
        String typeCustomer = null;
        String address;
        boolean flag = true;
        do {
            System.out.println("Mời bạn nhập mã khách hàng (Theo định dạng: KH-YYYY, với YYYY là các số từ 0-9)");
            idPerSon = scanner.nextLine();
            Customer customer;
            try {
                flag = false;
                customer = customerRepository.getById(idPerSon);
                if (customer == null) {
                    continue;

                }
                throw new UniqueIDException("Trùng ID trong hệ thống");

            } catch (UniqueIDException e) {
                flag = true;
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("*****");
            }
        } while (!validate.validateIdCustomer(idPerSon) || flag);

        do {
            System.out.println("Mời bạn nhập họ tên (viết hoa các ký tự đầu của mỗi từ)");
            namePerson = scanner.nextLine();
        } while (!validate.validateNameCustomer(namePerson));

        System.out.println("Mời bạn nhập ngày sinh(Phải đủ 18 tuổi (tính cả ngày + tháng))");
        dateOfBirth = scanner.nextLine();

        gender = null;

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
            System.out.println("Mời bạn chọn loại khách");
            System.out.println("1.Diamond");
            System.out.println("2.Platinum");
            System.out.println("3.Gold");
            System.out.println("4.Silver");
            System.out.println("5.Member");
            System.out.println("Vui lòng chọn chức năng");
            String upTypeCus = scanner.nextLine();
            switch (upTypeCus) {
                case "1":
                    typeCustomer = "Diamond";
                    break AD;
                case "2":
                    typeCustomer = "Platinum";
                    break AD;
                case "3":
                    typeCustomer = "Gold";
                    break AD;
                case "4":
                    typeCustomer = "Silver";
                    break AD;
                case "5":
                    typeCustomer = "Member";
                    break AD;
                default:
                    System.out.println("****");
                    break;
            }
        }

        System.out.println("Mời bạn nhập địa chỉ");
        address = scanner.nextLine();
        Customer customer = new Customer(idPerSon, namePerson, dateOfBirth, gender, identityCard, phoneNumber, email, typeCustomer, address);
        customerRepository.add(customer);
        System.out.println("Thêm mới khách hàng thành công");
    }

    @Override
    public void remove() {
        System.out.println("Mời bạn nhập id khách hàng mà bạn muốn xóa khỏi danh sách");
        try {
            String idPerson = scanner.nextLine();
            Customer customer = customerRepository.getById(idPerson);
            if (customer == null) {
                throw new IdNotFoundException("ID không tồn tại trong hệ thống");
            }
            System.out.println("Bạn có chắc chắn muốn xóa " + customer.getNamePerson() + " khỏi danh sách không?");
            System.out.println("1.Yes");
            System.out.println("2.No");
            System.out.println("Vui lòng chọn chức năng");
            String choice = scanner.nextLine();
            if (choice.equals("1")) {
                customerRepository.remove(customer);
                System.out.println("Xóa khách hàng thành công");
            }
        } catch (IdNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("****");
        }
    }

    @Override
    public void update() {
        System.out.println("Mời bạn nhập id khách hàng cần chỉnh sửa thông tin");
        String idPerson = scanner.nextLine();

        try {
            Customer customer = customerRepository.getById(idPerson);
            if (customer == null) {
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
                    System.out.println("7.Loại khách");
                    System.out.println("8.Địa chỉ");
                    System.out.println("0.Quay lại Menu");
                    boolean flag = true;
                    while (true) {
                        try {
                            choice = Integer.parseInt(scanner.nextLine());
                            if (choice < 0 || choice > 8) {
                                throw new NumberFormatException("Nhập sai nhập lại");
                            }
                            break;

                        } catch (NumberFormatException numberFormatException) {
                            System.out.println(numberFormatException.getMessage());
                        }
                        catch (Exception e) {
                            System.out.println("******");
                        }
                    }
                    String namePerson;
                    switch (choice) {

                        case CHOICE_ONCE:
                            do {
                                System.out.println("Mời bạn nhập tên mới(viết hoa các ký tự đầu của mỗi từ)");
                                namePerson = scanner.nextLine();
                            } while (!validate.validateNameCustomer(namePerson));
                            customer.setNamePerson(namePerson);
                            break;
                        case CHOICE_TWICE:
                            System.out.println("Mời bạn nhập ngày sinh mới");
                            String dayOfBirth = scanner.nextLine();
                            customer.setDateOfBirth(dayOfBirth);
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
                            customer.setGender(gender);
                            break;
                        case CHOICE_FOUR:
                            System.out.println("Mời bạn nhập số CMND mới");
                            String idCard = scanner.nextLine();
                            customer.setIdentityCard(idCard);
                            break;
                        case CHOICE_FIVE:
                            System.out.println("Mời bạn nhập số diện thoại mới");
                            String phoneNumber = scanner.nextLine();
                            customer.setPhoneNumber(phoneNumber);
                            break;
                        case CHOICE_SIX:
                            String email;
                            do {
                                System.out.println("Mời bạn nhập Email mới");
                                email = scanner.nextLine();
                            } while (!validate.validateEmail(email));
                            customer.setEmail(email);
                            break;
                        case CHOICE_SEVEN:
                            //Diamond, Platinum, Gold, Silver, Member
                            System.out.println("Mời bạn chọn loại khách hàng");
                            System.out.println("1.Diamond");
                            System.out.println("2.Platinum");
                            System.out.println("3.Gold");
                            System.out.println("4.Silver");
                            System.out.println("5.Member");
                            System.out.println("Vui lòng chọn chức năng");
                            String typeCustomer = null;
                            String upTypeCus = scanner.nextLine();
                            AC:
                            while (true) {
                                switch (upTypeCus) {
                                    case "1":
                                        typeCustomer = "Diamond";
                                        break AC;
                                    case "2":
                                        typeCustomer = "Platinum";
                                        break AC;
                                    case "3":
                                        typeCustomer = "Gold";
                                        break AC;
                                    case "4":
                                        typeCustomer = "Silver";
                                        break AC;
                                    case "5":
                                        typeCustomer = "Member";
                                        break AC;
                                    default:
                                        System.out.println("****");
                                        break;
                                }
                            }
                            customer.setTypeCustomer(typeCustomer);
                        case CHOICE_EIGHT:
                            System.out.println("Mời bạn nhập địa chỉ mới");
                            String address = scanner.nextLine();
                            customer.setAddress(address);
                            break;
                        case CHOICE_ZERO:
                            customerRepository.update(idPerson, customer);
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
        List<Customer> customerList = customerRepository.display();
        for (Customer customer : customerList) {
            System.out.println(customer);
        }
    }
}

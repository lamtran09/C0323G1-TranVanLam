package case_study.repository.person;

import case_study.common.WriteAndReadToFile;
import case_study.model.person.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository {
    private static final String PATH_CUSTOMER = "src/case_study/ultis/customer.csv";
    private static List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> displayCustomer() {
        List<String> stringList = WriteAndReadToFile.readToFile(PATH_CUSTOMER);
        customers.clear();
        String[] str;
        for (String s : stringList) {
            str = s.split(",");
            customers.add(new Customer(str[0], str[1], str[2], str[3], str[4], str[5], str[6], str[7], str[8]));
        }
        return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        List<String> strings = new ArrayList<>();
        strings.add(customer.getIdPerSon() + "," + customer.getNamePerson() + "," + customer.getDateOfBirth() + "," + customer.getGender() + "," + customer.getIdentityCard() + "," + customer.getPhoneNumber() + "," + customer.getEmail() + "," + customer.getTypeCustomer() + "," + customer.getAddress());
        WriteAndReadToFile.writeToFile(PATH_CUSTOMER,strings,true);
    }

    @Override
    public void removeEmployee(Customer customer) {
        customers = displayCustomer();
        customers.remove(customer);
        List<String> stringList = new ArrayList<>();
        for (Customer temp: customers) {
            stringList.add(temp.getIdPerSon()+","+temp.getNamePerson()+","+temp.getDateOfBirth()+","+temp.getGender()+","+temp.getIdentityCard()+","+temp.getPhoneNumber()+","+temp.getEmail()+","+temp.getTypeCustomer()+","+temp.getAddress());
        }
        WriteAndReadToFile.writeToFile(PATH_CUSTOMER,stringList,false);
    }

    @Override
    public Customer getCustomer(String idPerson) {
        customers = displayCustomer();
        for (Customer customer: customers) {
            if(customer.getIdPerSon().equals(idPerson)){
                return customer;
            }
        }
        return null;
    }

    @Override
    public List<Customer> searchCustomer(String namePerson) {
        customers = displayCustomer();
        List<Customer> customerList = new ArrayList<>();
        for (Customer s: customers) {
            if(s.getNamePerson().contains(namePerson)){
                customerList.add(s);
            }
        }
        return customerList;
    }
}

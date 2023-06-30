package case_study.repository.person;

import case_study.model.person.Customer;
import extra_exercises.extra_exercises_1.common.ReadToFile;
import extra_exercises.extra_exercises_1.common.WriteToFile;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements IPersonRepository<Customer> {
    private static final String PATH_DATA = "src/case_study/data/customer.csv";
    private static List<Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> display() {
        List<String> stringList = ReadToFile.readToFile(PATH_DATA);
        customers.clear();
        String[] info;
        for (String str : stringList) {
            info = str.split(",");
            customers.add(new Customer(info[0], info[1], info[2], info[3], info[4], info[5], info[6], info[7], info[8]));
        }
        if (customers.size()<1) {
            System.out.println("---------Hệ thống chưa có dữ liệu----------");
        }
        return customers;
    }

    @Override
    public void add(Customer person) {
        List<String> stringList = new ArrayList<>();
        stringList.add(person.infoCustomerToCSV());
        WriteToFile.writeToFile(PATH_DATA, stringList, true);
    }

    @Override
    public void remove(Customer person) {
        customers = display();
        customers.remove(person);
        List<String> stringList = new ArrayList<>();
        for (Customer customer : customers) {
            stringList.add(customer.infoCustomerToCSV());
        }
        WriteToFile.writeToFile(PATH_DATA, stringList, false);
    }

    @Override
    public Customer getById(String id) {
        customers = display();
        for (Customer customer : customers) {
            if (customer.getIdPerSon().equals(id)) {
                return customer;
            }
        }
        return null;
    }

    @Override
    public void update(String id, Customer person) {
        customers = display();
        List<String> stringList = new ArrayList<>();
        for (Customer customer: customers) {
            if(customer.getIdPerSon().equals(id)){
                customer = person;
            }
            stringList.add(customer.infoCustomerToCSV());
        }
        WriteToFile.writeToFile(PATH_DATA,stringList,false);
    }

}
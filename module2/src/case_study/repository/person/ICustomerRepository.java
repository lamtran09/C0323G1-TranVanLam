package case_study.repository.person;

import case_study.model.person.Customer;
import case_study.model.person.Employee;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> displayCustomer();
    public void addCustomer(Customer customer);

    public void removeEmployee(Customer customer);

    Customer getCustomer(String idPerson);

    List<Customer> searchCustomer(String namePerson);
}

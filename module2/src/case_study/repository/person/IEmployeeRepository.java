package case_study.repository.person;

import case_study.model.person.Employee;

import java.util.List;

public interface IEmployeeRepository {
    List<Employee> displayEmployee();

    public void addEmployee(Employee employee);

    public void removeEmployee(Employee employee);

    Employee getIdPerson(String idPerson);

    List<Employee> searchEmployee(String namePerson);

    public void editEmployee(int index,Employee employee);
}

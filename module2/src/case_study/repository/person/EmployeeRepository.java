package case_study.repository.person;

import case_study.common.WriteAndReadToFile;
import case_study.model.person.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private static final String PATH_EMPLOYEE = "src/case_study/ultis/employee.csv";
    private  static List<Employee> employeeList = new ArrayList<>();
    @Override
    public List<Employee> displayEmployee() {
        //String idPerSon, String namePerson, String dateOfBirth, boolean gender, int identityCard, int phoneNumber, String email, String level, String location, float wage
        List<String> stringList = WriteAndReadToFile.readToFile(PATH_EMPLOYEE);
        stringList.clear();
        String[] arr;
        for (String s:stringList) {
            arr = s.split(",");
            employeeList.add(new Employee(arr[0],arr[1],arr[2],arr[3],arr[4],arr[5],arr[6],arr[7],arr[8],Long.parseLong(arr[9])));
        }
        return employeeList;
    }

    @Override
    public void addEmployee(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getIdPerSon()+","+employee.getNamePerson()+","+employee.getDateOfBirth()+","+employee.getGender()+","+employee.getIdentityCard()+","+employee.getPhoneNumber()+","+employee.getEmail()+","+employee.getLevel()+","+employee.getLocation()+","+employee.getWage());
        WriteAndReadToFile.writeToFile(PATH_EMPLOYEE,stringList,true);
    }

    @Override
    public void removeEmployee(Employee employee) {
        employeeList = displayEmployee();
        employeeList.remove(employee);
        List<String> stringList = new ArrayList<>();
        for (Employee employee1: employeeList) {
            stringList.add(employee1.getIdPerSon()+","+employee1.getNamePerson()+","+employee1.getDateOfBirth()+","+employee1.getGender()+","+employee1.getIdentityCard()+","+employee1.getPhoneNumber()+","+employee1.getEmail()+","+employee1.getLevel()+","+employee1.getLocation()+","+employee1.getWage());
        }
        WriteAndReadToFile.writeToFile(PATH_EMPLOYEE,stringList,false);
    }

    @Override
    public Employee getIdPerson(String idPerson) {
        employeeList = displayEmployee();
        for (Employee employee: employeeList) {
            if(employee.getIdPerSon().equals(idPerson)){
                return employee;
            }
        }return null;
    }
}

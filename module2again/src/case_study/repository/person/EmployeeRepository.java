package case_study.repository.person;

import case_study.model.person.Employee;
import extra_exercises.extra_exercises_1.common.ReadToFile;
import extra_exercises.extra_exercises_1.common.WriteToFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeRepository implements IPersonRepository<Employee>{
    private static final String PATH_DATA = "src/case_study/data/employee.csv";
    private static final List<Employee>employees = new ArrayList<>();
    @Override
    public List<Employee> display() {
        List<String> stringList = ReadToFile.readToFile(PATH_DATA);
        employees.clear();
        String[] info;
        for (String str: stringList) {
            info = str.split(",");
            employees.add(new Employee(info[0],info[1],info[2],info[3],info[4],info[5],info[6],info[7],info[8],Long.parseLong(info[9])));
        }
        if(employees.isEmpty()){
            System.out.println("Hệ thống chưa có dữ liệu");
        }
        return employees;
    }

    @Override
    public void add(Employee person) {
        List<String> stringList = new ArrayList<>();
        stringList.add(person.infoEmployeeToCSV());
        WriteToFile.writeToFile(PATH_DATA,stringList,true);
    }

    @Override
    public void remove(Employee person) {

    }

    @Override
    public Employee getById(String id) {
        return null;
    }

    @Override
    public void update(String id, Employee person) {

    }


}

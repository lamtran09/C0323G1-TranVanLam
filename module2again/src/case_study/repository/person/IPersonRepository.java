package case_study.repository.person;

import case_study.model.person.Employee;
import case_study.model.person.Person;

import java.util.List;

public interface IPersonRepository<T> {
    List<T> display();
    void add(T person);
    void remove(T person);
    T getById(String id);
    void update(String id,T person);
}

package extra_exercises.extra_exercises_1.repository.classes;

import extra_exercises.extra_exercises_1.model.Student;
import extra_exercises.extra_exercises_1.model.Teacher;
import extra_exercises.extra_exercises_1.repository.impl.IStudentRepository;

import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private static final String PATH_STUDENT ="src/extra_exercises/extra_exercises_1/ultils/student.csv";
    private static final List<Student> studentList = new ArrayList<>();
    @Override
    public List<Student> displayStudent() {
        return null;
    }

    @Override
    public void addStudent(Student student) {

    }

    @Override
    public void removeStudent(Teacher teacher) {

    }

    @Override
    public Student getById(String idPerson) {
        return null;
    }
}

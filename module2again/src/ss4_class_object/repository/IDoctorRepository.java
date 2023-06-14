package ss4_class_object.repository;

import ss4_class_object.model.Doctor;

import java.util.List;

public interface IDoctorRepository {
    List<Doctor> display();
    void addDoctor(Doctor doctor);
    void removeDoctor(Doctor doctor);
    Doctor getNameDoctor(String nameDoctor);
}

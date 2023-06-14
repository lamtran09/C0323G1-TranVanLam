package ss4_class_object.repository;

import ss4_class_object.common.ReadToFile;
import ss4_class_object.common.WriteToFile;
import ss4_class_object.model.Doctor;

import java.util.ArrayList;
import java.util.List;

public class DoctorRepository implements IDoctorRepository{
    private static final String PATH_DOCTOR = "src/ss4_class_object/ultils/doctorlist.csv";
    private static  List<Doctor> doctorList = new ArrayList<>();
    @Override
    public List<Doctor> display() {
        List<String> stringList = ReadToFile.readToFile(PATH_DOCTOR);
        doctorList.clear();
        String[] info;
        for (String str: stringList) {
            info = str.split(",");
            doctorList.add(new Doctor(info[0],Integer.parseInt(info[1]),info[2],info[3],info[4],info[5]));
        }
        if(doctorList.isEmpty()){
            System.out.println("Không có dữ liệu");
        }
            return doctorList;
    }

    @Override
    public void addDoctor(Doctor doctor) {
        List<String> stringList = ReadToFile.readToFile(PATH_DOCTOR);
        stringList.add(doctor.getNameDoctor()+","+doctor.getYearOld()+","+doctor.getAddress()+","+doctor.getEmail()+","+doctor.getPhoneNumber()+","+doctor.getWorkingPosition());
        WriteToFile.writeToFile(PATH_DOCTOR,stringList,true);
    }

    @Override
    public void removeDoctor(Doctor doctor) {
        doctorList = display();
        doctorList.remove(doctor);
        List<String> stringList  = new ArrayList<>();
        for (Doctor doctor1: doctorList) {
            stringList.add(doctor1.getNameDoctor()+","+doctor1.getYearOld()+","+doctor1.getAddress()+","+doctor1.getEmail()+","+doctor1.getPhoneNumber()+","+doctor1.getWorkingPosition());
        }
        WriteToFile.writeToFile(PATH_DOCTOR,stringList,false);
    }

    @Override
    public Doctor getNameDoctor(String nameDoctor) {
       doctorList = display();
        for (Doctor doctor: doctorList) {
            if(doctor.getNameDoctor().equals(nameDoctor)){
                return  doctor;
            }
        }
        return null;
    }
}

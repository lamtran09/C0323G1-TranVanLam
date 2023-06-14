package ss4_class_object.service;

import ss4_class_object.model.Doctor;
import ss4_class_object.repository.DoctorRepository;

import java.util.List;
import java.util.Scanner;

public class DoctorService implements IDoctorService{
    private static final Scanner scanner = new Scanner(System.in);
    private static final DoctorRepository doctorRepository = new DoctorRepository();

    @Override
    public void display() {
        List<Doctor> doctorList = doctorRepository.display();
        for (Doctor doctor: doctorList) {
            System.out.println(doctor);
        }
    }

    @Override
    public void add() {
        System.out.print("Nhập tên bác sĩ: ");
        String nameDoctor = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int yearOld = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập địa chỉ: ");
        String address =scanner.nextLine();
        System.out.print("Nhập email: ");
        String email = scanner.nextLine();
        System.out.print("Nhập số điện thoại: ");
        String phoneNumber =scanner.nextLine();
        System.out.print("Nhập địa chỉ làm việc: ");
        String workingPosition = scanner.nextLine();
        Doctor doctor = new Doctor(nameDoctor,yearOld,address,email,phoneNumber,workingPosition);
        doctorRepository.addDoctor(doctor);
    }

    @Override
    public void delete() {
        System.out.print("Nhập tên bác sĩ mà bạn muốn xóa: ");
        String nameDoctor = scanner.nextLine();
        Doctor doctor = doctorRepository.getNameDoctor(nameDoctor);
        if(doctor ==null){
            System.out.println("Không có bác sĩ này trong danh sách");
        }else {
            System.out.println("Bạn có chắc chắn muốn xóa bác sĩ "+doctor.getNameDoctor()+" ra khỏi danh sách không?\n" +
                    "1.Chắc chắn rồi!\n" +
                    "2.Suy nghĩ lại");
            System.out.println("Chọn suy nghĩ của bạn: ");
            String choice =scanner.nextLine();
            if(choice.equals("1")){
                doctorRepository.removeDoctor(doctor);
                System.out.println("Xóa thành công!!!!!");
            }
        }
    }
}

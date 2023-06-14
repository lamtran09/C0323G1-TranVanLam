package ss4_class_object.model;

import java.util.Objects;

public class Doctor {
    private String nameDoctor;
    private int yearOld;
    private String address;
    private String email;
    private String phoneNumber;
    private String workingPosition;

    public Doctor() {
    }

    public Doctor(String nameDoctor, int yearOld, String address, String email, String phoneNumber, String workingPosition) {
        this.nameDoctor = nameDoctor;
        this.yearOld = yearOld;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.workingPosition = workingPosition;
    }

    public String getNameDoctor() {
        return nameDoctor;
    }

    public void setNameDoctor(String nameDoctor) {
        this.nameDoctor = nameDoctor;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(nameDoctor, doctor.nameDoctor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameDoctor);
    }

    @Override
    public String toString() {
        return "Doctor: " +
                "nameDoctor='" + nameDoctor + '\'' +
                ", yearOld=" + yearOld +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", workingPosition='" + workingPosition + '\'';
    }
}

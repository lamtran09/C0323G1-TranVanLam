package case_study.model.person;

import java.util.Objects;

public abstract class Person {
    private String idPerSon;
    private String namePerson;
    private String dateOfBirth;
    private String gender;
    private String identityCard;
    private String phoneNumber;
    private String email;

    public Person() {
    }

    /**
     * @param idPerSon     Mã
     * @param namePerson   Họ tên
     * @param dateOfBirth  Ngày sinh
     * @param gender       Giới tính
     * @param identityCard Số CMND
     * @param phoneNumber  Số Điện Thoại
     * @param email        Email
     * @creator: Lâm
     */

    public Person(String idPerSon, String namePerson, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email) {
        this.idPerSon = idPerSon;
        this.namePerson = namePerson;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.identityCard = identityCard;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getIdPerSon() {
        return idPerSon;
    }

    public void setIdPerSon(String idPerSon) {
        this.idPerSon = idPerSon;
    }

    public String getNamePerson() {
        return namePerson;
    }

    public void setNamePerson(String namePerson) {
        this.namePerson = namePerson;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(String identityCard) {
        this.identityCard = identityCard;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(idPerSon, person.idPerSon) && Objects.equals(namePerson, person.namePerson) && Objects.equals(dateOfBirth, person.dateOfBirth) && Objects.equals(gender, person.gender) && Objects.equals(identityCard, person.identityCard) && Objects.equals(phoneNumber, person.phoneNumber) && Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerSon, namePerson, dateOfBirth, gender, identityCard, phoneNumber, email);
    }

    @Override
    public String toString() {
        return                "idPerSon='" + idPerSon + '\'' +
                        ", namePerson='" + namePerson + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", gender=" + gender +
                        ", identityCard=" + identityCard +
                        ", phoneNumber=" + phoneNumber +
                        ", email='" + email + '\'';
    }
}

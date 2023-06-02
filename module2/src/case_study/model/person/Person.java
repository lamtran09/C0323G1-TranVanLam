package case_study.model.person;

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
     * @creator: Lâm
     * @param idPerSon Mã
     * @param namePerson Họ tên
     * @param dateOfBirth Ngày sinh
     * @param gender Giới tính
     * @param identityCard Số CMND
     * @param phoneNumber Số Điện Thoại
     * @param email  Email
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
    public String toString() {
        return "Person{" +
                "idPerSon='" + idPerSon + '\'' +
                ", namePerson='" + namePerson + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender +
                ", identityCard=" + identityCard +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }
}

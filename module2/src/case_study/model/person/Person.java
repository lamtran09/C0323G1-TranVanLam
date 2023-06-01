package case_study.model.person;

public abstract class Person {
    private String idPerSon;
    private String namePerson;
    private String dateOfBirth;
    private boolean gender;
    private int identityCard;
    private int phoneNumber;
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

    public Person(String idPerSon, String namePerson, String dateOfBirth, boolean gender, int identityCard, int phoneNumber, String email) {
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

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getIdentityCard() {
        return identityCard;
    }

    public void setIdentityCard(int identityCard) {
        this.identityCard = identityCard;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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

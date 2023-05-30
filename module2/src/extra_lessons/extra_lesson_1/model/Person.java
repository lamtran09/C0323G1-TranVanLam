package extra_lessons.extra_lesson_1.model;

public abstract class Person {
    /**
     * @creator: Lâm
     * @date : 30/05/2023
     */
    // Mã, tên, ngày sinh, giới tính
    private String idPerson;
    private String namePerson;
    private String dateOfBirth;
    private String gender;

    public Person() {
    }

    public Person(String idPerson, String namePerson, String dateOfBirth, String gender) {
        this.idPerson = idPerson;
        this.namePerson = namePerson;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public String getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(String idPerson) {
        this.idPerson = idPerson;
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

    @Override
    public String toString() {
        return "idPerson='" + idPerson + '\'' +
                ", namePerson='" + namePerson + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender=" + gender;
    }
}

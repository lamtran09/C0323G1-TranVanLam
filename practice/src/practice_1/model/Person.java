package practice_1.model;

import java.util.Objects;

public abstract class Person {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(idPerson, person.idPerson);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerson);
    }

    @Override
    public String toString() {
        return "idPerson='" + idPerson + '\'' +
                ", namePerson='" + namePerson + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'';
    }
}

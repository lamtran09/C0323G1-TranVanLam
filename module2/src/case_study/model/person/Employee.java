package case_study.model.person;

public class Employee extends Person{
    private String level;
    private String location;
    private float wage;

    public Employee() {
    }

    public Employee(String idPerSon, String namePerson, String dateOfBirth, boolean gender, int identityCard, int phoneNumber, String email, String level, String location, float wage) {
        super(idPerSon, namePerson, dateOfBirth, gender, identityCard, phoneNumber, email);
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}

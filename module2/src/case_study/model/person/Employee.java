package case_study.model.person;

public class Employee extends Person{
    private String level;
    private String location;
    private long wage;

    public Employee() {
    }

    public Employee(String idPerSon, String namePerson, String dateOfBirth, String gender, String identityCard, String phoneNumber, String email, String level, String location, long wage) {
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

    public long getWage() {
        return wage;
    }

    public void setWage(long wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{"+ super.toString() +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage=" + wage +
                '}';
    }
}

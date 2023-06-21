package extra_exercises.extra_exercises_1.model;

public class Teacher extends Person{
    private String specialize;

    public Teacher() {
    }

    public Teacher(String idPerson, String namePerson, String dateOfBirth, String gender, String specialize) {
        super(idPerson, namePerson, dateOfBirth, gender);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    @Override
    public String toString() {
        return "Giảng viên: " + super.toString()+
                ", Chuyên môn: '" + specialize + '\'' ;
    }
}

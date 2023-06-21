package extra_exercises.extra_exercises_1.model;

public class Student extends Person{
    private String classes;
    private float score;

    public Student() {
    }

    public Student(String idPerson, String namePerson, String dateOfBirth, String gender, String classes, float score) {
        super(idPerson, namePerson, dateOfBirth, gender);
        this.classes = classes;
        this.score = score;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Học viên: " +super.toString()+
                ", Lớp: '" + classes + '\'' +
                ", Điểm: " + score ;
    }
}

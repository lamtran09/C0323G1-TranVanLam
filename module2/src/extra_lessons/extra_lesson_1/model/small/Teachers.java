package extra_lessons.extra_lesson_1.model.small;

import extra_lessons.extra_lesson_1.model.Person;

public class Teachers extends Person {
    private String specialize;

    public Teachers() {
    }

    public Teachers(String idPerson, String namePerson, String dateOfBirth, String gender, String specialize) {
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
        return super.toString() +
                "specialize='" + specialize ;
    }
}

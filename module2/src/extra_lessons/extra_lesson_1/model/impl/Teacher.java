package extra_lessons.extra_lesson_1.model.impl;

import extra_lessons.extra_lesson_1.model.Person;

public class Teacher extends Person {
    private String specialize;

    public Teacher() {
    }

    public Teacher(String id, String name, String dayOfBirth, String gender, String specialize) {
        super(id, name, dayOfBirth, gender);
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
        return "Teacher{" + super.toString() +
                "specialize='" + specialize + '\'' +
                '}';
    }

    public String readAndWriteToFile() {
        return getId() + "," + getName() + "," + getDayOfBirth() + "," + isGender() + "," + specialize;
    }
}

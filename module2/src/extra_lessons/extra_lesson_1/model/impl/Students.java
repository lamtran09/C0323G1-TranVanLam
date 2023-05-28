package extra_lessons.extra_lesson_1.model.impl;

import extra_lessons.extra_lesson_1.model.Person;

public class Students extends Person {
    private String classes;
    private float score;

    public Students() {
    }

    public Students(String id, String name, String dayOfBirth, String gender, String classes, float score) {
        super(id, name, dayOfBirth, gender);
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
        return "Students{" + super.toString()+
                "classes='" + classes + '\'' +
                ", score=" + score +
                '}';
    }
}

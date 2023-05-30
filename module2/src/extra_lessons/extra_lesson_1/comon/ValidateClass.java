package extra_lessons.extra_lesson_1.comon;

public class ValidateClass {
    private static final String CLASS_NAME_REGEX = "^C\\d{2}-23G1$";
    public static boolean validateCheckClassName( String nameClass) {
        return nameClass.matches(CLASS_NAME_REGEX);
    }
}

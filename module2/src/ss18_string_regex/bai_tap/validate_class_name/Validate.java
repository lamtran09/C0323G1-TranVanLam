package ss18_string_regex.bai_tap.validate_class_name;

public class Validate {
    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4}[GHIK]$";
    public static boolean validateCheckClassName( String nameClass) {
        return nameClass.matches(CLASS_NAME_REGEX);
    }
}

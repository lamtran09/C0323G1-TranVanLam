package ss18_string_regex.bai_tap.validate_phone_number;

public class Validate {
    private static final String PHONE_NUMBER_REGEX = "^\\d{2}-0\\d{9}$";
    public static boolean validatePhoneNumber(String phoneNumber){
        return phoneNumber.matches(PHONE_NUMBER_REGEX);
    }
}

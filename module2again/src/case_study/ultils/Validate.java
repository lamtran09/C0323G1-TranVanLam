package case_study.ultils;

public class Validate {
    private static final String REGEX_ID_CUSTOMER = "^KH-\\d{4}$";
    private static final String REGEX_ID_EMPLOYEE = "^NV-\\d{4}$";
    private static final String REGEX_NAME_CUSTOMER = "^[A-Z][a-z]{0,6}(\\s[A-Z][a-z]{1,6}){1,8}$";
    private static final String REGEX_IDENTITY_CARD = "^\\d{9}|\\d{12}$";
    private static final String REGEX_PHONE_NUMBER = "^(0)\\d{9}|(\\+84)\\d{9}$";
    private static final String REGEX_EMAIL = "^[a-zA-Z0-9]\\w{5,31}@[a-z]{1,11}\\.[a-z]{1,11}(\\.[a-z]{1,11})?$";

    public boolean validateIdCustomer(String id) {
        return id.matches(REGEX_ID_CUSTOMER);
    }  public boolean validateIdEmployee(String id) {
        return id.matches(REGEX_ID_EMPLOYEE);
    }

    public boolean validateNameCustomer(String name) {
        return name.matches(REGEX_NAME_CUSTOMER);
    }

    public boolean validateIdentityCard(String identityCard) {
        return identityCard.matches(REGEX_IDENTITY_CARD);
    }

    public boolean validatePhoneNumber(String phoneNumber) {
        return phoneNumber.matches(REGEX_PHONE_NUMBER);
    }

    public boolean validateEmail(String email) {
        return email.matches(REGEX_EMAIL);
    }
}

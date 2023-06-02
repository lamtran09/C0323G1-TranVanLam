package case_study.common;

public class Regex {
    private static final String IDENTITY_CARD_REGEX ="^\\d{9}|\\d{12}$";
    private static final String PHONE_NUMBER_REGEX ="^0\\d{9}$";
    private static final String ID_PERSON_REGEX ="^NV-\\d{4}$";
    private static final String NAME_PERSON_REGEX ="^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static  final String DATE_OF_BIRTH_REGEX = "^\\d{2}/\\d{2}/\\d{4}$";

    public static boolean validateIdentityCard(String identityCard){
        return identityCard.matches(IDENTITY_CARD_REGEX);
    }
    public static boolean validatePhoneNumber(String phoneNumber){
        return  phoneNumber.matches(PHONE_NUMBER_REGEX);
    }
    public static boolean validateIdPerson(String idPerson){
        return  idPerson.matches(ID_PERSON_REGEX);
    }
    public static boolean validateNamePerson(String namePerson){
        return namePerson.matches(NAME_PERSON_REGEX);
    }
    public  static boolean validateEmail(String email){
        return email.matches(EMAIL_REGEX);
    }
    public  static  boolean validateDateOfBirth(String dateOfBirth){
        return dateOfBirth.matches(DATE_OF_BIRTH_REGEX);

    }
}

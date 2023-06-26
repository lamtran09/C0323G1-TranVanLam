package ss19_string_regex;
    public class ValidateEmail {
        private static final String VALIDATE_REGEX_EMAIL_CUSTOMER = "^[A-Za-z0-9][A-Za-z0-9]{0,32}@[A-Za-z0-9]{2,12}(\\.[A-Za-z0-9]{2,12})$";

        public static boolean checkRegexEmailCustomer(String emailCustomer) {
            return emailCustomer.matches(VALIDATE_REGEX_EMAIL_CUSTOMER) ;
        }
    }


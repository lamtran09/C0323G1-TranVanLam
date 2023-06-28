package ss19_string_regex;
    public class ValidateEmail {
        private static final String VALIDATE_REGEX_EMAIL_CUSTOMER = "^[a-zA-Z0-9]\\w{5,31}@[a-z]{1,11}\\.[a-z]{1,11}(\\.[a-z]{1,11})?$";

        public static boolean checkRegexEmailCustomer(String emailCustomer) {
            return emailCustomer.matches(VALIDATE_REGEX_EMAIL_CUSTOMER) ;
        }
    }


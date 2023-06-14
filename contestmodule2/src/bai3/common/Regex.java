package bai3.common;

public class Regex {
    private static final String ID_PLAYER_VALIDATE = "^CT-\\d{3}$";
//    private static final String NAME_PLAYER_VALIDATE = "^[A-Z][a-z]$";
    private static final String DAY_OF_BIRTH_PLAYER_VALIDATE = "^\\d{2}/\\d{2}/\\d{4}$";
    private static final String ADDRESS_PLAYER_VALIDATE = "";
    public  static boolean validateIdPlayer(String idPlayer){
        return idPlayer.matches(ID_PLAYER_VALIDATE);
    }
//    public  static boolean validateNamePlayer(String namePlayer){
//        return namePlayer.matches(NAME_PLAYER_VALIDATE);
//    }
    public  static boolean validateDayOfBirthPlayer(String dayOfBirthPlayer){
        return dayOfBirthPlayer.matches(dayOfBirthPlayer);
    }
}

package ss8_clean_code.bai_tap;

public class TennisGame {

    public static void getScore( int scorePlayer1, int scorePlayer2) {
        String score;
        if (scorePlayer1 == scorePlayer2) {
            switch (scorePlayer1) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
        }
    }

    public static String getAdvantage(String player1Name, String player2Name, int scorePlayer1, int scorePlayer2) {
        String score = "";
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) score = "Advantage "+player1Name;
        else if (minusResult == -1) score = "Advantage "+player2Name;
        else if (minusResult >= 2) score = "Win for " + player1Name;
        else score = "Win for " + player2Name;
        return score;
    }

    public static String getPoint(int scorePlayer1, int scorePlayer2) {
        String score = "";
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

}

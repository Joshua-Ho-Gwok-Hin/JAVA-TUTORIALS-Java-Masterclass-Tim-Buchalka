public class HighScore {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("John", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Peter", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Ralph", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Linda", position);
    }

    public static void displayHighScorePosition(String playerName, int position){
        System.out.println(playerName + " managed to get into position " + position);
    }

    public static int calculateHighScorePosition(int playerScore){

        int position = 4;
        if (playerScore >= 1000){
            position = 1;
        }else if (playerScore >= 500){
            position = 2;
        }else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }
}

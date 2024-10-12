package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true, 800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore = calculateScore(true, 10000, 8, 200);
        System.out.println("Your final score was " + highScore);

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Aman", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Waifu 1", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Waifu 2", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Waifu 3", highScorePosition);


    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " Managed to get into position "
                 + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {

//        if (playerScore >= 1000) {
//            return 1;
//        } else if(playerScore >= 500) {
//            return 2;
//        } else if(playerScore >= 100) {
//            return 3;
//        } else {
//            return 4;
//        }
        int position = 4; // Assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {


        if (gameOver) { // if (gameOver) is the same as if (gameOver == true)
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }

        return -1;
    }


}


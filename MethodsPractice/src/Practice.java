public class Practice {

    public static int score(int myScore, String studentName) {

        if (myScore < 0 || myScore > 100) {

            System.out.println("Invalid value");

        } else if (myScore >= 40) {
            System.out.println("Congratulations " + studentName + " you have passed the module, you scored " + myScore + "%");
        } else {
            System.out.println("Sorry " + studentName + " Unfortunately you have failed the module you scored " + myScore + "%");
        } return -1;
        }
    }


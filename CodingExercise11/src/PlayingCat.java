public class PlayingCat {

    public static boolean isCatPlaying(boolean summer, int temperature) {

        if (summer == true && (temperature >= 25 && temperature <= 45 )) {
            System.out.println("Summer play");
            return true;
        } else if (summer == false && (temperature >= 25 && temperature <= 35)) {
            System.out.println("Normal play");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}

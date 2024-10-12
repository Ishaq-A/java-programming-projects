package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        byte myFirstByte = 10;
        short myFirstShort = 20;
        int myFirstInt = 50;

        long myFirstLong = 50000L + 10 * (myFirstByte + myFirstShort + myFirstInt);
        System.out.println(myFirstLong);
    }
}

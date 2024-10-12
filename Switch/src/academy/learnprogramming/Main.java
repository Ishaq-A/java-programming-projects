package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int value = 2;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3, or a 4, or a 5");
                break;

            default:
                System.out.println("Was not 1 or 2");
                break;

        }

        // Challenge

        char myChar = 'A';

        switch(myChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(myChar + " Was found");
                break;

            default:
                System.out.println("Could not find A, B, C, D, or E");
                break;
        }

        String month = "January";

        switch(month) {
            case "January":
                System.out.println("Jan");
                break;

            case "June":
                System.out.println("Jun");
                break;

            default:
                System.out.println("Not sure");
                break;
        }
    }
}

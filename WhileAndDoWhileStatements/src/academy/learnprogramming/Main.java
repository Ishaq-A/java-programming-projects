package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    int count = 0;
//	    while (count != 5) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//	    count = 0;
//	    while (true) {
//	        if (count == 5) {
//	            break;
//	        }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//	    count = 0;
//	    do {
//            System.out.println("Count value was " + count);
//            count++;
//        } while (count != 5);

    // Challenge

        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
            count++;
            if (count >= 5) {
                break;
            }
        }

        System.out.println(count + " Even numbers found");
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}

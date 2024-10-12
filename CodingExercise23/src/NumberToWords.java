public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int count = getDigitCount(number);
        number = reverse(number);

        for (int i = 1; i <= count; i++) {
            int digit = number % 10;
            switch (digit) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

                default: break;
            }
                number /= 10;
        }
    }

    public static int reverse(int number) {
        int reverse = 0;
        int digit = 0;
        while (number != 0) {
            digit = number % 10;
            reverse = (reverse * 10)  + digit;
            number /= 10;
        }
            return reverse;
    }

    public static int getDigitCount(int number) {
        if (number < 0) {
            return -1;
        }

        int count = 0;
        do {
            count++;
            number /= 10;
        } while (number > 0);
            return count;
    }
}

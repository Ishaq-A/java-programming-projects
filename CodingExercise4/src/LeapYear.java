public class LeapYear {

    public static boolean isLeapYear(int year) {

        if (year < 1 || year > 9999) {
            System.out.println(year + " is invalid");
            return false;
        } else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
            return true;
        } else {
            System.out.println(year + " is not a leap year");
            return false;
        }

    }
}

// NOTE: A year is a leap year if it can be exactly divided by 4
// Except if it can be exactly divided by 100
// Except IF it can be exactly divided by 400.

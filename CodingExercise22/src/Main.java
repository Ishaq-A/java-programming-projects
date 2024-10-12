public class Main {

    public static void main(String [] args) {

        System.out.println("6 is a perfect number: 1 + 2 + 3 = 6 " + PerfectNumber.isPerfectNumber(6));
        System.out.println("28 is a perfect number: 1 + 2 + 4 + 7 + 14 = 28 " + PerfectNumber.isPerfectNumber(28));
        System.out.println("10 is not a perfect number: 1 + 5 does not equal 10 " + PerfectNumber.isPerfectNumber(10));
        System.out.println("5 is not a perfect number: 1 does not equal 5 " + PerfectNumber.isPerfectNumber(5));
        System.out.println("-1 is an invalid number " + PerfectNumber.isPerfectNumber(-1));
    }
}

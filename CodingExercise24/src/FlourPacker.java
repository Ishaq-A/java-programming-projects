public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        // bigCount represents count of big flour bags (5 kilos each).
        // smallCount represents count of small flour bags (1 kilo each).
        // Goal represents amount of kilos of flour to assemble a package.
        // Goal must equal the sum of the kilos of bigCount and smallCount.

        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        int bigBag = goal % 5; // Remainder of big bags.
        int numBigBag = goal / 5; // The number of big bags needed from goal.
        int kgBigBag = bigCount * 5; // Number of kilograms in a big bag.

        if ((bigBag == 0) && bigCount >= numBigBag) {
            return true;
        } else if (smallCount >= goal && goal > 0) {
            return true;
        } else if ((kgBigBag + smallCount >= goal) && goal > 0) {
            return bigBag <= smallCount;
        }
            return false;
    }
}

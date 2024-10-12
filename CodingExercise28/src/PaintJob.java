public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        double area = width * height; // Calculate the area of the wall.
        double totalBuckets = Math.ceil(area / areaPerBucket); // Calculate the total number of buckets.

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) { // If any conditions are met.
            return -1; // Returns a value of -1.
        } else { // Else the conditions are NOT met.
            return (int) totalBuckets - extraBuckets; // Returns the number of buckets needed.
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        double area = width * height;
        double totalBuckets = Math.ceil(area / areaPerBucket);

        if ((width <= 0) || (height <= 0) || (areaPerBucket <= 0)) {
            return -1;
        } else {
            return (int) totalBuckets;
        }
    }

    public static int getBucketCount(double area, double areaPerBucket) {

        int numberOfBuckets = (int) Math.ceil(area / areaPerBucket);

        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        } else {
            return numberOfBuckets;
        }
    }
}

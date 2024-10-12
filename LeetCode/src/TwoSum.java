public class TwoSum {

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 9;
        int[] sol = solution(array, target);
        for(int i : sol) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == target - nums[i]) {
                    return new int[] { i, j };
                }
            }
        }
        // In case there is no solution, we'll just return null
        return null;
    }
}

import java.util.ArrayList;

public class C1 {
    public static void main(String[] args) {
        String number2 = "1,2,3,4,5,6,7,8,9";
        StringBuilder builder = new StringBuilder();
        String[] array = number2.split(",");

        for(int i = 0; i < array.length; i++) {
            builder.append(array[i] + ", ");
        }
        System.out.println(builder.toString().trim());

        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        StringBuilder sb = new StringBuilder();
        String numberString = null;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                sb.append(numbers[i][j]).append(" ");
                numberString = sb.toString().trim();
            }
        }
        System.out.println(numberString);

        ArrayList<Integer> cards = new ArrayList<>();
        cards.add(0);
        cards.add(1);
        cards.add(2);
        cards.add(3);
        cards.add(4);

        for(int i = 0; i < cards.size(); i++) {
            System.out.print(cards.get(i));
        }
        System.out.println();

        boolean[][] arr = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, false, false}
        };

        boolean allTrue = true;

        for(int i = 0; i < arr.length && allTrue; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(!arr[i][j]) {
                    allTrue = false;
                    break;
                }
            }
        }

        if(allTrue) {
            System.out.println("Array is all true");
        }

        if(!allTrue) {
            System.out.println("Array is not all true");
        }

        int numnums = 7;

        boolean exists = false;

        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers[i].length; j++) {
                if(numbers[i][j] == numnums) {
                    arr[i][j] = true;
                    exists = true;
                    break;
                }
            }
        }

        System.out.println(numbers[1][2]);
        System.out.println(arr[1][2]);
    }
}

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[][] numbers = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        StringBuilder sb = new StringBuilder();
        String numberString = null;

        for(int i = 0; i < numbers.length; i++) {
            for(int j= 0; j < numbers[i].length; j++) {
                sb.append(numbers[i][j]).append(" ");
                numberString = sb.toString().trim();
            }
        }

//        System.out.println(numberString);


        String nums = "1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16";
        int[] number = new int[nums.length()];
        String[] numArr = nums.split(" ");

        // Convert string array to an int array and store values
        for(int i = 0; i < numArr.length; i++) {
            number[i] = Integer.parseInt(numArr[i]);
        }

        //TODO: String version of grid

//        String[][] example = new String[4][4];
//        int k = 0;
//
//        // Saving 1D string array values to 2D string array
//        for(int i = 0; i < example.length; i++) {
//            for(int j = 0; j < example[i].length; j++) {
//                example[i][j] = numArr[k];
//                k++;
//            }
//        }
//
//        // Printing the grid
//        for(int i = 0; i < example.length; i++) {
//            for(int j = 0; j < example[i].length; j++) {
//                System.out.printf("%2s ", example[i][j]);
//            }
//            System.out.printf("%n");
//        }

        //TODO: int version of grid

        int[][] vector = new int[4][4];
        int k = 0;

        // Saving 1D int array values to 2D int array
        for(int i = 0; i < vector.length; i++) {
            for(int j = 0; j < vector[i].length; j++) {
                vector[i][j] = number[k];
                k++;
            }
        }

        // Printing the grid
        for(int i = 0; i < vector.length; i++) {
            for(int j = 0; j < vector[i].length; j++) {
                if(j == vector[0].length - 1) {
                    System.out.printf("%2d%s", vector[i][j], "");
                } else {
                    System.out.printf("%2d%s", vector[i][j], " ");
                }

            }
            System.out.printf("%n");
        }


    }
}

public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) {
                for (int column = 0; column < number; column++) {
                    if (row == 0 || row == number - 1) System.out.print("*"); // Top and bottom rows.
                    else if (column == 0) System.out.print("*"); // Left column.
                    else if (column == number - 1) System.out.print("*"); // Right column.
                    else if (column == row) System.out.print("*"); // Diagonal top-left to bottom-right.
                    else if (column == number - 1 - row) System.out.print("*"); // Diagonal top-right to bottom left.

                    else System.out.print(" "); // Empty space between numbers.
                }
                System.out.println(""); // Puts a return to the row;
            }
        }
    }
}

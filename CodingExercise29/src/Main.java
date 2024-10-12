public class Main {

    public static void main(String [] args) {

        simpleCalculator calculator = new simpleCalculator();
        calculator.setFirstNumber(5.0);
        calculator.setSecondNumber(4);
        System.out.println("Add = " + calculator.getAdditionResult());
        System.out.println("Subtract = " + calculator.getSubtractionResult());
        System.out.println("");
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);
        System.out.println("Multiply = " + calculator.getMultiplicationResult());
        System.out.println("Divide = " + calculator.getDivisionResult());
    }
}

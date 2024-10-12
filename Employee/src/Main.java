import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        Employee emp1 = new Employee("Aman", "Ishaq", "Development", new BigDecimal("1000000"));
        System.out.println(emp1.getSalary());
    }
}

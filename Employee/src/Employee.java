import java.math.BigDecimal;

public class Employee {

    private String firstname;
    private String lastName;
    private String department;
    BigDecimal salary;

    public Employee(String firstname, String lastName, String department, BigDecimal salary) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getDepartment() {
        return this.department;
    }

    public BigDecimal getSalary() {
        return this.salary;
    }
}

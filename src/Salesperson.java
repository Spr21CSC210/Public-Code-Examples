
public class Salesperson extends Employee {

    private static final double COMMISSION = 0.10;
    private double salesAmount;

    public Salesperson(String name, double salary, double salesAmount) {
        super(name, salary);
        this.salesAmount = salesAmount;
    }

    public double getSalary() {
        return super.getSalary() + salesAmount * COMMISSION;
    }

}

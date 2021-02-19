package midterm2;

public class Salesperson extends Employee {

    private static final double COMMISSION = 0.1;

    private double salesAmount;

    public Salesperson(String name, double salary, double salesAmount) {
        super(name, salary);

        // Extra Salesperson specific items down here.
        this.salesAmount = salesAmount;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + salesAmount * COMMISSION;
    }

    public boolean equals(Object o) {
        if (o instanceof Salesperson) {
            Salesperson other = (Salesperson) o;
            return super.equals(o) && this.salesAmount == other.salesAmount;
        } else {
            return false;
        }
    }

    public static String motto() {
        return "Buy buy buy - NSYNC";
    }

}

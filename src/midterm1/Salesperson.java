package midterm1;

public class Salesperson extends Employee {

    public enum State {
        AZ, CO, UT, TX, NM, CA
    }

    private static final double COMMISSION = 0.10;
    private double salesAmount;
    private State territory;

    public Salesperson(String name, double salary, double salesAmount) {
        this(name, salary, salesAmount, State.AZ);
    }

    public Salesperson(String name, double salary, double salesAmount,
            State territory) {
        super(name, salary);
        this.salesAmount = salesAmount;
        this.territory = territory;
    }

    @Override
    public double getSalary() {
        return super.getSalary() + salesAmount * COMMISSION;
    }

    public String getSalesPitch() {
        return "I, " + super.getName()
                + " am the best salesperson, so buy buy buy - NSYNC";
    }

    public boolean equals(Object o) {
        if (o instanceof Salesperson) {
            Salesperson other = (Salesperson) o;
            return super.equals(o)
                    && this.salesAmount == other.salesAmount
                    && this.territory == other.territory;
        } else {
            return false;
        }
    }

    public static int numberOfSalespeople = 0;
    public static String motto() {
        return "I am a salesperson at the best company.";
    }

}

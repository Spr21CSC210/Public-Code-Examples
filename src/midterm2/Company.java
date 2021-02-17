package midterm2;

public class Company {

    public static void main(String[] args) {
        Salesperson tyler = new Salesperson("Tyler", 30000, 100000);
        Employee cindy = new Employee("Cindy", 65000);

        // An example of polymorphism
        // Compile-time type (declared) = Runtime type (actual)
        // No cast required to go from subclass Salesperson to compile-time type
        // Employee which is the superclass
        // Compile-time (declared) type = runtime (actual) type
        Employee arjun = new Salesperson("Arjun", 30000, 200000);

        // The below does not work, since Salesperson is a subclass of Employee
        // Salesperson tiamara = new Employee("Tiamara", 45000);

        Employee[] payroll = new Employee[3];
        payroll[0] = tyler;
        payroll[1] = cindy;
        payroll[2] = arjun;
        /*
         * Notice that the overriden method is called for 'arjun'.
         * The method that gets called at run-time depends on the
         * actual (run-time) type, NOT the declared type.
         */
        for (int index = 0; index < payroll.length; index++) {
            System.out.println(payroll[index].getSalary());
        }

        System.out.println(tyler.getSalesAmount());
        // System.out.println(arjun.getSalesAmount());

        // This would produce a runtime error.
        // System.out.println(((Salesperson) cindy).getSalesAmount());


        System.out.println(tyler instanceof Object);
        System.out.println(tyler instanceof Employee);
        System.out.println(tyler instanceof Salesperson);

        System.out.println(cindy instanceof Employee);
        System.out.println(cindy instanceof Salesperson);

        System.out.println(arjun instanceof Employee);
        System.out.println(arjun instanceof Salesperson);

        System.out.println(tyler.getSalary());
        System.out.println(tyler.getName());
    }

}

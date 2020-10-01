package midterm1;

public class Company {

    public static void main(String[] args) {
        // System.out.println(Employee.motto());
        // System.out.println(Salesperson.motto());
        Salesperson.numberOfSalespeople += 1;

        Employee susan = new Employee("Susan", 60000);

        Salesperson tyler = new Salesperson("Tyler", 35000, 10000);

        // An example of polymorphism
        // Compile-time type (declared) = Runtime type (actual)
        // No cast required to go from subclass Salesperson to compile-time type
        // Employee which is the superclass
        Employee arjun = new Salesperson("Arjun", 35000, 50000);

        Salesperson[] salesPeople = new Salesperson[3];
        salesPeople[0] = tyler;
        /*
         * Must cast in the below instance since arjun has compile-time
         * type of Employee which is a superclass of Salesperson
         */
        salesPeople[1] = (Salesperson) arjun;

        /* Casts to unrelated types are not allowed. */
        // Scanner example = (Scanner) tyler;

        tyler.equals(arjun);
        arjun.equals(tyler);

        // The below does not work, since Salesperson is a subclass of Employee
        // Salesperson cindy = new Employee("Cindy", 30000);

        System.out.println(susan);
        System.out.println();
        System.out.println(susan.getSalary());
        System.out.println(tyler.getSalary());
        /*
         * Notice that the overriden method is called for 'arjun'.
         * The method that gets called at run-time depends on the
         * actual (run-time) type, NOT the declared type.
         */
        System.out.println(arjun.getSalary());
        System.out.println();

        Employee[] employees = new Employee[3];
        employees[0] = susan;
        employees[1] = tyler;
        employees[2] = arjun;
        for (int i = 0; i < 3; i++) {
            // Notice how this always calls the 'correct' getSalary() method.
            // i.e. the overridden method.
            System.out.println(employees[i].getSalary());
        }

        System.out.println();
        System.out.println(susan instanceof Employee);
        System.out.println(susan instanceof Salesperson);
        System.out.println();

        System.out.println(tyler instanceof Employee);
        System.out.println(tyler instanceof Salesperson);
        System.out.println();

        System.out.println(arjun instanceof Employee);
        System.out.println(arjun instanceof Salesperson);


        /*
         * The below gives an error since 'getSalesPitch' is a
         * method ONLY declared in the Salesperson class.
         */
        // System.out.println(susan.getSalesPitch());

        System.out.println(tyler.getSalesPitch());

        /*
         * The below gives an error since 'getSalesPitch' is a
         * method ONLY declared in the Salesperson class and
         * 'arjun' has a declared (compile-time) type of Employee.
         */
        // System.out.println(arjun.getSalesPitch());
    }

}


public class Company {

    public static void main(String[] args) {
        Employee susan = new Employee("Susan", 60000);

        Salesperson tyler = new Salesperson("Tyler", 35000, 10000);

        // An example of polymorphism
        // Compile-time type (declared) = Runtime type (actual)
        Employee arjun = new Salesperson("Arjun", 35000, 50000);

        // The below does not work!!
        // Salesperson cindy = new Employee("Cindy", 30000);

        System.out.println(susan);
        System.out.println();
        System.out.println(susan.getSalary());
        System.out.println(tyler.getSalary());
        // Does the below print out the correct salary?
        System.out.println(arjun.getSalary());
        System.out.println();

        Employee[] employees = new Employee[5];
        employees[0] = susan;
        employees[1] = tyler;
        employees[2] = arjun;
        for (int i = 0; i < 3; i++) {
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

    }

}

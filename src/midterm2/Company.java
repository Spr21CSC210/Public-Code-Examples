package midterm2;

public class Company {

    public static void main(String[] args) {
        Salesperson tyler = new Salesperson("Tyler", 30000, 45000);

        System.out.println(tyler.getSalary());
        System.out.println(tyler.getName());
    }

}

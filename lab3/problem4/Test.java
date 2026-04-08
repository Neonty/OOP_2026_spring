package problem4;
import java.util.*;

public class Test {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("Nurassyl", 500000, new Date(), "INS123");
        Employee e2 = new Employee("Danial", 700000, new Date(), "INS456");

        Manager m1 = new Manager("Almaz", 800000, new Date(), "INS789", 1000);
        m1.addEmployee(e1);
        m1.addEmployee(e2);

        System.out.println(e1);
        System.out.println(m1);

        System.out.println(e1.equals(e2));

        System.out.println(e1.compareTo(e2));

        List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);

        Collections.sort(list, new NameComparator());
        System.out.println("Sort by name: " + list);

        Collections.sort(list, new HireDateComparator());
        System.out.println("Sort by hire date: " + list);

        Employee e3 = (Employee) e1.clone();
        System.out.println("Cloned: " + e3);
    }
}
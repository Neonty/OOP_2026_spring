package problem5;
import java.util.Arrays;
import problem4.Employee;

public class Test {
    public static void main(String[] args) {

        Chocolate[] chocolates = {
            new Chocolate("Twix",    58),
            new Chocolate("KitKat", 41),
            new Chocolate("Snickers", 92),
            new Chocolate("Bounty",  57)
        };

        Sort.bubbleSort(chocolates);
        System.out.println("Chocolates: " + Arrays.toString(chocolates));

        Time[] times = {
            new Time(14, 30, 0),
            new Time(9,  15, 45),
            new Time(23, 59, 59),
            new Time(0,  0,  1)
        };

        Sort.mergeSort(times);
        System.out.println("Times: " + Arrays.toString(times));

        Employee[] employees = {
            new Employee("Nurassyl", 800000, new java.util.Date(), "INS-001"),
            new Employee("Madina",   1000000, new java.util.Date(), "INS-002"),
            new Employee("Damir", 750000, new java.util.Date(), "INS-003")
        };

        Sort.bubbleSort(employees);
        System.out.println("Employees: " + Arrays.toString(employees));
    }
}
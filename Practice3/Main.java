package Practice3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Person> people = new HashSet<>();
        
        while (true){
            System.out.println("1. Add a new person");
            System.out.println("2. Print info about all added persons");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1){
                System.out.print("Enter type (1: Person, 2: Student, 3: Staff/Employee): ");
                int type = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Name: ");
                String name = scanner.nextLine();
                
                System.out.print("Address: ");
                String address = scanner.nextLine();

                if (type == 1) {
                    people.add(new Person(name, address));
                }
                else if (type == 2) {
                    System.out.print("Program: ");
                    String prog = scanner.nextLine();

                    System.out.print("Year: ");
                    int year = scanner.nextInt();

                    System.out.print("Fee: ");
                    double fee = scanner.nextDouble();
                    people.add(new Student(name, address, prog, year, fee));
                }
                else if (type == 3) {
                    System.out.print("School: ");
                    String school = scanner.nextLine();

                    System.out.print("Pay: ");
                    double pay = scanner.nextDouble();

                    people.add(new Staff(name, address, school, pay));
                }
                System.out.println("Success!");
            }
            else if (choice == 2) {
                System.out.println("List of Users: \n");

                for (Person p : people) {
                    System.out.println(p.toString());
                }
            }
            else if (choice == 3) {
                break;
            }
        }
        scanner.close();
    }
}

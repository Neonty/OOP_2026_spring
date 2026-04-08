package problem4;
import java.util.*;

public class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee() {}

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);

        if (salary<=0){
            throw new IllegalArgumentException("Salary must be positive");
        }

        if (insuranceNumber.isBlank() || insuranceNumber == null){
            throw new IllegalArgumentException("InsuranceNumber cannot be empty");
        }

        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    public double getSalary(){
        return salary; 
    }

    public Date getHireDate(){ 
        return hireDate; 
    }

    public String getInsuranceNumber(){ 
        return insuranceNumber; 
    }

    public void setSalary(double salary) { 
        if (salary<=0){
            throw new IllegalArgumentException("Salary must be positive");
        }
        
        this.salary = salary; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Salary: " + salary + ", HireDate: " + hireDate + ", Insurance: " + insuranceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o))
            return false;
        if (!(o instanceof Employee)) 
            return false;
        Employee e = (Employee) o;
        return Double.compare(salary, e.salary) == 0 && Objects.equals(hireDate, e.hireDate) && Objects.equals(insuranceNumber, e.insuranceNumber);
    }

    @Override
    public int compareTo(Employee e) {
        return Double.compare(this.salary, e.salary);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee copy = (Employee) super.clone();
        copy.hireDate = (Date) hireDate.clone();
        return copy;
    }
}
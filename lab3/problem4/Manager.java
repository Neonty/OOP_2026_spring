package problem4;
import java.util.*;

class Manager extends Employee {
    private Vector<Employee> team;
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insuranceNumber, double bonus) {
        super(name, salary, hireDate, insuranceNumber);

        if (bonus<0){
            throw new IllegalArgumentException("Bonus can't be negative");
        }

        this.bonus = bonus;
        this.team = new Vector<>();
    }

    public void addEmployee(Employee e) {
        team.add(e);
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bonus: " + bonus + ", Team size: " + team.size();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o))
            return false;
        if (!(o instanceof Manager))
            return false;

        Manager m = (Manager) o;
        return Double.compare(bonus, m.bonus) == 0;
    }

    @Override
    public int compareTo(Employee e) {
        if (e instanceof Manager) {
            Manager m = (Manager) e;
            int cmp = Double.compare(this.salary, m.salary);
            if (cmp == 0) {
                return Double.compare(this.bonus, m.bonus);
            }
            return cmp;
        }
        return super.compareTo(e);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Manager copy = (Manager) super.clone();
        copy.team = new Vector<>(this.team);
        return copy;
    }
}
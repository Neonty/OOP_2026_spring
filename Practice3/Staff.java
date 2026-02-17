package Practice3;

public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String _name, String _address, String _school, double _pay) {
        super(_name, _address); 

        if (_school == null || _school.isBlank()) {
            throw new IllegalArgumentException("School cannot be empty");
        }

        if (_pay < 0) {
            throw new IllegalArgumentException("Pay cannot be negative");
        }

        this.school = _school;
        this.pay = _pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String _school) {
        if (_school == null || _school.isBlank()) {
            throw new IllegalArgumentException("School cannot be empty");
        }
        this.school = _school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double _pay) {
        if (_pay < 0) {
            throw new IllegalArgumentException("Pay cannot be negative");
        }
        this.pay = _pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}
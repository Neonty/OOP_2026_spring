package Practice3;

public class Student extends Person{
    private String program;
    private int year;
    private double fee;

    public Student(String _name, String _address, String _program, int _year, double _fee) {
        if (_name == null || _name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (_address == null || _address.isBlank()){
            throw new IllegalArgumentException("Address cannot be empty");
        }

        if (_program == null || _program.isBlank()){
            throw new IllegalArgumentException("Program cannot be empty");
        }

        if (_year < 1 || _year > 4){
            throw new IllegalArgumentException("Illegal year");
        }

        if (_fee < 0){
            throw new IllegalArgumentException("Illegal fee");
        }
        
        super(_name, _address);
        this.program = _program;
        this.year = _year;
        this.fee = _fee;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String _program) {
        if (_program == null || _program.isBlank()){
            throw new IllegalArgumentException("Program cannot be empty");
        }

        this.program = _program;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int _year){
        if (_year < 1 || _year > 4){
            throw new IllegalArgumentException("Illegal year");
        }

        this.year = _year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double _fee) {
        if (_fee < 0){
            throw new IllegalArgumentException("Illegal fee");
        }

        this.fee = _fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}

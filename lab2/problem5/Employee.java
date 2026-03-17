package problem5;

public class Employee extends Person {
    private final String position;

    public Employee(String name, int age, String position){
        super(name, age);

        if (position == null || position.isBlank()){
            throw new IllegalArgumentException("possition cannot be empty");
        }

        this.position = position;
    }

    @Override
    public String getOccupation(){
        return "Employee (" + position + ")";
    }
}
package problem5;

public class Student extends Person {
    private final String major;

    public Student(String name, int age, String major) {
        super(name, age);

        if (major == null || major.isBlank()){
            throw new IllegalArgumentException("major cannot be empty");
        }

        this.major = major;
    }

    @Override
    public String getOccupation(){
        return "Student (" + major + ")";
    }
}
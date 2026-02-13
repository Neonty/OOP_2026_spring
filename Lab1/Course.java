package Lab1;

public class Course{
    private String name;
    private String description;
    private int credits;
    private String prerequisite;

    public Course(String name, String description, int credits, String prerequisite){
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (description == null || description.isBlank()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }

        if (credits <= 0) {
            throw new IllegalArgumentException("Credits must be positive");
        }

        if (prerequisite == null || prerequisite.isBlank()) {
            throw new IllegalArgumentException("Prerequisite cannot be empty");
        }

        this.name = name;
        this.description = description;
        this.credits = credits;
        this.prerequisite = prerequisite;
    }

    public String getName(){ 
        return name;
    }

    @Override
    public String toString(){
        return name + ": " + description + "(" + credits + " credits)";
    }
}
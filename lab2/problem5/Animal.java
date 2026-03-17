package problem5;
import java.util.Objects;

public abstract class Animal{
    private final String name;
    private final int age;

    public Animal(String name, int age){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        if (age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }

        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){ 
        return age;
    }

    public abstract String getSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }

        if (!(o instanceof Animal animal)){
            return false;
        }
        
        return age == animal.age && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

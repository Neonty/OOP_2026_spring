package problem6;
import java.util.Objects;

public abstract class Animal implements Comparable<Animal>, Trainable {
    private final String name;
    private final int age;

    public Animal(String name, int age) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
        if (age < 0) throw new IllegalArgumentException("Age cannot be negative");
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Animal other) {
        return Integer.compare(this.age, other.age);
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public abstract String getSound();

    @Override
    public String toString() {
        return getClass().getSimpleName() + " [name=" + name + ", age=" + age + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
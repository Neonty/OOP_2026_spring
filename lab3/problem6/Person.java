package problem6;
import java.util.Objects;

public abstract class Person implements Talkable, Cloneable {
    private final String name;
    private final int age;
    private Animal pet;

    public Person(String name, int age) {
        if (name == null || name.isBlank()) throw new IllegalArgumentException("Name cannot be empty");
        if (age <= 0) throw new IllegalArgumentException("Age must be positive");
        this.name = name;
        this.age = age;
    }

    @Override
    public void speak() {
        System.out.println("Hello, my name is " + name);
    }

    @Override
    public Person clone() {
        try {
            return (Person) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getName() { return name; }
    public int getAge() { return age; }
    public boolean hasPet() { return pet != null; }
    public Animal getPet() { return pet; }

    public void assignPet(Animal pet) {
        if (pet == null) throw new IllegalArgumentException("Pet cannot be null");
        if (this.pet != null) throw new IllegalStateException("Person already has a pet");
        if (!canHavePet(pet)) throw new IllegalArgumentException("This person cannot own this type of pet");
        this.pet = pet;
    }

    public void removePet() { this.pet = null; }
    protected boolean canHavePet(Animal pet) { return true; }

    public void leavePetWith(Person caretaker) {
        if (!hasPet()) throw new IllegalStateException("No pet to leave");
        if (caretaker == null) throw new IllegalArgumentException("Caretaker cannot be null");
        Animal myPet = this.pet;
        caretaker.assignPet(myPet);
        this.removePet();
    }

    public void retrievePetFrom(Person caretaker) {
        if (caretaker == null) throw new IllegalArgumentException("Caretaker cannot be null");
        if (!caretaker.hasPet()) throw new IllegalStateException("Caretaker has no pet");
        Animal petToReturn = caretaker.getPet();
        this.assignPet(petToReturn);
        caretaker.removePet();
    }

    public abstract String getOccupation();

    @Override
    public String toString() {
        return name + " (" + age + ") - " + getOccupation() + (hasPet() ? ", Pet: " + pet : ", No pet");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
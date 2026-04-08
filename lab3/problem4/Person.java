package problem4;
import java.util.Objects;

class Person {
    protected String name;

    public Person(){}

    public Person(String name) {
        if (name.isBlank() || name == null){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank() || name == null){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        this.name = name;
    }

    public String toString() {
        return "Name: " + name;
    }

    public boolean equals(Object o) {
        if (this == o)
            return true;
        
        if (!(o instanceof Person))
            return false;
        
        Person p = (Person)o;
        return Objects.equals(name, p.name);
    }
}
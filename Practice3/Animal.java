package Practice3;

public abstract class Animal {
    private final String animalType;
    private final String name;

    public Animal(){
        this.animalType = "Unknown type";
        this.name = "Unknown name";
    }

    public Animal(String type){
        if (type == null || type.isBlank()){
            throw new IllegalArgumentException("type cannot be empty");
        }

        this.animalType = type;
        this.name = "Unnamed";
    }

    public Animal(String type, String _name){
        if (type == null || type.isBlank()){
            throw new IllegalArgumentException("type cannot be empty");
        }

        if (_name == null || _name.isBlank()){
            throw new IllegalArgumentException("name cannot be empty");
        }

        this.animalType = type;
        this.name = _name;
    }

    public String getType(){
        return this.animalType;
    }

    public String getName(){
        return this.name;
    }

    public abstract void makeSound();
}
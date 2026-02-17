package Practice3;

public class Dog extends Animal {
    public Dog(){
        super("Mammal");
    }

    public Dog(String name){
        super("Mammal", validateName(name));
    }

    private static String validateName(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        
        return name;
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " barks: " + "woof-woof!");
    }

    public void makeSound(int times){
        System.out.print(getName() + " barks " + times + " times: ");
        for (int i=0;i<times;i++){
            System.out.print("woof! ");
        }
        System.out.println();
    }
}

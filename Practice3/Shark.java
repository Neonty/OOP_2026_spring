package Practice3;

class Shark extends Animal{
    public Shark(){
        super("Fish");
    }

    public Shark(String name){
        if (name == null || name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty");
        }

        super("Fish", name);
    }

    @Override
    public void makeSound(){
        System.out.println(getName() + " is silent but dangerous.");
    }

    public void makeSound(boolean isHungry){
        if (isHungry){
            System.out.println(getName() + " is splashing aggressively while hunting!");
        }
        else{
            this.makeSound();
        }
    }
}
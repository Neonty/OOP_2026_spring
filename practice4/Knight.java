package practice4;

class Knight extends Entity {
    private int damage;

    public Knight(String name, int position, int damage){
        super(name, position);
        this.damage = damage;
    }

    public void moveForward(){
        move(1);
    }

    public void moveBackward(){
        move(-1);
    }

    public void attack(Entity target){
        System.out.println(getName() + " attacks " + target.getName());

        if (target instanceof IAttackable){
            ((IAttackable) target).receiveAttack(damage);
        }
        else{
            System.out.println("No effect");
        }
    }

    public void push(Entity target, int direction){
        if (target instanceof IPushable){
            ((IPushable) target).push(direction);
        }
        else{
            System.out.println(target.getName() + " cannot be pushed");
        }
    }

    public void interact(Entity target){
        if (target instanceof IInteractable){
            ((IInteractable) target).interact();
        }
        else{
            System.out.println("Cannot interact with");
        }
    }
}
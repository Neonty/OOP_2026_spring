package practice4;

class WoodenBox extends Entity implements IPushable, IAttackable {
    private boolean isBroken = false;

    public WoodenBox(String name, int position){
        super(name, position);
    }

    @Override
    public void push(int direction){
        if (!isBroken){
            move(direction);
        }
        else{
            System.out.println(getName() + " is broken");
        }
    }

    @Override
    public void receiveAttack(int damage){
        isBroken = true;
        System.out.println(getName() + " broke instantly");
    }
}
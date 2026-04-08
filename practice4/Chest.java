package practice4;

class Chest extends Entity implements IPushable, IInteractable {
    private boolean isOpen = false;

    public Chest(String name, int position){
        super(name, position);
    }

    @Override
    public void push(int direction){
        move(direction);
    }

    @Override
    public void interact(){
        if (!isOpen){
            isOpen = true;
            System.out.println(getName() + " opened! Loot inside!");
        }
        else{
            System.out.println(getName() + " already open");
        }
    }
}
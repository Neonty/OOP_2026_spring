package practice4;

class Rock extends Entity implements IPushable {
    public Rock(String name, int position) {
        super(name, position);
    }

    @Override
    public void push(int direction) {
        move(direction);
    }
}
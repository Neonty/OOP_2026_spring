package practice4;

abstract class Entity {
    private String name;
    private int position;

    public Entity(String name, int position){
        this.name = name;
        this.position = position;
    }

    public String getName(){
        return name;
    }

    public int getPosition(){
        return position;
    }

    protected void move(int direction){
        position += direction;
        System.out.println(name + " moved to " + position);
    }
}
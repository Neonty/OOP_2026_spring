package problem1;

class Door implements Openable, Closeable {
    private String material;
    private boolean isOpen;

    public Door(String material){

        if (material.isBlank() || material == null){
            throw new IllegalArgumentException("Material can't be empty");
        }

        this.material = material;
        this.isOpen = false;
    }

    public void open(){
        if (!isOpen){
            isOpen = true;
            System.out.println("Дверь из " + material + " открыта");
        }
        else{
            System.out.println("Дверь уже открыта");
        }
    }

    public void close(){
        if (isOpen){
            isOpen = false;
            System.out.println("Дверь закрыта");
        }
        else{
            System.out.println("Дверь уже закрыта");
        }
    }
}
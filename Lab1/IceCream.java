package Lab1;

enum IceCreamType{
    cup,
    cone,
    stick
}

public class IceCream{
    private static int totalSold;
    private final int id;

    private String flavor;
    private IceCreamType type;

    {
        totalSold++;
        System.out.println("Готовим новую порцию...");
    }

    public IceCream(){
        this("Vanilla", IceCreamType.cup);
    }

    public IceCream(String flavor, IceCreamType type){
        if (flavor == null || flavor.isBlank()){
            throw new IllegalArgumentException("Flavor cannot be empty");
        }

        this.flavor = flavor;
        this.type = type;
        this.id = totalSold; 
    }

    public void addToppings(){
        System.out.println("Добавлена стандартная посыпка.");
    }

    public void addToppings(String extra){
        if (extra == null || extra.isBlank()){
            throw new IllegalArgumentException("Topping cannot be empty");
        }
        
        System.out.println("Добавлено: " + extra);
    }

    public static final void printStoreInfo(){
        System.out.println("Магазин мороженого открыт! Продано штук: " + totalSold);
    }

    public int getId(){
        return id;
    }
}
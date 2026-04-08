package problem5;

public class Chocolate implements Comparable<Chocolate> {
    private String name;
    private double weight;

    public Chocolate(String name, double weight) {
        if (name.isBlank() || name==null){
            throw new IllegalArgumentException("Name cant be empty");
        }

        if (weight<=0){
            throw new IllegalArgumentException("Weigth must be positive");
        }

        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return this.name;
    }

    public double getWeight(){
        return this.weight;
    }

    public void setName(String name){
        if (name.isBlank() || name==null){
            throw new IllegalArgumentException("Name cant be empty");
        }

        this.name = name;
    }

    public void setWeight(double weight){
        if (weight<=0){
            throw new IllegalArgumentException("Weigth must be positive");
        }

        this.weight = weight;
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return name + " (" + weight + "g)";
    }
}
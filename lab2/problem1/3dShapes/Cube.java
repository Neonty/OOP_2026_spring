package problem1;

public class Cube extends Shape3D {
    private final double side;

    public Cube(double a){
        if (a<=0){
            throw new IllegalArgumentException("Side must be positive");
        }

        this.side = a;
    }

    public double getSide(){
        return this.side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double surfaceArea(){
        return 6 * side * side;
    }
}

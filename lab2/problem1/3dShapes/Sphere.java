package problem1;

public class Sphere extends Shape3D {
    private final double radius;

    public Sphere(double r){
        if (r<=0){
            throw new IllegalArgumentException("Radius must be positive");
        }

        this.radius = r;
    }

    public double getRadius(){
        return this.radius;
    }
    @Override
    public double volume() {
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double surfaceArea(){
        return 4 * Math.PI * radius * radius;
    }
}

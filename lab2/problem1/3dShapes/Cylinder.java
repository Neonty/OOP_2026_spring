package problem1;

public class Cylinder extends Shape3D {
    private final double radius, height;

    public Cylinder(double r, double h) {
        if (r<=0){
            throw new IllegalArgumentException("Radius must be positive");
        }

        if (h<=0){
            throw new IllegalArgumentException("Height must be positive");
        }
        
        this.radius = r;
        this.height = h;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getHeight(){
        return this.height;
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }

    @Override
    public double surfaceArea(){
        return 2 * Math.PI * radius * height + 2 * Math.PI * radius * radius; 
    }
}

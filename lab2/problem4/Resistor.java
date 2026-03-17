package problem4;

public class Resistor extends Circuit {
    private final double resistance;

    public Resistor(double resistance){
        if (resistance <= 0){
            throw new IllegalArgumentException("Resistance must be positive");
        }
        
        this.resistance = resistance;
    }

    @Override
    public double getResistance(){
        return resistance;
    }
}
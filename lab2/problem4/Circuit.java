package problem4;

public abstract class Circuit {
    protected double potentialDifference;

    public abstract double getResistance();

    public double getPotentialDiff(){
        return potentialDifference;
    }

    public void applyPotentialDiff(double V){
        if (V < 0) {
            throw new IllegalArgumentException("Voltage cannot be negative");
        }

        this.potentialDifference = V;
    }

    public double getCurrent(){
        double R = getResistance();
        if (R == 0){
            throw new ArithmeticException("Resistance cannot be zero");
        }

        return potentialDifference / R;
    }

    public double getPower(){
        return potentialDifference * getCurrent();
    }
}
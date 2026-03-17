package problem4;

public class Series extends Circuit {
    private final Circuit first;
    private final Circuit second;

    public Series(Circuit first, Circuit second){
        if (first == null || second == null){
            throw new IllegalArgumentException("Circuits cannot be null");
        }

        this.first = first;
        this.second = second;
    }

    @Override
    public double getResistance(){
        return first.getResistance() + second.getResistance();
    }

    @Override
    public void applyPotentialDiff(double V){
        super.applyPotentialDiff(V);

        double totalR = getResistance();
        double current = V / totalR;

        first.applyPotentialDiff(current * first.getResistance());
        second.applyPotentialDiff(current * second.getResistance());
    }
}
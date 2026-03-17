package problem4;

public class Parallel extends Circuit {
    private final Circuit first;
    private final Circuit second;

    public Parallel(Circuit first, Circuit second){
        if (first == null || second == null) {
            throw new IllegalArgumentException("Circuits cannot be null");
        }

        this.first = first;
        this.second = second;
    }

    @Override
    public double getResistance(){
        double r1 = first.getResistance();
        double r2 = second.getResistance();

        return 1.0 / (1.0 / r1 + 1.0 / r2);
    }

    @Override
    public void applyPotentialDiff(double V){
        super.applyPotentialDiff(V);

        first.applyPotentialDiff(V);
        second.applyPotentialDiff(V);
    }
}
package problem2;

public class Position {
    private final int row;
    private final int col;

    public Position(int row, int col){
        if (row < 1 || row > 8 || col < 1 || col > 8){
            throw new IllegalArgumentException("Position must be between 1 and 8");
        }

        this.row = row;
        this.col = col;
    }

    public int getRow(){
        return row;
    }

    public int getCol(){
        return col;
    }
}
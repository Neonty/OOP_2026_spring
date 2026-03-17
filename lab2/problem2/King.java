package problem2;

public class King extends Piece {
    public King(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b){
        int rowDiff = Math.abs(position.getRow() - b.getRow());
        int colDiff = Math.abs(position.getCol() - b.getCol());

        if (rowDiff == 0 && colDiff == 0)
            return false;

        return rowDiff <= 1 && colDiff <= 1;
    }
}
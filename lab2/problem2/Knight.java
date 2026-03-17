package problem2;

public class Knight extends Piece{
    public Knight(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b){
        boolean notSame = position.getRow() != b.getRow() && position.getCol() != b.getCol();
        int rowDiff = Math.abs(position.getRow() - b.getRow());
        int colDiff = Math.abs(position.getCol() - b.getCol());

        return ((rowDiff == 2 && colDiff == 1) || (rowDiff == 1 && colDiff == 2)) && notSame;
    }
}
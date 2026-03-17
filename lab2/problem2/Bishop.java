package problem2;

public class Bishop extends Piece{
    public Bishop(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b){
        boolean notSame = position.getRow() != b.getRow() && position.getCol() != b.getCol();
        return Math.abs(position.getRow() - b.getRow()) == Math.abs(position.getCol() - b.getCol()) && notSame;
    }
}
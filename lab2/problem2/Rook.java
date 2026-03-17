package problem2;

public class Rook extends Piece{
    public Rook(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b){
        boolean notSame = position.getRow() != b.getRow() && position.getCol() != b.getCol();  
        return (position.getRow() == b.getRow() || position.getCol() == b.getCol()) && notSame;
    }
}
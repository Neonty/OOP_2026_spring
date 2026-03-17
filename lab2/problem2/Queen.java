package problem2;

public class Queen extends Piece{
    public Queen(Position position){
        super(position);
    }

    @Override
    public boolean isLegalMove(Position b){
        boolean notSame = position.getRow() != b.getRow() && position.getCol() != b.getCol();
        boolean rookMove = position.getRow() == b.getRow() || position.getCol() == b.getCol();
        boolean bishopMove = Math.abs(position.getRow() - b.getRow()) == Math.abs(position.getCol() - b.getCol());

        return (rookMove || bishopMove) && notSame;
    }
}
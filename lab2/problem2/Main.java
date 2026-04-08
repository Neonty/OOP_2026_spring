package problem2;

public class Main {

    public static void main(String[] args) {
        Knight knight = new Knight(new Position(1, 4));
        Bishop bishop = new Bishop(new Position(4,5));
        King king = new King(new Position(8, 8));

        System.out.println(knight.getPosition().getCol());
        System.out.println(king.isLegalMove(new Position(7,8)));
    }
}

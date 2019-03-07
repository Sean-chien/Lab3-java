package Lab3;

public class Queen extends ChessPiece {
    public Queen (int HP, int Attack) {
        super(HP, Attack);

    }

    @Override
    public void move() {
        System.out.println("like a bishop or a rook");
    }

    @Override
    public void chesscolor() {
        System.out.println("red");
    }

    @Override
    public String toString() {
        return "Type {" + "HP =" + getHP() + "Attack =" + getAttack() + "}";

    }
}
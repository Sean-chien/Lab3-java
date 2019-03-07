package Lab3;

public class Bishop extends ChessPiece{
    public Bishop(int HP, int Attack) {
        super( HP, Attack);
    }

    @Override
    public void move() {
        System.out.println("diagonally");
    }

    @Override
    public void chesscolor() {
        System.out.println("space grey");
    }

    @Override
    public String toString() {
        return "Type {" + "HP =" + getHP() + "Attack =" + getAttack() + "}";


    }

}

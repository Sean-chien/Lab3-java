package Lab3;

public class Rook extends ChessPiece{
    public Rook(int HP,int Attack){
        super(HP,Attack);
    }

    @Override
    public void move() {
        System.out.println("horizontally or vertically");
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

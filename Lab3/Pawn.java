package Lab3;

public class Pawn extends ChessPiece {
    public Pawn(int HP,int Attack){
        super(HP,Attack);
    }
    @Override
    public void move() {
        System.out.println("forward 1");
    }

    @Override
    public void chesscolor() {
        System.out.println("white");
    }

    @Override
    public String toString() {
        return "Type {" + "HP =" + getHP() + "Attack =" + getAttack() + "}";

    }
}

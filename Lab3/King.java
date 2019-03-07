package Lab3;

public class King extends ChessPiece {
    public King(int HP, int Attack) {
        super(HP,Attack);
    }


    @Override
    public void move() {
        System.out.println("one square");
    }


    @Override
    public void chesscolor() {
        System.out.println("black");
    }

    @Override
    public String toString(){
        return "Type {" + "HP =" + getHP()+ "Attack =" + getAttack() + "}";

    }
}
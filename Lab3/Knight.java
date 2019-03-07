package Lab3;


public class Knight extends ChessPiece {
    public Knight(int HP,int Attack){
        super(HP,Attack);
    }
    @Override
    public void move(){
        System.out.println("like an L");
    }

    @Override
    public void chesscolor() {
        System.out.println("blue");

    }

    @Override
    public String toString(){
        return "Type {" + "HP =" + getHP()+ "Attack =" + getAttack() + "}";
    }
}



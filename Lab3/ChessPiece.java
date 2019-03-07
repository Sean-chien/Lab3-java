package Lab3;


import java.util.Objects;

public abstract class ChessPiece {
    private int HP;
    private int Attack;

    public ChessPiece (int HP, int Attack){
        this.HP = HP;
        this.Attack = Attack;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        this.Attack = attack;
        System.out.println("you are hurt!!");
    }

   public abstract void move();
   public abstract void chesscolor();

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChessPiece chessPiece = (ChessPiece) o;
        return HP == chessPiece.HP && Attack == chessPiece.Attack;
    }
    @Override
    public int hashCode() {
        return Objects.hash(HP, Attack);
    }


}







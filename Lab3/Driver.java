package Lab3;

public class Driver {
    public static void main(String[] args) {
        King k1 = new King(1000,100);
        Queen q1 = new Queen(500,50);
        Bishop b1 = new Bishop(300,30);
        Knight kn1 = new Knight(200,20);
        Rook r1 = new Rook(100,10);
        Pawn p1 = new Pawn(50,5);

        ChessPiece[] ChessPieces ={k1,q1,b1,kn1,r1,p1};
        for (int i = 0,ChessPiecesLength = ChessPieces.length;i < ChessPiecesLength;i++){
            ChessPiece Che = ChessPieces[i];
            System.out.println(Che.getAttack());
            System.out.println(Che.getHP());
        }


    }

}

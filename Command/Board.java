public class Board{
	private Player Player1 = new Player();
  private Player Player2 = new Player();
  private boolean playerTurn = false;
  private int i = 0;

  public void play(){
    Knight knight = new Knight();
    Pawn pawn = new Pawn();
    Bishop bishop = new Bishop();

    Move knightMove = new KnightMove(knight);
    Move pawnMove = new PawnMove(pawn);
    Move bishopMove = new BishopMove(bishop);
    
    Player1.setPiece(0, knight);
    Player1.setPiece(2, pawn);
    Player1.setPiece(4, pawn);

    Player1.setCommand(0, knightMove);
    Player1.setCommand(2, pawnMove);
    Player1.setCommand(4, pawnMove);

    Player2.setPiece(1, pawn);
    Player2.setPiece(3, bishop);

    Player2.setCommand(1, pawnMove);
    Player2.setCommand(3, bishopMove);

    
    if(!playerTurn){ //player1
			System.out.print("White: ");
      Player1.movePiece(i);
      if(i == 2) 
        Player1.undoMove();
		}
    else{
      System.out.print("Black: ");
      Player2.movePiece(i);
    }
    
    playerTurn ^= true; // flip turn
    i++;
  }
}
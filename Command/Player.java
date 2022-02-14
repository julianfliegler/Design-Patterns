public class Player{
  private Piece[] playerPieces;
	private Move[] piecesCommands;
  private Move prevMove;

  public Player(){
    piecesCommands = new Move[6];
    playerPieces = new Piece[6];

    Move noMove = new NoMove();
		for (int i = 0; i < 6; i++) {
			piecesCommands[i] = noMove;
		}
  }
  
  public void undoMove(){
		prevMove.undo();
	}

  public void movePiece(int pieceID){
    prevMove = piecesCommands[pieceID];
    piecesCommands[pieceID].execute();
  }

  public void setPiece(int index, Piece piece){
    playerPieces[index] = piece;
  }

  public void setCommand(int index, Move move){
    piecesCommands[index] = move;
  }
  
}
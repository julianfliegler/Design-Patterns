public class KingMove implements Move{
  King king;

  public KingMove(King king){
    this.king = king;
  }

	public void execute(){
    king.move();
  }
	public void undo(){
    king.undoMove();
  }
}
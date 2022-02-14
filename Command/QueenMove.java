public class QueenMove implements Move{
  Queen queen;

  public QueenMove(Queen queen){
    this.queen = queen;
  }

	public void execute(){
    queen.move();
  }
	public void undo(){
    queen.undoMove();
  }
}
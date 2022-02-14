public class KnightMove implements Move{
  Knight knight;

  public KnightMove(Knight knight){
    this.knight = knight;
  }

	public void execute(){
    knight.move();
  }
	public void undo(){
    knight.undoMove();
  }
}
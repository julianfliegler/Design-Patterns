public class RookMove implements Move{
  Rook rook;

  public RookMove(Rook rook){
    this.rook = rook;
  }

	public void execute(){
    rook.move();
  }
	public void undo(){
    rook.undoMove();
  }
}
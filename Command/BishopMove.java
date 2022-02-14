public class BishopMove implements Move{
  Bishop bishop;

  public BishopMove(Bishop bishop){
    this.bishop = bishop;
  }

	public void execute(){
    bishop.move();
  }
	public void undo(){
    bishop.undoMove();
  }
}
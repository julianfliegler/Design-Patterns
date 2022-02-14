public class PawnMove implements Move{
  Pawn pawn;

  public PawnMove(Pawn pawn){
    this.pawn = pawn;
  }

	public void execute(){
    pawn.move();
  }
	public void undo(){
    pawn.undoMove();
  }
}
public class Bishop extends Piece{
  Bishop(){
    row = 0;
    col = 3;
  }

	public void move(){
    int prevRow = getRow();
    char prevColLetter = getColumnLetter();
    updatePosition(getRow()+3, getCol()+3);
		
    System.out.println("Bishop moves from " + prevColLetter + prevRow + " to " + getColumnLetter() + getRow() + ".");
	}

	public void undoMove(){
    int currRow = getRow();
    int prevCol = getCol();
    updatePosition(getRow()-3, getCol()-3);
		
    System.out.println("UNDO: Bishop moves from " + currRow + " to " + getColumnLetter() + getRow() + ".");
	}
}
public class Queen extends Piece{
	public void move(){
    int prevRow = getRow();
    char prevColLetter = getColumnLetter();
    updatePosition(getRow()+3, getCol());
		
    System.out.println("Queen moves from " + prevColLetter + prevRow + " to " + getColumnLetter() + getRow() + ".");
	}

	public void undoMove(){
    int currRow = getRow();
    int prevCol = getCol();
    updatePosition(getRow()-3, getCol());
		
    System.out.println("UNDO: Queen moves from " + currRow + " to " + getColumnLetter() + getRow() + ".");
	}
}
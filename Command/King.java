public class King extends Piece{
	public void move(){
    int prevRow = getRow();
    char prevColLetter = getColumnLetter();
    updatePosition(getRow()+1, getCol());
		
    System.out.println("King moves from " + prevColLetter + prevRow + " to " + getColumnLetter() + getRow() + ".");
	}

	public void undoMove(){
    int currRow = getRow();
    int prevCol = getCol();
    updatePosition(getRow()-1, getCol());
		
    System.out.println("UNDO: King moves from " + currRow + " to " + getColumnLetter() + getRow() + ".");
	}
}
public class Rook extends Piece{
	public void move(){
    int prevRow = getRow();
    char prevColLetter = getColumnLetter();
    updatePosition(getRow()+3, getCol());
		
    System.out.println("Rook moves from " + prevColLetter + prevRow + " to " + getColumnLetter() + getRow() + ".");
	}

	public void undoMove(){
    int currRow = getRow();
    int prevCol = getCol();
    updatePosition(getRow()-3, getCol());
		
    System.out.println("UNDO: Rook moves from " + currRow + " to " + getColumnLetter() + getRow() + ".");
	}
}
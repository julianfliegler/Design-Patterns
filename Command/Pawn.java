public class Pawn extends Piece{
	public void move(){
    int prevRow = getRow();
    char prevColLetter = getColumnLetter();
    updatePosition(getRow()+1, getCol());
		
    System.out.println("Pawn moves from " + prevColLetter + prevRow + " to " + getColumnLetter() + getRow() + ".");
	}

	public void undoMove(){
    int currRow = getRow();
    char currCol = getColumnLetter();
    updatePosition(getRow()-1, getCol());
		
    System.out.println("UNDO: Pawn moves from " + currCol + currRow + " to " + getColumnLetter() + getRow() + ".");
	}
}
public class Knight extends Piece{
  Knight(){
    row = 0;
    col = 1;
  }
  
	public void move(){
    int prevRow = getRow();
    char prevColLetter = getColumnLetter();
    updatePosition(getRow()+2, getCol()+1);
		
    System.out.println("Knight jumps from " + prevColLetter + prevRow + " to " + getColumnLetter() + getRow() + ".");
	}

	public void undoMove(){
    int currRow = getRow();
    char currCol = getColumnLetter();
    updatePosition(getRow()-2, getCol()-1);
		
    System.out.println("UNDO: Knight moves from " + currCol + currRow + " to " + getColumnLetter() + getRow() + ".");
	}
}


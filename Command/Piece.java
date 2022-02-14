public abstract class Piece{
	int row;
  int col;

  Piece(){
    row = 1;
    col = 1;
  }
  
	public abstract void move();
	public abstract void undoMove();

	public char getColumnLetter(){
		switch(this.col){
			case 1:
				return 'A';
			case 2:
				return 'B';
			case 3:
				return 'C';
			case 4:
				return 'D';
			case 5:
				return 'E';
			case 6:
				return 'F';
			case 7:
				return 'G';
			case 8:
				return 'H';
			default:
				return '!';
		}
	}
	public int getRow(){
		return row;
	}
	public int getCol(){
		return col;
	}
	public void updatePosition(int row, int col){
		this.row = row;
		this.col = col;
	}
}
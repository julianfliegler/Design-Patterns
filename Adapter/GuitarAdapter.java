public class GuitarAdapter implements GuitarController {
	DancePad dancePad;
	public GuitarAdapter(DancePad dancePad){
    this.dancePad = dancePad;
  }

  public void PressFretButton(colors button){
		if(button == Guitar.colors.GREEN){
			dancePad.Step(DancePad.direction.FORWARD);
		}
		else if(button == Guitar.colors.RED){
			dancePad.Step(DancePad.direction.LEFT);
		}
		else if(button == Guitar.colors.YELLOW){
			dancePad.Step(DancePad.direction.RIGHT);
		}
		else if(button == Guitar.colors.BLUE){
			dancePad.Step(DancePad.direction.BACK);
		}
		else if(button == Guitar.colors.ORANGE){
			dancePad.Step(DancePad.direction.MIDDLE);
		}
	} 
  public void PressPick(){
    // do nothing
	}
  public void PressTremelo(){
    // do nothing
	}
}
	

public class DanceAdapter implements DanceController{
  Guitar guitar;

  public DanceAdapter(Guitar guitar){
    this.guitar = guitar;
  }

  public void Step(direction dir){
    if(dir == direction.FORWARD){
			guitar.PressFretButton(Guitar.colors.GREEN);
		}
		else if(dir == direction.LEFT){
			guitar.PressFretButton(Guitar.colors.RED);
		}
		else if(dir == direction.RIGHT){
			guitar.PressFretButton(Guitar.colors.YELLOW);
		}
		else if(dir == direction.BACK){
			guitar.PressFretButton(Guitar.colors.BLUE);
		}
		else if(dir == direction.MIDDLE){
			guitar.PressFretButton(Guitar.colors.ORANGE);
		}
    guitar.PressPick();
    guitar.PressTremelo();
  }
}
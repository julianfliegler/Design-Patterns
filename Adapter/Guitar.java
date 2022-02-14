public class Guitar implements GuitarController{
	public void PressFretButton(colors button){
		System.out.println("Fret button " + button + " pressed!");
	}
	public void PressPick(){
		System.out.println("Pick pressed!");
	}
	public void PressTremelo(){
		System.out.println("Tremelo pressed!");
	}
}
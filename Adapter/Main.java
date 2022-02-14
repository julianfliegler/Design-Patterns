class Main {
  public static void main(String[] args) {
    Guitar guitar = new Guitar();
		DancePad dancePad = new DancePad();

    DanceController danceAdapter = new DanceAdapter(guitar);
		GuitarAdapter guitarAdapter = new GuitarAdapter(dancePad);
    
    System.out.println("-- Playing Guitar Hero with dance pad. --");
		danceAdapter.Step(DancePad.direction.FORWARD);
    danceAdapter.Step(DancePad.direction.LEFT);
    danceAdapter.Step(DancePad.direction.RIGHT);
    danceAdapter.Step(DancePad.direction.BACK);
    danceAdapter.Step(DancePad.direction.MIDDLE);

    System.out.println();
    
		System.out.println("-- Playing Dance Dance Revolution with guitar controller. --");
		guitarAdapter.PressFretButton(Guitar.colors.RED);
		guitarAdapter.PressFretButton(Guitar.colors.YELLOW);
		guitarAdapter.PressFretButton(Guitar.colors.BLUE);
		guitarAdapter.PressFretButton(Guitar.colors.GREEN);
		guitarAdapter.PressFretButton(Guitar.colors.ORANGE);
  }
}

/*
	Jeffrey Carson
  Julian Fliegler
*/

class Main {
  public static void main(String[] args) {
    ClassModel model = new ClassModel();
		ClassView view = new ClassView();

		ClassController controller = new ClassController(model, view);

    controller.setClassName("Design Patterns");
    controller.setClassNum("CS 330");
    controller.setClassDescription("Taught by Erin Keith");

    controller.updateView();
    System.out.println();

		controller.setClassName("Operating Systems");
    controller.setClassNum("CS 446");

    controller.updateView();
  }
}
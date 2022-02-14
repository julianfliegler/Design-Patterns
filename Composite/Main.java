class Main {
  public static void main(String[] args) {
    Cube cube = new Cube(2, 4, 6);
    Cylinder cylinder = new Cylinder(4, 6);
    Sphere sphere = new Sphere(4);
    CompositeModel compositeModel = new CompositeModel();

    //Adding two prims to a model
    compositeModel.add(cube);
    compositeModel.add(cylinder);

    System.out.println("Volume of first object is " + cube.getVolume());
    System.out.println("Volume of second object is " + cylinder.getVolume());

    //Adding a third prim onto the original model
    CompositeModel allModels = new CompositeModel();
    allModels.add(compositeModel);
    allModels.add(sphere);

    System.out.println("Volume of third object is " + sphere.getVolume());

    Client client = new Client(allModels);
    System.out.println("Total volume is " + client.printVolume());
  }
}
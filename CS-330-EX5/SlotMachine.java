public abstract class SlotMachine{
  String cabinet;
  String display;
  String payment;
  String gpu;
  String os;

  public void displayComponents(){
    System.out.println("fetching components: " + cabinet + " Cabinet, " + display + " Display, "+payment+" Payment, "+ gpu + " GPU, "+os + " OS");
  }

  public void testHardware(){
    System.out.println("testing hardware");
  }

  public void uploadSoftware(){
    System.out.println("uploading software: " + os);
  }

  public void testSoftware(){
    System.out.println("testing software");
  }

  public void assemble(){
    System.out.println("assembling components");
  }

  public void deliver(String wrapping, String method){
    System.out.println("wrapping slot machine in " + wrapping + "and " + method);
  }

}
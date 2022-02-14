public abstract class SlotMachine{
  String type;
  Cabinet cabinet;
  Display display;
  Payment payment;
  GPU gpu;
  OS os;

  public void setType(String type){
    this.type = type;
  }

  public abstract void fetchComponents();
  
  public void assembleHardware(){
    System.out.println("Assembling hardware: "+ cabinet + " with a(n) " + display + ", a " + payment + " payment system, and a(n) " + gpu + " processor.");
  }
  public void testHardware(){
    System.out.println("Testing the hardware...");
  }
  public void uploadSoftware(){
    System.out.println("Uploading the " + os + " environment...");
  }
  public void testSoftware(){
    System.out.println("Testing the system...");
  }
}
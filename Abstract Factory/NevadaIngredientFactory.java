public class NevadaIngredientFactory implements SlotIngredientFactory{
  public Cabinet createCabinet(String slotType){
    if(slotType.equals("straight")){
      return new large();
    }
    else if(slotType.equals("bonus")){
      return new small();
    }
    else if(slotType.equals("progressive")){
      return new medium();
    }
    else{
      return null;
    }
  }
  public Display createDisplay(String slotType){
    if(slotType.equals("straight"))
      return new reels();
    else if(slotType.equals("bonus"))
      return new CRT();
    else if(slotType.equals("progressive"))
      return new LCD();
    else 
      return null;
  }
  public Payment createPayment(String slotType){
    if(slotType.equals("straight"))
      return new ticket();
    else if(slotType.equals("bonus"))
      return new ticket();
    else if(slotType.equals("progressive"))
      return new ticket();
    else 
      return null;
  }
  public GPU createGPU(String slotType){
    if(slotType.equals("straight"))
      return new ARM();
    else if(slotType.equals("bonus"))
      return new X86();
    else if(slotType.equals("progressive"))
      return new X77();
    else 
      return null;
  }
  public OS createOS(String slotType){
    if(slotType.equals("straight"))
      return new linux();
    else if(slotType.equals("bonus"))
      return new linux();
    else if(slotType.equals("progressive"))
      return new android();
    else 
      return null;
  } 
}
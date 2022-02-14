public class WashingtonIngredientFactory implements SlotIngredientFactory{
  public Cabinet createCabinet(String slotType){
    if(slotType.equals("straight"))
      return new large();
    else if(slotType.equals("bonus"))
      return new medium();
    else if(slotType.equals("progressive"))
      return new large();
    else 
      return null;
  }
  public Display createDisplay(String slotType){
    if(slotType.equals("straight"))
      return new reels();
    else if(slotType.equals("bonus"))
      return new VGA();
    else if(slotType.equals("progressive"))
      return new reels();
    else 
      return null;
  }
  public Payment createPayment(String slotType){
    if(slotType.equals("straight"))
      return new bills();
    else if(slotType.equals("bonus"))
      return new ticket();
    else if(slotType.equals("progressive"))
      return new coins();
    else 
      return null;
  }
  public GPU createGPU(String slotType){
    /* check each type individually (even though they return same GPU type) for long-term flexibility */
    if(slotType.equals("straight"))
      return new ARM();
    else if(slotType.equals("bonus"))
      return new ARM();
    else if(slotType.equals("progressive"))
      return new ARM();
    else 
      return null;
  }
  public OS createOS(String slotType){
    if(slotType.equals("straight"))
      return new linux();
    else if(slotType.equals("bonus"))
      return new symbian();
    else if(slotType.equals("progressive"))
      return new android();
    else 
      return null;
  } 
}
public class NewJerseyIngredientFactory implements SlotIngredientFactory{
  public Cabinet createCabinet(String slotType){
  if(slotType.equals("straight")){
    return new small();
  }
  else if(slotType.equals("bonus")){
    return new large();
  }
  else{
    return new small();
  }
  }
  public Display createDisplay(String slotType){
      if(slotType.equals("straight")){
    return new LCD();
  }
  else if(slotType.equals("bonus")){
    return new reels();
  }
  else{
    return new CRT();
  }
  }
  public Payment createPayment(String slotType){
  if(slotType.equals("progressive")){
    return new bills();
  }
  else{
    return new coins();
  }
  }
  public GPU createGPU(String slotType){
  if(slotType.equals("progressive")){
    return new X86();
  }
  else{
    return new ARM();
  }
  }
  public OS createOS(String slotType){
  if(slotType.equals("progressive")){
    return new windowsXP();
  }
  else{
    return new windowsME();
  }
  } 
}
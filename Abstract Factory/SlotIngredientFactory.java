public interface SlotIngredientFactory{
  public Cabinet createCabinet(String slotType);
  public Display createDisplay(String slotType);
  public Payment createPayment(String slotType);
  public GPU createGPU(String slotType);
  public OS createOS(String slotType);
}
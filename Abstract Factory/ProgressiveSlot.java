public class ProgressiveSlot extends SlotMachine{
  private SlotIngredientFactory ingredientFactory;

  public ProgressiveSlot(SlotIngredientFactory ingredientFactory){
    this.ingredientFactory = ingredientFactory;
  }

  public void fetchComponents(){
    cabinet = ingredientFactory.createCabinet(type);
    display = ingredientFactory.createDisplay(type);
    payment = ingredientFactory.createPayment(type);
    gpu = ingredientFactory.createGPU(type);
    os = ingredientFactory.createOS(type);
  }
}
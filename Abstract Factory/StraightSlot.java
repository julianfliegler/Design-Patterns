public class StraightSlot extends SlotMachine{
  private SlotIngredientFactory ingredientFactory;

  public StraightSlot(SlotIngredientFactory ingredientFactory){
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
public class BonusSlot extends SlotMachine{
  private SlotIngredientFactory ingredientFactory;

  public BonusSlot(SlotIngredientFactory ingredientFactory){
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
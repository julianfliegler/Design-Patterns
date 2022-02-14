public class WashingtonStore extends SlotStore{
  public SlotMachine create(String type){
    SlotMachine machine = null;
    SlotIngredientFactory ingredientFactory = new WashingtonIngredientFactory();
  
    if(type.equals("straight")){
      System.out.println("--- Making a Washington style Straight Slot Machine ---");
      machine = new StraightSlot(ingredientFactory);
      machine.setType("straight");
    }
    else if(type.equals("bonus")){
      System.out.println("--- Making a Washington style Bonus Slot Machine ---");
      machine = new BonusSlot(ingredientFactory);
      machine.setType("bonus");
    }
    else if(type.equals("progressive")){
      System.out.println("--- Making a Washington style Progressive Slot Machine ---");
      machine = new ProgressiveSlot(ingredientFactory);
      machine.setType("progressive");
    }
    else{
      return null;
    }
    return machine;
  }
}
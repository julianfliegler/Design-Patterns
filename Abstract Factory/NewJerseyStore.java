public class NewJerseyStore extends SlotStore{
  public SlotMachine create(String type){
    SlotMachine machine = null;
    SlotIngredientFactory ingredientFactory = new NewJerseyIngredientFactory();
  
    if(type.equals("straight")){
      System.out.println("--- Making a New Jersey style Straight Slot Machine ---");
      machine = new StraightSlot(ingredientFactory);
      machine.setType("straight");
    }
    else if(type.equals("bonus")){
      System.out.println("--- Making a New Jersey style Bonus Slot Machine ---");
      machine = new BonusSlot(ingredientFactory);
      machine.setType("bonus");
    }
    else if(type.equals("progressive")){
      System.out.println("--- Making a New Jersey style Progressive Slot Machine ---");
      machine = new ProgressiveSlot(ingredientFactory);
      machine.setType("progressive");
    }
    else{
      return null;
    }
    return machine;
  }
}
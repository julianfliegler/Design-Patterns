public class NJMachineStore extends MachineStore{
  
  @Override
  protected SlotMachine create(String type){
    if(type.equals("straight")){
      System.out.println("--- Making a New Jersey style Straight Slot Machine ---");
      return new NJMachineStraight();
    }else if(type.equals("bonus")){
      System.out.println("--- Making a New Jersey style Bonus Slot Machine ---");
      return new NJMachineBonus();
    }else if(type.equals("progressive")){
      System.out.println("--- Making a New Jersey style Progressive Slot Machine ---");
      return new NJMachineProgressive();
    }else{
      return null;
    }
  }

  
}
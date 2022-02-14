public class NVMachineStore extends MachineStore{
  
  @Override
  protected SlotMachine create(String type){
    if(type.equals("straight")){
      System.out.println("--- Making a Nevada style Straight Slot Machine ---");
      return new NVMachineStraight();
    }else if(type.equals("bonus")){
      System.out.println("--- Making a Nevada style Bonus Slot Machine ---");
      return new NVMachineBonus();
    }else if(type.equals("progressive")){
      System.out.println("--- Making a Nevada style Progressive Slot Machine ---");
      return new NVMachineProgressive();
    }else{
      return null;
    }
  }

  
}
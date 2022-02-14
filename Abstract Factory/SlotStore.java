public abstract class SlotStore{

  protected abstract SlotMachine create(String type);

  public SlotMachine order(String type){
    SlotMachine machine;

    machine = create(type);

    machine.fetchComponents();
    machine.assembleHardware();
    machine.testHardware();
    machine.uploadSoftware();
    machine.testSoftware();

    return machine;
  }
}

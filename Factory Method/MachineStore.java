public abstract class MachineStore {
  public SlotMachine orderMachine(String type, String client, String wrapping, String method){
    SlotMachine machine;

    System.out.println(client + "orders a: ");

    machine = create(type);

    machine.displayComponents();
    machine.testHardware();
    machine.uploadSoftware();
    machine.testSoftware();
    machine.assemble();
    machine.deliver(wrapping, method);

    return machine;
  }
  protected abstract SlotMachine create(String type);
}
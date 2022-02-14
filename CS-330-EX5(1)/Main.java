class Main {
  public static void main(String[] args) {
    
    MachineStore njstore = new NJMachineStore();
    String client = "Taj Mahal ";
    String wrapping = "Newspaper ";
    String delivery = "UPS delivers it.";

    SlotMachine njmachine = njstore.orderMachine("bonus", client, wrapping, delivery);

    System.out.println();

    MachineStore nvstore = new NVMachineStore();
    client = "The Peppermill ";
    wrapping = "Bubble wrap ";
    delivery = "FedEX delivers it."; 
    
    SlotMachine nvmachine = nvstore.orderMachine("straight", client, wrapping, delivery);

    System.out.println();

    MachineStore wastore = new WAMachineStore();
    client = "GSR ";
    wrapping = "Newspaper ";
    delivery = "UPS delivers it.";

    SlotMachine wamachine = wastore.orderMachine("progressive", client, wrapping, delivery);
  }
}
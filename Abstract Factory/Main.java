class Main {
  public static void main(String[] args) {
    SlotStore NVstore = new NevadaStore();
    SlotMachine NVmachine = NVstore.order("straight");

    System.out.println();

    SlotStore NJstore = new NewJerseyStore();
    SlotMachine NJmachine = NJstore.order("bonus");

    System.out.println();

    SlotStore WAstore = new WashingtonStore();
    SlotMachine WAmachine = WAstore.order("progressive");
  }
}
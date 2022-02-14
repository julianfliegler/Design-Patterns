class Main {
  public static void main(String[] args) {
    System.out.println("First pizza");
    
    Pizza pizza1 = new Pizza();

    pizza1.bake();
    pizza1.deliver();
    pizza1.eat();

    System.out.println("\nSecond pizza");
    
    Pizza pizza2 = new Pizza();

    pizza2.deliver();
    pizza2.bake();
    pizza2.bake();
    pizza2.eat();
    pizza2.mistake();
    pizza2.eat();
  }
}
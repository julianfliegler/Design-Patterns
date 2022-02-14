public class Cooked implements State {
  Pizza pizza;

  public Cooked (Pizza newPizza) {
    this.pizza = newPizza;
  }

  public void bake() {
    System.out.println("Baking the pizza...");
    pizza.setState(pizza.getBaked());
  }
  public void deliver() {
    System.out.println("Can't deliver a pizza not baked yet");
  }
  public void eat() {
    System.out.println("Can't eat a deliverable pizza");
  }
  public void mistake() {
    System.out.println("Messed up pizza order, undeliverable");
    pizza.setState(pizza.getUndeliverable());
  }
  
}
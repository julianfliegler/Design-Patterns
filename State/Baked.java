public class Baked implements State {
  Pizza pizza;

  public Baked(Pizza newPizza) {
    this.pizza = newPizza;
  }

  public void bake() {
    System.out.println("Can't bake a pizza already baking");
  }
  
  public void deliver() {
    System.out.println("Delivering the pizza...");
    pizza.setState(pizza.getDelivered());
  }

  public void eat() {
    System.out.println("Can't eat a pizza that is baking");
  }
  public void mistake() {
    System.out.println("Overbaked pizza, undeliverable");
    pizza.setState(pizza.getUndeliverable());
  }
}
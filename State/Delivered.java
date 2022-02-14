public class Delivered implements State {

  Pizza pizza;

  public Delivered(Pizza newPizza) {
    this.pizza = newPizza;
  }

  public void bake() {
    System.out.println("Can't bake pizza already delivered");
  }
  
  public void deliver() {
    System.out.println("Can't deliver a pizza already delivered");
  }

  public void eat() {
    System.out.println("Customer enjoying pizza");
  }

  public void mistake() {
    System.out.println("Dropped pizza on way to door, undeliverable");
    pizza.setState(pizza.getUndeliverable());
  }
}
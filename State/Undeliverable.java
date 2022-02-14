public class Undeliverable implements State {
  Pizza pizza;

  public Undeliverable(Pizza newPizza) {
    this.pizza = newPizza;
  }

  public void bake() {
    System.out.println("Can't bake a pizza already baked");
  }

  public void deliver() {
    System.out.println("Can't deliver an undeliverable pizza");
  }

  public void eat() {
    System.out.println("Kitchen staff enjoying pizza");
  }
  public void mistake() {
    System.out.println("Pizza is already undeliverable");
  }
}
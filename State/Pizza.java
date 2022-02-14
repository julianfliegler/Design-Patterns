public class Pizza {
  State Cooked;
  State Baked;
  State Delivered;
  State Undeliverable;
  State state;

  public Pizza(){
    System.out.println("Creating a pizza");
    Cooked = new Cooked(this);
    Baked = new Baked(this);
    Delivered = new Delivered(this);
    Undeliverable = new Undeliverable(this);
    state = Cooked;
  } 

  public void bake(){
    state.bake();
  }
  public void deliver(){
    state.deliver();
  }
  public void eat(){
    state.eat();
  }
  public void mistake(){
    state.mistake();
  }

  public void setState(State newState){
    this.state = newState;
  }

  public State getCooked(){
    return Cooked;
  }
  public State getBaked(){
    return Baked;
  }
  public State getDelivered(){
    return Delivered;
  }
  public State getUndeliverable(){
    return Undeliverable;
  }
}
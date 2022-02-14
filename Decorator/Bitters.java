public class Bitters extends LiquorDecorator{
  public Bitters(Liquor liquorType){
    this.liquorType = liquorType;
  }
  public double calories(){
    return 20.0 + liquorType.calories();
  }
  public String getDescription(){
    return liquorType.getDescription() + ", 1 dash Bitters";
  }
}
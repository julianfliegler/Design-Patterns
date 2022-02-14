public class Vermouth extends LiquorDecorator{
  public Vermouth(Liquor liquorType){
    this.liquorType = liquorType;
  }
  public String getDescription(){
    return liquorType.getDescription() + "1 oz Vermouth";
  }
  public double calories(){
    return 40.0 + liquorType.calories();
  }
}
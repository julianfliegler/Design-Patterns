public class Lime extends LiquorDecorator {
  public Lime(Liquor liquorType){
    this.liquorType = liquorType;
  }

  public String getDescription(){
    return liquorType.getDescription() + ", 1 Lime";
  }

  public double calories(){
    return 2 + liquorType.calories();
  }
}
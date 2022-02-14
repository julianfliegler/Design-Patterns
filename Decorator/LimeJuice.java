public class LimeJuice extends LiquorDecorator {
  public LimeJuice(Liquor liquorType){
    this.liquorType = liquorType;
  }

  public String getDescription(){
    return liquorType.getDescription() + ", 1 oz Lime Juice";
  }

  public double calories(){
    return 8 + liquorType.calories();
  }
}
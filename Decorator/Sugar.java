public class Sugar extends LiquorDecorator {
  public Sugar(Liquor liquorType){
    this.liquorType = liquorType;
  }

  public String getDescription(){
    return liquorType.getDescription() + ", 1 tsp Sugar";
  }

  public double calories(){
    return 300 + liquorType.calories();
  }
}
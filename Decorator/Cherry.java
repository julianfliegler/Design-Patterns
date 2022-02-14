public class Cherry extends LiquorDecorator {
  public Cherry(Liquor liquorType){
    this.liquorType = liquorType;
  }

  public String getDescription(){
    return liquorType.getDescription() + ", 1 Cherry";
  }

  public double calories(){
    return 40 + liquorType.calories(); 
  }
}
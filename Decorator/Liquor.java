public abstract class Liquor{
  String description = "Unknown Liquor";

  public String getDescription(){
    return description;
  }

  public abstract double calories();
}
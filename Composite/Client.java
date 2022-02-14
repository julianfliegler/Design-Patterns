public class Client{
  public CompositeModel models;

  public Client(CompositeModel models){
    this.models = models;
  }

  public float printVolume(){
    return models.getVolume();
  }
}
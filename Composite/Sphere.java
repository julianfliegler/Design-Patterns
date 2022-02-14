public class Sphere extends BaseModel{
  public float radius;

  public Sphere(float r){
    radius = r;

    System.out.println("Rendering sphere with radius " + radius);
  }

  public float getVolume(){
    return 3.14159f * radius * radius * radius * (4 / 3);
  }
}
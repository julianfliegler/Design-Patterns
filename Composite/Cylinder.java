public class Cylinder extends BaseModel{
  public float height;
  public float radius;

  public Cylinder(float h, float r){
    height = h;
    radius = r;

    System.out.println("Rendering cylinder with radius " + radius + " and height " + height);
  }

  public float getVolume(){
    return 3.14159f * radius * radius * height;
  }
}
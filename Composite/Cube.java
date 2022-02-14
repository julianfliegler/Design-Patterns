public class Cube extends BaseModel{
  public float x_len;
  public float y_len;
  public float z_len;

  public Cube(float x, float y, float z){
    x_len = x;
    y_len = y;
    z_len = z;

    System.out.println("Rendering cube with dimensions " + x_len + " x " + y_len + " x " + z_len);
  }

  public float getVolume(){
    return x_len * y_len * z_len;
  }
}
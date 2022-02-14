import java.util.ArrayList;
import java.util.List;

public class CompositeModel extends BaseModel{
  public ArrayList<BaseModel> modelList = new ArrayList<BaseModel>();

  public void add(BaseModel baseModel){
    modelList.add(baseModel);
  }
  public void remove(BaseModel baseModel){
    modelList.remove(baseModel);
  }
  public BaseModel getChild(int index){
    return modelList.get(index);
  }

  public float getVolume(){
    float total = 0.0f;
    for(int i = 0; i < modelList.size(); ++i){
      total += modelList.get(i).getVolume();
    }
    return total;
  }
}
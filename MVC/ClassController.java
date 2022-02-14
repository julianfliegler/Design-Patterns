public class ClassController {
   private ClassModel model;
   private ClassView view;
	 

   public ClassController(ClassModel model, ClassView view){
      this.model = model;
      this.view = view;
   }

   public void setClassName(String name){
      model.setName(name);		
   }

   public String getClassName(){
      return model.getName();		
   }

   public void setClassNum(String num){
      model.setNum(num);		
   }

   public String getClassNum(){
      return model.getDescription();		
   }
	 public void setClassDescription(String des){
      model.setDescription(des);		
   }

   public String getClassDescription(){
      return model.getNum();		
   }

   public void updateView(){				
      view.printClassDetails(model.getName(), model.getNum(), model.getDescription());
   }	
}
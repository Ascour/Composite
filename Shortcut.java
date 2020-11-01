public class Shortcut implements Unit{  
  
    private String name;  
    private double size; 
    private String pathName;
   public Shortcut(String name,double size, String pathName)  {    
       this.name = name;  
       this.size= size; 
       this.pathName = pathName;
   }  
   @Override  
   public void add(Unit Unit) {  
       //this is leaf node so this method is not applicable to this class.  
   }  
   @Override  
   public Unit getUnit(int i) {  
       //this is leaf node so this method is not applicable to this class.  
       return null;  
   }  
   @Override  
   public String getName() {  
       return name;  
   }  
   @Override  
   public double getSize() {  
       return size;  
   }  
   public String getPathName() {
	   return pathName;
   }
   @Override  
   public void printInfo() {  
       System.out.println("=========================");    
       System.out.println("Name ="+getName());  
       System.out.println("Size ="+getSize());  
       System.out.println("The original file's path is ="+getPathName());  
       System.out.println("=========================");  
   }  
  @Override  
   public void remove(Unit Unit) {  
       //this is leaf node so this method is not applicable to this class.  
   }  
}  
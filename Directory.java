// this is Composite.  
import java.util.ArrayList;  
import java.util.Iterator;  
import java.util.List;  
public class Directory implements Unit {  
     private String name;    
  
     public Directory(String name) {        
      this.name = name;   
     }  
     List<Unit> Units = new ArrayList<Unit>();  
     @Override  
     public void add(Unit Unit) { 
    	int nameExists = 0;
    	Iterator<Unit> it = Units.iterator();
    	while(it.hasNext()) {
    		Unit Unit1 = it.next(); 
    		if(Unit.getName() == Unit1.getName()) {
    			nameExists = 1;
    		}
    	}
    	if(nameExists == 0) {
    		Units.add(Unit);
    	}
    	else {
    		System.out.println("This name is already used");
    	}
     }  
     @Override  
     public Unit getUnit(int i) {  
      return Units.get(i);  
     }  
     @Override  
     public void remove(Unit Unit) {  
      Units.remove(Unit);  
     }    
     @Override  
     public String getName() {  
      return name;  
     }  
    @Override  
     public double getSize() {  
      double fileSize = 0;
      Iterator<Unit> it = Units.iterator();  
      
      while(it.hasNext())  {  
        Unit Unit = it.next();  
        fileSize += Unit.getSize();
     }  
      return fileSize;
     }  
     @Override  
     public void printInfo() {  
      System.out.println("==========================");   
      System.out.println("Name ="+getName());  
      System.out.println("Size ="+getSize());  
      System.out.println("==========================");  
        
      Iterator<Unit> it = Units.iterator();  
        
          while(it.hasNext())  {  
            Unit Unit = it.next();  
            Unit.printInfo();  
         }  
     }  
} 
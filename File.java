public  class File implements Unit{  
      
        private String name;  
        private double size;  
        public File(String name,double size)  {    
            this.name = name;  
            this.size = size;  
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
        @Override  
        public void printInfo() {  
            System.out.println("==========================");  
            System.out.println("Name ="+getName());  
            System.out.println("Size ="+getSize());  
            System.out.println("==========================");  
        }  
        @Override  
        public void remove(Unit Unit) {  
            //this is leaf node so this method is not applicable to this class.  
        }  
}
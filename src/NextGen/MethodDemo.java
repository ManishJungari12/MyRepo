package NextGen;

public class MethodDemo {

	public static void main(String[] args) {

		// Call the Method in main block via creating the object of class
		   MethodDemo m = new MethodDemo();
		   m.GetDemo();
		   String name = m.GetDemo1();
		   System.out.println(name);
		   
		   // Method call from another class "MethodDemo2"
		   
		   MethodDemo2 m2 = new MethodDemo2();
		   m2.getDemoNewClass();
		   
		 //  Calling ststic method
		   
		 String m3 = getDataStatic();
		   System.out.println(m3);
		   
	}

	   // Create method:- Method always create outside the main block

	      public void GetDemo() {
	      System.out.println("Hello world");
    
	}
	      
	      public String GetDemo1()
	      {
			return "Rahul";
	    	 
	      }
	      
	      //  Creating a ststic method and call it. 
	      
	      public static String getDataStatic() {
			  return "Call Static method without creating object";
	    	  
	      }
	      
	      
	      
	      

}

package oops;

public class polyOverrideChild extends polyOverriding {
	//child
	 public void empName()
	 {
	 	System.out.println("Emp name is:abi");
	 }
	     public void empId()
	 {
	 	System.out.println("emp id is:124");
	 }
	     public void detsils()
	     {
	    	 System.out.println("this is overriding");
	     }
	     public static void main(String[] args) {
	    	 
	    	 polyOverrideChild obj=new polyOverrideChild();
	    	 obj.empId();
	    	 obj.empName();
	    	 obj.detsils();
		}
	     
   
}

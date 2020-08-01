package oops;

public class multilevelInh extends multilevelInheritance {
	 public void salName()
	 {
	 	System.out.println("sal name is:mahi");
	 }
	     public void salId()
	 {
	 	System.out.println("sal id is:1231");
	 }
	     public static void main(String[] args) {
	    	 multilevelInh ooo=new  multilevelInh();
	    	 ooo.comId();
	    	 ooo.comName();
	    	 ooo.empId();
	    	 ooo.empName();
	    	 ooo.salId();
	    	 ooo.salName();
			
		}
	 

}

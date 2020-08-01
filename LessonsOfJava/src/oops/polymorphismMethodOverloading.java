package oops;

public class polymorphismMethodOverloading {
	
		public void empDetails(int a)
		{
		System.out.println("employee id:"+a);	
		}
		public void empDetails(String name) {
			System.out.println("employee name:"+name);
		}
	     public static void main(String[] args) {
	    	 polymorphismMethodOverloading ob=new polymorphismMethodOverloading();
	    	 ob.empDetails(100);
	    	 ob.empDetails("mahi");
	    			 
			
		}
		
	}


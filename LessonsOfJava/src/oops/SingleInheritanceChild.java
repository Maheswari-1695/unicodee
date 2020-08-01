package oops;

public class SingleInheritanceChild extends  SingleInheritance {
	//child
	
		public void comName () 
		{
			System.out.println("company name is: info");
		}
		public void comId () 
		{
			System.out.println("company id is: 354");
		}
		public static void main(String[] args) {
		SingleInheritanceChild ob=new SingleInheritanceChild();
		ob.comId();
		ob.comName();
		ob.empId();
		ob.empName();
	}
}

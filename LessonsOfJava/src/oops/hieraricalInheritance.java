package oops;

public class hieraricalInheritance extends SingleInheritance {
	// parent1
	public void salary()
	{
		System.out.println("salary :2450");
		
	}
	public static void main(String[] args) {
		hieraricalInheritance o=new hieraricalInheritance();
		
				o.empId();
		o.empName();
		o.salary();
	}

}

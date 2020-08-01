package course1;



public class employeeDetails extends Simple{
	
	public void empName() {
		System.out.println("employee name:mahi");
	}
	public void empSal()
	{
		System.out.println("employee salary:25000");
		
	}
	public void empoverTimeCharge( ) {
		System.out.println("employee charge 300000");
	}
	public static void main(String[] args) {
		employeeDetails obj=new employeeDetails();
		obj.empId();
		obj.empName();
		obj.empSal(); 
		obj.empoverTimeCharge();
	}

	


}
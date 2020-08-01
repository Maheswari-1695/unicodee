package constructor;



public class constructor {
	int empId;
    String ceo;
	long phno;
	float sal;
	public constructor() {
		System.out.println(empId +"  "+ ceo +"  "+ phno +"   "+ sal);
	}
	public constructor(int id) {
		empId=123;
		ceo="mahi";
		phno=113213464l;
		sal=25000f;
		System.out.println(empId +"  "+ ceo +"  "+ phno +"   "+ sal);
	}
	public static void main(String[] args) {
		new constructor();
		new constructor(123);
		
	

	}

}

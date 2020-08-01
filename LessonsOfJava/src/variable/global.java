package variable;

public class global {
	int id;
	String name;
	float number;
	public void show() {
		
		System.out.println(id+"  " + name+ "   "+ number );
	}
	public static void main(String[] args) {
		
	
	staticVariable o=new staticVariable();
	o.name="mahi";
	o.id=5654;
	o.number=556464;
     o.show();	


}}

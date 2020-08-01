package variable;

public class staticVariable {
	int id;
	static String name;
	float number;
	public void show() {
		
		System.out.println(id+"  " + name+ "   "+ number );
	}
	public static void main(String[] args) {
		
	staticVariable.name="mahi";
	staticVariable o=new staticVariable();

	o.id=5654;
	o.number=556464;
     o.show();	
     staticVariable oo=new staticVariable();
     oo.id=4654;
     oo.number=5446;
     o.show();
     staticVariable ooo=new staticVariable();
     ooo.show();
     
     
     

}}

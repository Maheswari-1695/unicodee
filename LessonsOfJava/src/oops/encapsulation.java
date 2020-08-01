package oops;

public class encapsulation{
	private int id;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static void main(String[] args) {
		encapsulation o=new encapsulation();
		o.setId(153);
       o.setName("mahi");
       int id =o.getId();{
    	   System.out.println(id);
       }
       String name=o.getName();{
    	   System.out.println(name);
       }
       
}

}
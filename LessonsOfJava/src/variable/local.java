package variable;

public class local {
	public void show() {
		int a =12;
		String name="mahi";
		float num=24543134f;
		
		System.out.println(a+"   "+ name+"   "+ num);
	}
	public static void main(String[] args) {
		local oo=new local();
		oo.show();
		
	}
}

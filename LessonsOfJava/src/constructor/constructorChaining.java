package constructor;



public class constructorChaining {
	
		public constructorChaining() {
			this("mahi");
			System.out.println("default construct===");
		}
		public constructorChaining(int id) {
			System.out.println("para id construct==="+id);
		}
		public constructorChaining(String name) {
			this(1234f,12316546546l);
			System.out.println("para name construct=="+name);
			
		}
		public constructorChaining(float sal,long phno) {
			this("mahisweety918@gmail.com",1512523f);
			System.out.println("para sal construct==="+ sal +"   "+ phno);
			
		}
		public constructorChaining(String mail,float axes) {
			this(1416);
			System.out.println("para mail construct=="+ mail+"   "+axes);
		}
		public static void main(String[] args) {
			new constructorChaining();
			
		}
		
		}
		


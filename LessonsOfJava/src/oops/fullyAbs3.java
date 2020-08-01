package oops;

public class fullyAbs3  implements fullyAbstraction,fullyAbs2 {
	
		//child
		public void details()
		{
			System.out.println("bank details");
		}
		public void saving()
		{
			System.out.println("client savings");
		}
		public void mutual()
		{
			System.out.println("mutual fund ");
		}
		public static void main(String[] args) {
			fullyAbs3 o= new fullyAbs3();
			o.details();
			o.saving();
			o.mutual();
		}
		
		

}

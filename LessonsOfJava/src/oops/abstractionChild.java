package oops;

public  class abstractionChild extends abstraction{
	public  void details () {
		System.out.println("bank details");
	}
	
	
	public  void savings() {
		System.out.println("client savings");
	}
	public void information() {
		System.out.println("this is over riding");
	}
		public static void main(String[] args) {
			abstractionChild ob=new abstractionChild();
			ob.details();
			ob.fixed();
			ob.savings();
			ob.information();
		}

}

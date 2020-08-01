package Examples;

public class ReverseANumber {

	public static void main(String[] args) {
		
		int a=446745535;
		int i=0,j=0;
		while(a>0)
		{
			i=a%10;     //5  3  4
			
			j=(j*10)+i;   //5+3+4
			
			a=a/10;       //43   4   0
		}
		
		  System.out.println(j);
		
	}
}

import java.util.Scanner;

public class test8 {
	public static void main(String[] args) {
		
		
		
		int a=20,n=10,i=10,j=10;
		a=n;
		while (a>0)
		{
			i=a%10;//0
			j=(j*10)+i;//50
			a=a/10;//2
			
		}
		System.out.println("the reverse num is:"+j);
	}


}

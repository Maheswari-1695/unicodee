import java.util.Scanner;

public class test7 {
	public static void main(String[] args) {
		int n,a,i=0,j=0;
		Scanner an=new Scanner(System.in);
		System.out.println("Enter the palindrome number");
		n=an.nextInt();
		a=n;
		while (a>0)
		{
			i=a%10;
			j=(j*10)+i;
			a=a/10;
			
		}
		if(n==j) {
			System.out.println("palindrome");
		} 
		else{
			System.out.println("Not a palindrome number");
		}
	}

}

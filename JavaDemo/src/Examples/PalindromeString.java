package Examples;

import java.util.Scanner;

public class PalindromeString {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the string:");
	String str=sc.next();
	String or=str;
	String rev="  ";
	int len=str.length();
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
		
	}
	if(str.equals(rev)) {
		System.out.println(or+"palindrome");
	}
	else {
		System.out.println(or  +   "not a palindrome");
	}
	
}
}

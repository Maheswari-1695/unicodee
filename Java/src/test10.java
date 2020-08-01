import java.lang.reflect.Array;
import java.util.Arrays;

public class test10 {
public static void main(String[] args) {
	int a[]=new int[6];
	a[0]=10;
	a[1]=20;
	a[2]=30;
	a[3]=40;
	a[4]=50;
	a[5]=60;
	
	int length=a.length;
	System.out.println(length);
   System.out.println("normal for===");	
   for(int i=0;i<a.length;i++) {
	   System.out.println(a[i]);
   }
   
   System.out.println("enhanced for ===");
   for (int x:a) {
	   System.out.println(x);
	   
   }
   System.out.println("for each===");
   Arrays.stream(a).forEach(System.out::println);

}

}